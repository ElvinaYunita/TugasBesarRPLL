package com.ithb.model;
// Generated Apr 8, 2013 4:32:09 PM by Hibernate Tools 3.2.1.GA



/**
 * PembayaranId generated by hbm2java
 */
public class PembayaranId  implements java.io.Serializable {


     private String kodemk;
     private String nim;
     private int angkatan;
     private String kodedept;

    public PembayaranId() {
    }

    public PembayaranId(String kodemk, String nim, int angkatan, String kodedept) {
       this.kodemk = kodemk;
       this.nim = nim;
       this.angkatan = angkatan;
       this.kodedept = kodedept;
    }
   
    public String getKodemk() {
        return this.kodemk;
    }
    
    public void setKodemk(String kodemk) {
        this.kodemk = kodemk;
    }
    public String getNim() {
        return this.nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    public int getAngkatan() {
        return this.angkatan;
    }
    
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
    public String getKodedept() {
        return this.kodedept;
    }
    
    public void setKodedept(String kodedept) {
        this.kodedept = kodedept;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PembayaranId) ) return false;
		 PembayaranId castOther = ( PembayaranId ) other; 
         
		 return ( (this.getKodemk()==castOther.getKodemk()) || ( this.getKodemk()!=null && castOther.getKodemk()!=null && this.getKodemk().equals(castOther.getKodemk()) ) )
 && ( (this.getNim()==castOther.getNim()) || ( this.getNim()!=null && castOther.getNim()!=null && this.getNim().equals(castOther.getNim()) ) )
 && (this.getAngkatan()==castOther.getAngkatan())
 && ( (this.getKodedept()==castOther.getKodedept()) || ( this.getKodedept()!=null && castOther.getKodedept()!=null && this.getKodedept().equals(castOther.getKodedept()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getKodemk() == null ? 0 : this.getKodemk().hashCode() );
         result = 37 * result + ( getNim() == null ? 0 : this.getNim().hashCode() );
         result = 37 * result + this.getAngkatan();
         result = 37 * result + ( getKodedept() == null ? 0 : this.getKodedept().hashCode() );
         return result;
   }   


}

