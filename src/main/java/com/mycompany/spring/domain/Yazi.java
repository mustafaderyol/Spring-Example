/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author MstfDryl
 */
@Entity(name="YAZILAR")
@NamedQueries({
    @NamedQuery(name="tumYazilar", query="SELECT b FROM YAZILAR b ORDER BY b.yaziNo DESC")
})
public class Yazi {
    
    @Column(name="yaziNo")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long yaziNo;
    
    @Column(name="yazar", nullable=false)
    private String yazar;
    
    @Column(name="tarih", nullable=false)
    private String tarih;
    
    @Column(name="yazi")
    private String yazi;

    public Yazi() {
    }

    public Yazi(String yazar, String tarih, String yazi) {
        this.yazar = yazar;
        this.tarih = tarih;
        this.yazi = yazi;
    }

    public Long getYaziNo() {
        return yaziNo;
    }

    public void setYaziNo(Long yaziNo) {
        this.yaziNo = yaziNo;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getYazi() {
        return yazi;
    }

    public void setYazi(String yazi) {
        this.yazi = yazi;
    }
    
    
}
