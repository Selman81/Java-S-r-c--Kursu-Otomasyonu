/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

public class kalıtım_veren {
    private int srctc;
    private String srcad;
    private String srcsoyad;
    
    
    public kalıtım_veren(int srctc,String srcad,String srcsoyad)
    {
        this.srctc = srctc;
        this.srcad = srcad;
        this.srcsoyad = srcsoyad;
     
        
        
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
