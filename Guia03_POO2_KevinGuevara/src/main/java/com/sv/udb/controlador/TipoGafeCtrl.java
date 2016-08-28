/**
 * @author Kevin Guevara Tolentino
 * @version 0.01 Alpha
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.TipoGafe;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Controlador TipoGafe, que pertenece a la tabla: tipo_gafe
 */
public class TipoGafeCtrl {
    private final String pool; 
/**
 * Constructor, usado para instanciar un objeto y definir el pool de conexiones automáticamente
 * @see TipoGafeCtrl()
 */
    public TipoGafeCtrl() {
        this.pool = "jpool";
    }
/**
 * Método guardar, sirve para guardar un objeto del tipo TipoGafe dentro de la base de datos
 * @param obj de tipo TipoGafe
 * @return resp, de tipo boolean, para verificar si se ejecuto correctamente el método
 * @see guardar()
 */
    public boolean guardar(TipoGafe obj)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try
        {
            em.persist(obj);
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            /*tx.rollback();
            ex.printStackTrace();*/
            System.out.println("ERROR "+ex);
        }
        finally
        {
            em.close();
            emf.close();            
        }
        return resp;
    }
/**
 * Método consTodo, sirve consultar todos los registros de la base de datos, para guardarlos y retornarlos en una lista de objetos de tipo TipoGafe
 * @return resp, de tipo List:TipoGafe , lista de objetos
 * @see consTodo()
 */      
     public List<TipoGafe>  consTodo()
    {
        List<TipoGafe> resp = new ArrayList<>();
          EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
          EntityManager em = emf.createEntityManager();
        try
        {
          TypedQuery<TipoGafe> query =em.createNamedQuery("TipoGafe.findAll", TipoGafe.class);
           resp = query.getResultList();
        }
        catch(Exception ex)
        {
            System.out.println("ERROR: "+ex.getMessage());
        }
        return resp;
       
    }
/**
 * Método modificar, sirve para modificar un objeto del tipo TipoGafe dentro de la base de datos(se uza tamien para "eliminar" haciendo cambio del estado del registro)
 * @param obj de tipo TipoGafe
 * @return resp, de tipo boolean, para verificar si se ejecuto correctamente el método
 * @see modificar()
 */  
        public boolean modificar(TipoGafe obj)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
         TipoGafe tipo = null;
        tx.begin();
        try
        {
            
            tipo = em.find(TipoGafe.class, obj.getCodiTipoGafe());
            tipo.setNombTipoGafe(obj.getNombTipoGafe());
            tipo.setEsta(obj.getEsta());
            tipo.setFechAlta(obj.getFechAlta());
            obj.setFechBaja(obj.getFechBaja());
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            System.out.println("ERROR: " +ex);
            tx.rollback();
            resp = false;
        }
        em.close();
        emf.close();
        return resp;
    }
    
/**
 * Método eliminar, sirve para eliminar permanentemete un objeto del tipo TipoGafe dentro de la base de datos(no se usa)
 * @param empId de tipo Long
 * @return resp, de tipo boolean, para verificar si se ejecuto correctamente el método
 * @deprecated No se aconseja su uso, es preferible cambiar el estado del registro con el método modificar()
 * @see eliminar()
 */  
    public boolean eliminar(Long empId)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();       
        tx.begin();
        TipoGafe respo = null;
        try{
            respo = em.find(TipoGafe.class, empId);
            if(respo != null)
            {
                em.remove(respo);
                tx.commit();
                resp = true; 
            }
        }catch(Exception e){
            tx.rollback();
        }
        em.close();
        emf.close();
        return resp;
    }
/**
 * Método cons, sirve para consultar un objeto del tipo TipoGafe dentro de la base de datos, tomando como parametro su id, o "Código"
 * @param empId de tipo Long
 * @return resp, de tipo TipoGafe, objeto resultado de la consulta realizada a partir de su id
 * @see cons(Long)
 */ 
    public TipoGafe cons(Long empId){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
        EntityManager em = emf.createEntityManager();
        TipoGafe resp = null;
        
        try{
            resp = em.find(TipoGafe.class, empId);
            
        }catch(Exception e){
            e.printStackTrace();
        }                
        return resp;
    }
}
