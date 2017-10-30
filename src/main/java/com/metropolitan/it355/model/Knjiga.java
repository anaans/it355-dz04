package com.metropolitan.it355.model;

public class Knjiga {
    private String naziv;
    private String pisac;
    private int godina;

    public Knjiga() {
    }

    public Knjiga(String naziv, String pisac, int godina) {
        this.naziv = naziv;
        this.pisac = pisac;
        this.godina = godina;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getPisac() {
        return pisac;
    }

    public int getGodina() {
        return godina;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setPisac(String pisac) {
        this.pisac = pisac;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    @Override
    public String toString() {
        return "Knjiga{" + "naziv=" + naziv + ", pisac=" + pisac + ", godina=" + godina + '}';
    }

}