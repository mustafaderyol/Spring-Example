/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring.repository;

import com.mycompany.spring.domain.Yazi;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author MstfDryl
 */
@Repository
@Transactional(readOnly = true)
public class YaziServisi implements IYaziServisi {
    @PersistenceContext
    EntityManager em;
    
    @Override
    public String kaydet(Yazi yazi){
        em.persist(yazi);
        em.flush();
        return "/index.xhtml";
    }
    
    @Override
    public List<Yazi> tumYazilar(){
        Query sorgu = em.createNamedQuery("tumYazilar");
        return sorgu.getResultList();
    }
    
    @Override
    public Yazi suYazar(String yazar){
        return em.find(Yazi.class, yazar);
    }
    
    @Override
    public void sil(Yazi yazi){
        em.remove(yazi);
    }
    
    @Override
    public void guncelle(Yazi yazi){
        em.merge(yazi);
    }
}
