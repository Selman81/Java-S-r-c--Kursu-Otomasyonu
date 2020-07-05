/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class adminislemleri {
    private Connection con = null; 
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
   
    public boolean giris(String kullanici_adi,String parola) {
        
        String sorgu =  "Select * From admin where kullaniciadi = ? and sifre = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,kullanici_adi);
            preparedStatement.setString(2,parola);
            
            ResultSet rs =  preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
  
    }
    public void ogrenciSil(int tc){
        
         String sorgu = "Delete FROM musteri where tc= ?";
            
         try {
             preparedStatement = con.prepareStatement(sorgu);
             
             preparedStatement.setInt(1,tc);
             
             
             preparedStatement.executeUpdate();
             
             
         } catch (SQLException ex) {
             
             
             Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
    public void ogrenciSil(){
        
        String sorgu = "Delete FROM musteri";
        try {
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
         
            
         
        
    }
    public void perSil(int tc){
        
         String sorgu = "Delete FROM personel where tc= ?";
            
         try {
             preparedStatement = con.prepareStatement(sorgu);
             
             preparedStatement.setInt(1,tc);
             
             
             preparedStatement.executeUpdate();
             
             
         } catch (SQLException ex) {
             
             
             Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    public void surucuekle(int tc,String ad,String soyad,String kayitarih,String ehliyetsinif,int ucret) {
      String sorgu = "Insert Into musteri (tc,ad,soyad,kayıttarihi,ehliyetsinifi,ucret) VALUES(?,?,?,?,?,?)";
        
      
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setInt(1, tc);
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, soyad);
            preparedStatement.setString(4, kayitarih);
            preparedStatement.setString(5, ehliyetsinif);
            preparedStatement.setInt(6, ucret);
            
            
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void personelekle(int tc,String ad,String soyad,String gorevi,int maas){
        
      String sorgu = "Insert Into personel (tc,ad,soyad,gorevi,maas) VALUES(?,?,?,?,?)";
        
      
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setInt(1, tc);
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, soyad);
            preparedStatement.setString(4, gorevi);
            preparedStatement.setInt(5, maas);
            
            
            
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void surucuGuncelle(String yeni_ad,String yeni_soyad,String yeni_kayittarihi,int yeni_ucret,int tc) {
        
        String sorgu =  "Update musteri set  ad = ? , soyad = ? , kayıttarihi = ?  , ucret = ? where tc = ? ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_soyad);
            preparedStatement.setString(3, yeni_kayittarihi);
          
            preparedStatement.setInt(4, yeni_ucret);
     preparedStatement.setInt(5, tc);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void personelGuncelle(String yeni_ad,String yeni_soyad,int yeni_maas,int tc) {
        
        String sorgu =  "Update personel set  ad = ? , soyad = ? , maas = ? where tc = ? ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_soyad);
            preparedStatement.setInt(3, yeni_maas);
            preparedStatement.setInt(4, tc);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public int surcgelir() {
        try {
            statement =  con.createStatement();
            String sorgum =  "SELECT SUM(ucret) FROM musteri;";
            ResultSet rs =  statement.executeQuery(sorgum);
            int sum = 0;
            while (rs.next()) {
                int c = rs.getInt(1);
                sum = sum + c;
            }
            return sum;
    
        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
            
        } 
    }
    
    public int pergider() {
        try {
            statement =  con.createStatement();
            String sorgum =  "SELECT SUM(maas) FROM personel ;";
            ResultSet rs =  statement.executeQuery(sorgum);
            int top = 0;
            while (rs.next()) {
                int c = rs.getInt(1);
                top = top + c;
            }
            return top;
    
            

        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
            return 1;   
        } 
    }
    public ArrayList<surucu> surucugoruntu() {
        
        ArrayList<surucu> goruntu = new ArrayList<surucu>();
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From musteri";
            ResultSet rs =  statement.executeQuery(sorgu);
            while(rs.next()) {
                int tc = rs.getInt("tc");
                String srcad = rs.getString("ad");
                String srcsoyad = rs.getString("soyad");
                String kayit  = rs.getString("kayıttarihi");
                String ehliyet = rs.getString("ehliyetsınıfı");
                int ucret = rs.getInt("ucret");
                goruntu.add(new surucu(tc,srcad,srcsoyad,kayit, ehliyet ,ucret));
                
            }
            return goruntu;

        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        } 
    }
    public ArrayList<gelirtab> gelirgoruntu() {
        
        ArrayList<gelirtab> tbl = new ArrayList<gelirtab>();
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From musteri WHERE (ucret>'0')";
            ResultSet rs =  statement.executeQuery(sorgu);
            while(rs.next()) {
                int tc = rs.getInt("tc");
                String srcad = rs.getString("ad");
                String srcsoyad = rs.getString("soyad");
                int ucret = rs.getInt("ucret");
                tbl.add(new gelirtab(tc,srcad,srcsoyad,ucret));
            }
            return tbl;

        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        } 
    }
    public ArrayList<gidertab> gidergoruntu() {
        
        ArrayList<gidertab> qwe = new ArrayList<gidertab>();
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From personel WHERE (maas>'0')";
            ResultSet rs =  statement.executeQuery(sorgu);
            while(rs.next()) {
                int pertc = rs.getInt("tc");
                String perad = rs.getString("ad");
                String persoyad = rs.getString("soyad");
                int maas = rs.getInt("maas");
                qwe.add(new gidertab(pertc,perad,persoyad,maas));
            }
            return qwe;

        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        } 
    }
    public ArrayList<personel> personelgoruntule() {
        
        ArrayList<personel> pergorr = new ArrayList<personel>();
        
        try {
            statement =  con.createStatement();
            String sorguu =  "Select * From personel";
            
            ResultSet rs =  statement.executeQuery(sorguu);
            
            while(rs.next()) {
                int tc = rs.getInt("tc");
                String perad = rs.getString("ad");
                String persoyad = rs.getString("soyad");
                String gorevi  = rs.getString("gorevi");
                int ucret = rs.getInt("maas");
                pergorr.add(new personel(tc,perad,persoyad,gorevi,ucret));
            }
            return pergorr;

        } catch (SQLException ex) {
            Logger.getLogger(adminislemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    public adminislemleri() {
        
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
        
    }
    
    
    
}
