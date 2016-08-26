/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 *
 * @author REGISTRO
 */
public class TipoGafeCtrl {
    private final String pool; 

    public TipoGafeCtrl() {
        this.pool = "jpool";
    }
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
