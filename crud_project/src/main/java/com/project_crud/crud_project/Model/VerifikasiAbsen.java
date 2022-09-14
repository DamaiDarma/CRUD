package com.project_crud.crud_project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Verifikasi-Absen")
public class VerifikasiAbsen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="nik")
    private int id;
    
    @Column(name="password")
    private String password;
    
    @Column(name="status")
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
