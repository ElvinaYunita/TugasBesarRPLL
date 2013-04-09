package com.ithb.model;
// Generated Apr 8, 2013 4:32:09 PM by Hibernate Tools 3.2.1.GA



/**
 * Nilai generated by hbm2java
 */
public class Nilai  implements java.io.Serializable {


     private NilaiId id;
     private Dosen dosen;
     private Mahasiswa mahasiswa;
     private Matakuliah matakuliah;
     private Integer tugas;
     private Integer kuis;
     private Integer uts;
     private Integer uas;

    public Nilai() {
    }

	
    public Nilai(NilaiId id, Dosen dosen, Mahasiswa mahasiswa, Matakuliah matakuliah) {
        this.id = id;
        this.dosen = dosen;
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
    }
    public Nilai(NilaiId id, Dosen dosen, Mahasiswa mahasiswa, Matakuliah matakuliah, Integer tugas, Integer kuis, Integer uts, Integer uas) {
       this.id = id;
       this.dosen = dosen;
       this.mahasiswa = mahasiswa;
       this.matakuliah = matakuliah;
       this.tugas = tugas;
       this.kuis = kuis;
       this.uts = uts;
       this.uas = uas;
    }
   
    public NilaiId getId() {
        return this.id;
    }
    
    public void setId(NilaiId id) {
        this.id = id;
    }
    public Dosen getDosen() {
        return this.dosen;
    }
    
    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }
    
    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    public Matakuliah getMatakuliah() {
        return this.matakuliah;
    }
    
    public void setMatakuliah(Matakuliah matakuliah) {
        this.matakuliah = matakuliah;
    }
    public Integer getTugas() {
        return this.tugas;
    }
    
    public void setTugas(Integer tugas) {
        this.tugas = tugas;
    }
    public Integer getKuis() {
        return this.kuis;
    }
    
    public void setKuis(Integer kuis) {
        this.kuis = kuis;
    }
    public Integer getUts() {
        return this.uts;
    }
    
    public void setUts(Integer uts) {
        this.uts = uts;
    }
    public Integer getUas() {
        return this.uas;
    }
    
    public void setUas(Integer uas) {
        this.uas = uas;
    }




}

