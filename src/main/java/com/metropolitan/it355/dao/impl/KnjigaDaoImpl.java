/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.dao.impl;
   import com.metropolitan.it355.dao.KnjigaDao;
/**
 *
 * @author ana
 */
    
 
public class KnjigaDaoImpl implements KnjigaDao {
    
@Override 
public void addKnjiga() {
    System.out.println("Dodavanje knjiga..."); 
}
@Override 
public String addKnjigaRet() {
    System.out.println("Dodavanje knjiga i vracanje vrednosti..."); 
    return "Dodato uspesno!"; 
}
@Override 
public void addKnjigaThrowException() throws Exception { 
    System.out.println("Dodavanje knjiga i izbacivanje izuzetka...");
    throw new Exception("Generic Exception");
}
@Override
public void addKnjigaAround(String naziv) {
    System.out.println("Dodavanje knjiga sa nazivom: " + naziv);
}

    
    }



