package com.ithb.model;
// Generated Apr 8, 2013 4:32:09 PM by Hibernate Tools 3.2.1.GA



/**
 * KelolaId generated by hbm2java
 */
public class KelolaId  implements java.io.Serializable {


     private String nik;
     private String kodemk;
     private String idperiode;

    public KelolaId() {
    }

    public KelolaId(String nik, String kodemk, String idperiode) {
       this.nik = nik;
       this.kodemk = kodemk;
       this.idperiode = idperiode;
    }
   
    public String getNik() {
        return this.nik;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getKodemk() {
        return this.kodemk;
    }
    
    public void setKodemk(String kodemk) {
        this.kodemk = kodemk;
    }
    public String getIdperiode() {
        return this.idperiode;
    }
    
    public void setIdperiode(String idperiode) {
        this.idperiode = idperiode;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof KelolaId) ) return false;
		 KelolaId castOther = ( KelolaId ) other; 
         
		 return ( (this.getNik()==castOther.getNik()) || ( this.getNik()!=null && castOther.getNik()!=null && this.getNik().equals(castOther.getNik()) ) )
 && ( (this.getKodemk()==castOther.getKodemk()) || ( this.getKodemk()!=null && castOther.getKodemk()!=null && this.getKodemk().equals(castOther.getKodemk()) ) )
 && ( (this.getIdperiode()==castOther.getIdperiode()) || ( this.getIdperiode()!=null && castOther.getIdperiode()!=null && this.getIdperiode().equals(castOther.getIdperiode()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNik() == null ? 0 : this.getNik().hashCode() );
         result = 37 * result + ( getKodemk() == null ? 0 : this.getKodemk().hashCode() );
         result = 37 * result + ( getIdperiode() == null ? 0 : this.getIdperiode().hashCode() );
         return result;
   }   


}


