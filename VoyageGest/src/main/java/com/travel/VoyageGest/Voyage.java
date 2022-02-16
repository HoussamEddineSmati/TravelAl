package com.travel.VoyageGest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Voyage {

    private Long idvoyage ;
    private Long idtrajet;
    private String lieud;
    private String dest;
    private String dated;
    private String datedes;
    private String company;

    public Voyage() {
    }

    public Voyage(Long idvoyage, Long idtrajet, String lieud, String dest, String dated, String datedes, String company) {
        super();
        this.idvoyage = idvoyage;
        this.idtrajet = idtrajet;
        this.lieud = lieud;
        this.dest = dest;
        this.dated = dated;
        this.datedes = datedes;
        this.company = company;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdvoyage() {
        return idvoyage;
    }

    public void setIdvoyage(Long idvoyage) {
        this.idvoyage = idvoyage;
    }

    public Long getIdTrajet() {
        return idtrajet;
    }

    public void setIdTrajet(Long idtrajet) {
        this.idtrajet = idtrajet;
    }

    public String getLieud() {
        return lieud;
    }

    public void setLieud(String lieud) {
        this.lieud = lieud;
    }

    public String getdest() {
        return dest;
    }

    public void setdest(String dest) {
        this.dest = dest;
    }

    public String getdated() {
        return dated;
    }

    public void setdated(String dated) {
        this.dated = dated;
    }

    public String getdatedes() {
        return datedes;
    }

    public void setdatedes(String datedes) {
        this.datedes = datedes;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
