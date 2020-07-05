/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
public class surucu extends kalıtım_veren{
    
    ///private int srctc;
    //private String srcad;
    //private String srcsoyad;
    
     
   
    private String srckayit;
   
    private String srcehliyet;
    private int ucret;
    
    
    
    public surucu(int srctc,String srcad,String srcsoyad,String srckayit,String srcehliyet,int ucret)
    {
        // this.srctc = srctc;
        //this.srcad = srcad;
        // this.srcsoyad = srcsoyad;
     
        super(srctc, srcad, srcsoyad);
        this.srckayit = srckayit;
   
        this.srcehliyet = srcehliyet;
        this.ucret = ucret;
        
        
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }
    //public int getSrctc() {
        //return srctc;
    //}

    //public void setSrctc(int srctc) {
        //this.srctc = srctc;
    //}

    //public String getSrcad() {
     //   return srcad;
    //}

    //public void setSrcad(String srcad) {
        //this.srcad = srcad;
    //}

    //public String getSrcsoyad() {
     //   return srcsoyad;
    //}

    //public void setSrcsoyad(String srcsoyad) {
     //   this.srcsoyad = srcsoyad;
   // }

   

    public String getSrckayit() {
        return srckayit;
    }

    public void setSrckayit(String srckayit) {
        this.srckayit = srckayit;
    }

   

    public String getSrcehliyet() {
        return srcehliyet;
    }

    public void setSrcehliyet(String srcehliyet) {
        this.srcehliyet = srcehliyet;
    }

   
    
}
