/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 *
 * @author REGISTRO
 */
public class TipoDocuCtrl {
    private final String pool; 

    public TipoDocuCtrl() {
        this.pool = "jpool";
    }
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
