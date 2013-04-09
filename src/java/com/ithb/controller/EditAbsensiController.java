/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ithb.controller;

import com.ithb.model.Jadwalhadir;
import com.ithb.model.Mahasiswa;
import com.ithb.model.Matakuliah;
import com.ithb.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Session;

/**
 *
 * @author Samsung
 */
@ManagedBean
@SessionScoped
public class EditAbsensiController {

    private List<Jadwalhadir> jhadirList;
    private Jadwalhadir jhadir;
    private List<Jadwalhadir> jhadirList2;
    //private List<Mahasiswa> mhsList;
    //private Mahasiswa mahasiswa;
    
    private String pilihanMK;
    private String radioOption;
    
    final String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");
    
    /**
     * Creates a new instance of EditAbsensiController
     */
    public EditAbsensiController() {
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        jhadirList = new ArrayList<Jadwalhadir>();
        jhadirList = session1.createQuery("from Jadwalhadir").list();
        jhadir = new Jadwalhadir();
        //mahasiswaList = new ArrayList<Matakuliah>();
        //matkulList = session1.createQuery("from Matakuliah").list();
        //matakuliah = new Matakuliah();
        session1.close();
    }
    
    public void loadAbsensi(){
        
    }

    public List<Jadwalhadir> getJhadirList() {
        return jhadirList;
    }

    public void setJhadirList(List<Jadwalhadir> jhadirList) {
        this.jhadirList = jhadirList;
    }

    public Jadwalhadir getJhadir() {
        return jhadir;
    }

    public void setJhadir(Jadwalhadir jhadir) {
        this.jhadir = jhadir;
    }

    public String getPilihanMK() {
        return pilihanMK;
    }

    public void setPilihanMK(String pilihanMK) {
        this.pilihanMK = pilihanMK;
    }

    public String getRadioOption() {
        return radioOption;
    }

    public void setRadioOption(String radioOption) {
        this.radioOption = radioOption;
    }
    
}
