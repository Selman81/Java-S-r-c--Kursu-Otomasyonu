
package view;

    
public class gidertab {
    private int pertc;
    private String perad;
    private String persoyad;
    private int maas;
    public gidertab(int pertc,String perad,String persoyad,int maas)
    {
        this.pertc = pertc;
        this.perad = perad;
        this.persoyad = persoyad;
        this.maas = maas;
        
        
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

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
    

}
