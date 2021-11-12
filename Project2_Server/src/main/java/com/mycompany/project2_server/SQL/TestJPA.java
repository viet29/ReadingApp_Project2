/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_server.SQL;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Do_Do
 */
public class TestJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ReadingJPA");
        EntityManager em = emf.createEntityManager();
        Query nq = em.createNamedQuery("User.findAll");
        List l = nq.getResultList();
        System.out.println("List size: " + l.size());
        
        
        
        
        
    }
}



















