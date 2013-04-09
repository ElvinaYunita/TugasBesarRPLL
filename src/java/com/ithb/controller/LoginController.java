/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ithb.controller;

import com.ithb.model.Dosen;
import com.ithb.model.Mahasiswa;
import com.ithb.model.Staff;
import com.ithb.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author Samsung
 */
@ManagedBean
@SessionScoped
public class LoginController {

    private List<Mahasiswa> mhsList;
    private Mahasiswa mhs;
    private List<Staff> staffList;
    private Staff staff;
    private List<Dosen> dosenList;
    private Dosen dosen;
    
    private String pilihanMenu;
    private String username;
    private String password;
    
    /**
     * Creates a new instance of LoginController
     */
    public LoginController() {
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        mhsList = new ArrayList<Mahasiswa>();
        mhsList = session1.createQuery("from Mahasiswa").list();
        mhs = new Mahasiswa();
        staffList = new ArrayList<Staff>();
        staffList = session1.createQuery("from Staff").list();
        staff = new Staff();
        dosenList = new ArrayList<Dosen>();
        dosenList = session1.createQuery("from Dosen").list();
        dosen = new Dosen();
        session1.close();
    }
    
    public String cekMenu(){
        if(pilihanMenu.equals("dosen")){
            Session session1 = HibernateUtil.getSessionFactory().openSession();
            System.out.println("masuk1");
            for(Dosen m : dosenList){
                System.out.println("masuk2");
                if (m.getNik().equals(username) && m.getPassword().equals(password)){
                    return "menuDosen?faces-redirect=true";
                }
            }
            session1.close();
            System.out.println("gagal");
            return "WRONG!!!";
        }
        else if(pilihanMenu.equals("staff")){
            Session session1 = HibernateUtil.getSessionFactory().openSession();
            System.out.println("masuk1");
            for(Staff m : staffList){
                System.out.println("masuk2");
                if (m.getNik().equals(username) && m.getPassword().equals(password)){
                    return "menuStaff?faces-redirect=true";
                }
            }
            session1.close();
            System.out.println("gagal");
            return "WRONG!!!";
        }
        else{
            Session session1 = HibernateUtil.getSessionFactory().openSession();
            System.out.println("masuk1");
            for(Mahasiswa m : mhsList){
                System.out.println("masuk2");
                if (m.getNim().equals(username) && m.getPassword().equals(password)){
                    System.out.println("masuk3");
                    return "menuMhs?faces-redirect=true";
                }
            }
            session1.close();
            System.out.println("gagal");
            return "WRONG!!!";
        }
        
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

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public List<Dosen> getDosenList() {
        return dosenList;
    }

    public void setDosenList(List<Dosen> dosenList) {
        this.dosenList = dosenList;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public String getPilihanMenu() {
        return pilihanMenu;
    }

    public void setPilihanMenu(String pilihanMenu) {
        this.pilihanMenu = pilihanMenu;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
