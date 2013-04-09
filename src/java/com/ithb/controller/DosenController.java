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
public class DosenController {
    private List<Dosen> dosenList;
    private Dosen dsn;

    public DosenController() {
        dosenList = new ArrayList<Dosen>();
        Session s = HibernateUtil.getSessionFactory().openSession();
        dosenList = s.createQuery("from Dosen").list();
        dsn = new Dosen();
        s.close();
    }

    public List<Dosen> getDosenList() {
        return dosenList;
    }

    public void setDosenList(List<Dosen> dosenList) {
        this.dosenList = dosenList;
    }

    public Dosen getDsn() {
        return dsn;
    }

    public void setDsn(Dosen dsn) {
        this.dsn = dsn;
    }
    
    
}
