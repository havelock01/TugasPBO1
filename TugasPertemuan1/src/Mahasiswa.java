/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class Mahasiswa {
    String nama, nim;
    int usia;
    double nilaiUts, nilaiUas;
    
    public Mahasiswa(String nama, String nim, int usia, double uts, double uas){
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.nilaiUts = uts;
        this.nilaiUas = uas;
    }
    
    double hitungScore(){
        return (nilaiUts+nilaiUas)/2;
    }
    
}

/* Nama saya : Muhammad Rizqi
   NIM saya  : 123190083
   Plug saya : E 
Referensi : 1. https://kodedasar.com/aturan-penulisan-java/ 
            2. https://www.petanikode.com/java-file/
            3. Saran dari temen*/