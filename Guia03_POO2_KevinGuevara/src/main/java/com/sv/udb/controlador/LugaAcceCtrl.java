/**
 * @author Kevin Guevara Tolentino
 * @version 0.01 Alpha
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.LugaAcce;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Controlador LugaAcce, que pertenece a la tabla: luga_acce
 */
public class LugaAcceCtrl {
    private final String pool; 
/**
 * Constructor, usado para instanciar un objeto y definir el pool de conexiones automáticamente
 * @see LugaAcceCtrl()
 */
    public LugaAcceCtrl() {
        this.pool = "jpool";
        
    }
/**
 * Método guardar, sirve para guardar un objeto del tipo LugaAcce dentro de la base de datos
 * @param obj de tipo LugaAcce
 * @return resp, de tipo boolean, para verificar si se ejecuto correctamente el método
 * @see guardar()
 */
    public boolean guardar(LugaAcce obj)
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
 * Método consTodo, sirve consultar todos los registros de la base de datos, para guardarlos y retornarlos en una lista de objetos de tipo LugaAcce
 * @return resp, de tipo List:LugaAcce , lista de objetos
 * @see consTodo()
 */    
     public List<LugaAcce>  consTodo()
    {
        List<LugaAcce> resp = new ArrayList<>();
          EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
           EntityManager em = emf.createEntityManager();
        try
        {
          TypedQuery<LugaAcce> query =em.createNamedQuery("LugaAcce.findAll", LugaAcce.class);
           resp = query.getResultList();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return resp;
       
    }
/**
 * Método modificar, sirve para modificar un objeto del tipo LugaAcce dentro de la base de datos(se uza tamien para "eliminar" haciendo cambio del estado del registro)
 * @param obj de tipo LugaAcce
 * @return resp, de tipo boolean, para verificar si se ejecuto correctamente el método
 * @see modificar()
 */     
        public boolean modificar(LugaAcce obj)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
         LugaAcce lugar = null;
        tx.begin();
        try
        {
            
            lugar = em.find(LugaAcce.class, obj.getCodiLugaAcce());
            lugar.setNombLugaAcce(obj.getNombLugaAcce());
            lugar.setEsta(obj.getEsta());
            lugar.setFechAlta(obj.getFechAlta());
            obj.setFechBaja(obj.getFechBaja());
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            System.out.println("ERROR: " +ex);
            //tx.rollback();
            resp = false;
        }
        em.close();
        emf.close();
        return resp;
    }
    
/**
 * Método eliminar, sirve para eliminar permanentemete un objeto del tipo LugaAcce dentro de la base de datos(no se usa)
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
        LugaAcce respo = null;
        try{
            respo = em.find(LugaAcce.class, empId);
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
 * Método cons, sirve para consultar un objeto del tipo LugaAcce dentro de la base de datos, tomando como parametro su id, o "Código"
 * @param empId de tipo Long
 * @return resp, de tipo LugaAcce, objeto resultado de la consulta realizada a partir de su id
 * @see cons(Long)
 */      
    public LugaAcce cons(Long empId){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pool);
        EntityManager em = emf.createEntityManager();
        LugaAcce resp = null;
        
        try{
            resp = em.find(LugaAcce.class, empId);
            
        }catch(Exception e){
            e.printStackTrace();
        }                
        return resp;
    }
}
