/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring.construct;

import com.mycompany.spring.domain.Yazi;
import com.mycompany.spring.repository.IYaziServisi;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author MstfDryl
 */
@Component(value="yaziConstruct")
@Scope(value="request")
public class YaziConstruct {
    
    @Autowired
    IYaziServisi servis;
    Yazi yazi = new Yazi();
    List<Yazi> yaziListesi = new ArrayList();
    
    @PostConstruct
    private void yazilariYukle(){
        yaziListesi = servis.tumYazilar();
    }
    
    public String yaziEkle(){
        servis.kaydet(yazi);
        yaziListesi=servis.tumYazilar();
        return "index.xhtml";
    }

    public Yazi getYazi() {
        return yazi;
    }

    public void setYazi(Yazi yazi) {
        this.yazi = yazi;
    }

    public List<Yazi> getYaziListesi() {
        return yaziListesi;
    }

    public void setYaziListesi(List<Yazi> yaziListesi) {
        this.yaziListesi = yaziListesi;
    }
    
    
    
}
