/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring.repository;

import com.mycompany.spring.domain.Yazi;
import java.util.List;

/**
 *
 * @author MstfDryl
 */
public interface IYaziServisi {
    
    public String kaydet(Yazi yazi);
    
    public List<Yazi> tumYazilar();
    
    public Yazi suYazar(String yazar);
    
    public void sil(Yazi yazi);
    
    public void guncelle(Yazi yazi);
}
