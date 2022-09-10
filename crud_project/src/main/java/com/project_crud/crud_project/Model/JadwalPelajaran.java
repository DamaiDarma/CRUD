package com.project_crud.crud_project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "JadwalPelajaran")
public class JadwalPelajaran {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;
    
    @Column(name="nik")
    private String nik;
    
    @Column(name="id_hari")
    private String id_hari;
    
    @Column(name="id_pelajaran")
    private String id_pelajaran;

    @Column(name="id_jam")
    private String id_jam;

    @Column(name="id_kelas")
    private String id_kelas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getId_hari() {
        return id_hari;
    }

    public void setId_hari(String id_hari) {
        this.id_hari = id_hari;
    }

    public String getId_pelajaran() {
        return id_pelajaran;
    }

    public void setId_pelajaran(String id_pelajaran) {
        this.id_pelajaran = id_pelajaran;
    }

    public String getId_jam() {
        return id_jam;
    }

    public void setId_jam(String id_jam) {
        this.id_jam = id_jam;
    }

    public String getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(String id_kelas) {
        this.id_kelas = id_kelas;
    }
 

}
