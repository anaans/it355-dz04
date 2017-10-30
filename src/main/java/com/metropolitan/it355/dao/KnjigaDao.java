/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.dao;

/**
 *
 * @author ana
 */
public interface KnjigaDao {
    public void addKnjiga();
    public String addKnjigaRet();
public void addKnjigaThrowException() throws Exception;
public void addKnjigaAround(String naziv);
}

