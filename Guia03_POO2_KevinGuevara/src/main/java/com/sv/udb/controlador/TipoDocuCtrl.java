/**
 * @author Kevin Guevara Tolentino
 * @version 0.01 Alpha
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.TipoDocu;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Controlador TipoDocu, que pertenece a la tabla: tipo_docu
 */
public class TipoDocuCtrl {
    private final String pool; 
/**
 * Constructor, usado para instanciar un objeto y definir el pool de conexiones automáticamente
 * @see TipoDocuCtrl()
 */
    public TipoDocuCtrl() {
        this.pool = "jpool";
    }
/**
 * Método guardar, sirve para guardar un objeto del tipo TipoDocu dentro de la base de datos
 * @param obj de tipo TipoDocu
 * @return resp, de tipo boolean, para verificar si se ejecuto correctamente el método
 * @see guardar()
 */
    public boolean guardar(TipoDocu obj)
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
 * Método consTodo, sirve consultar todos los registros de la base de datos, para guardarlos y retornarlos en una lista de objetos de tipo TipoDocu
 * @return resp, de tipo List:TipoDocu , lista de objetos
 * @see consTodo()
 */  
     public List<TipoDocu>  consTodo()
    {
        List<TipoDocu> resp = new ArrayList<>();
          EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
          EntityManager em = emf.createEntityManager();
        try
        {
          TypedQuery<TipoDocu> query =em.createNamedQuery("TipoDocu.findAll", TipoDocu.class);
           resp = query.getResultList();
        }
        catch(Exception ex)
        {
            System.out.println("ERROR: "+ex.getMessage());
        }
        return resp;
       
    }
/**
 * Método modificar, sirve para modificar un objeto del tipo TipoDocu dentro de la base de datos(se uza tamien para "eliminar" haciendo cambio del estado del registro)
 * @param obj de tipo TipoDocu
 * @return resp, de tipo boolean, para verificar si se ejecuto correctamente el método
 * @see modificar()
 */    
        public boolean modificar(TipoDocu obj)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
         TipoDocu tipo = null;
        tx.begin();
        try
        {
            
            tipo = em.find(TipoDocu.class, obj.getCodiTipoDocu());
            tipo.setNombTipoDocu(obj.getNombTipoDocu());
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
 * Método eliminar, sirve para eliminar permanentemete un objeto del tipo TipoDocu dentro de la base de datos(no se usa)
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
        TipoDocu respo = null;
        try{
            respo = em.find(TipoDocu.class, empId);
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
 * Método cons, sirve para consultar un objeto del tipo TipoDocu dentro de la base de datos, tomando como parametro su id, o "Código"
 * @param empId de tipo Long
 * @return resp, de tipo TipoDocu, objeto resultado de la consulta realizada a partir de su id
 * @see cons(Long)
 */      
    public TipoDocu cons(Long empId){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
        EntityManager em = emf.createEntityManager();
        TipoDocu resp = null;
        
        try{
            resp = em.find(TipoDocu.class, empId);
            
        }catch(Exception e){
            e.printStackTrace();
        }                
        return resp;
    }
}
