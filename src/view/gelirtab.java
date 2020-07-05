/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

public class gelirtab {
    
    private int srctc;
    private String srcad;
    private String srcsoyad;
    
   
   
    private int ucret;
    
    public gelirtab(int srctc,String srcad,String srcsoyad,int ucret)
    {
        this.srctc = srctc;
        this.srcad = srcad;
        this.srcsoyad = srcsoyad;
     
    
        
        this.ucret = ucret;
        
        
    }
    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }
    public int getSrctc() {
        return srctc;
    }

    public void setSrctc(int srctc) {
        this.srctc = srctc;
    }

    public String getSrcad() {
        return srcad;
    }

    public void setSrcad(String srcad) {
        this.srcad = srcad;
    }

    public String getSrcsoyad() {
        return srcsoyad;
    }

    public void setSrcsoyad(String srcsoyad) {
        this.srcsoyad = srcsoyad;
    }

    
}
