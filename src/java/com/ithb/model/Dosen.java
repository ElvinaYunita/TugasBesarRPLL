package com.ithb.model;
// Generated Apr 8, 2013 4:32:09 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Dosen generated by hbm2java
 */
public class Dosen  implements java.io.Serializable {


     private String nik;
     private Departemen departemen;
     private Hakakses hakakses;
     private String nama;
     private String alamat;
     private String password;
     private String studi;
     private String pendidikan;
     private String riwayat;
     private String statusDosen;
     private Set<Nilai> nilais = new HashSet<Nilai>(0);
     private Set<Kelola> kelolas = new HashSet<Kelola>(0);
     private Set<Matakuliah> matakuliahs = new HashSet<Matakuliah>(0);
     private Set<Jadwalhadir> jadwalhadirs = new HashSet<Jadwalhadir>(0);

    public Dosen() {
    }

	
    public Dosen(String nik, String nama, String password) {
        this.nik = nik;
        this.nama = nama;
        this.password = password;
    }
    public Dosen(String nik, Departemen departemen, Hakakses hakakses, String nama, String alamat, String password, String studi, String pendidikan, String riwayat, String statusDosen, Set<Nilai> nilais, Set<Kelola> kelolas, Set<Matakuliah> matakuliahs, Set<Jadwalhadir> jadwalhadirs) {
       this.nik = nik;
       this.departemen = departemen;
       this.hakakses = hakakses;
       this.nama = nama;
       this.alamat = alamat;
       this.password = password;
       this.studi = studi;
       this.pendidikan = pendidikan;
       this.riwayat = riwayat;
       this.statusDosen = statusDosen;
       this.nilais = nilais;
       this.kelolas = kelolas;
       this.matakuliahs = matakuliahs;
       this.jadwalhadirs = jadwalhadirs;
    }
   
    public String getNik() {
        return this.nik;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }
    public Departemen getDepartemen() {
        return this.departemen;
    }
    
    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }
    public Hakakses getHakakses() {
        return this.hakakses;
    }
    
    public void setHakakses(Hakakses hakakses) {
        this.hakakses = hakakses;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getStudi() {
        return this.studi;
    }
    
    public void setStudi(String studi) {
        this.studi = studi;
    }
    public String getPendidikan() {
        return this.pendidikan;
    }
    
    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }
    public String getRiwayat() {
        return this.riwayat;
    }
    
    public void setRiwayat(String riwayat) {
        this.riwayat = riwayat;
    }
    public String getStatusDosen() {
        return this.statusDosen;
    }
    
    public void setStatusDosen(String statusDosen) {
        this.statusDosen = statusDosen;
    }
    public Set<Nilai> getNilais() {
        return this.nilais;
    }
    
    public void setNilais(Set<Nilai> nilais) {
        this.nilais = nilais;
    }
    public Set<Kelola> getKelolas() {
        return this.kelolas;
    }
    
    public void setKelolas(Set<Kelola> kelolas) {
        this.kelolas = kelolas;
    }
    public Set<Matakuliah> getMatakuliahs() {
        return this.matakuliahs;
    }
    
    public void setMatakuliahs(Set<Matakuliah> matakuliahs) {
        this.matakuliahs = matakuliahs;
    }
    public Set<Jadwalhadir> getJadwalhadirs() {
        return this.jadwalhadirs;
    }
    
    public void setJadwalhadirs(Set<Jadwalhadir> jadwalhadirs) {
        this.jadwalhadirs = jadwalhadirs;
    }




}


