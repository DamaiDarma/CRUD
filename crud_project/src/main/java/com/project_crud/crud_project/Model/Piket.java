package com.project_crud.crud_project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Piket")
public class Piket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_piket")
    private int id;
    
    @Column(name="nik")
    private String nik;
    
    @Column(name="id_hari")
    private String id_hari;

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
    
}
