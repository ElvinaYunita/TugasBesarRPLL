/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ithb.controller;

import com.ithb.model.Dosen;
import com.ithb.model.Mahasiswa;
import com.ithb.model.Staff;
import com.ithb.model.Nilai;
import com.ithb.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author acer
 */
@ManagedBean
@SessionScoped
public class NilaiController {
    private List<Nilai> nilaiList;
    private Nilai nilai;
    private List<Mahasiswa> mhsList;
    private Mahasiswa mhs;

    public NilaiController() {
        nilaiList = new ArrayList<Nilai>();
        mhsList = new ArrayList<Mahasiswa>();
        Session s = HibernateUtil.getSessionFactory().openSession();
        nilaiList = s.createQuery("from Nilai").list();
        mhs = new Mahasiswa();
        nilai = new Nilai();
        s.close();
    }
    
    public List<Nilai> getNilaiList() {
        return nilaiList;
    }

    public void setNilaiList(List<Nilai> nilaiList) {
        this.nilaiList = nilaiList;
    }

    public Nilai getNilai() {
        return nilai;
    }

    public void setNilai(Nilai nilai) {
        this.nilai = nilai;
    }

    public List<Mahasiswa> getMhsList() {
        return mhsList;
    }

    public void setMhsList(List<Mahasiswa> mhsList) {
        this.mhsList = mhsList;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }
    
    
}
