/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


public class personel {
    
    private int pertc;
    private String perad;
    private String persoyad;
    private String pergorev;
    private int ucret;
    
    
    
    public personel(int pertc,String perad,String persoyad,String pergorev,int ucret)
    {
        this.pertc = pertc;
        this.perad = perad;
        this.persoyad = persoyad;
     
    
        this.pergorev = pergorev;
   
        this.ucret = ucret;
        
    }

    public int getPertc() {
        return pertc;
    }

    public void setPertc(int pertc) {
        this.pertc = pertc;
    }

    public String getPerad() {
        return perad;
    }

    public void setPerad(String perad) {
        this.perad = perad;
    }

    public String getPersoyad() {
        return persoyad;
    }

    public void setPersoyad(String persoyad) {
        this.persoyad = persoyad;
    }

    public String getPergorev() {
        return pergorev;
    }

    public void setPergorev(String pergorev) {
        this.pergorev = pergorev;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }
}
