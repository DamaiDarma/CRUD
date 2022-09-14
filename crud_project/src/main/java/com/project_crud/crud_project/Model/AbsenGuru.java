package com.project_crud.crud_project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Absen_Guru")
public class AbsenGuru {
    
    @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name ="nik")
	 private int id;
	 
	 @Column(name="id_absen")
	 private String id_absen;
	 
	 @Column(name="jam_datang")
	 private String jam_datang;
	 
     @Column(name="jam_pulang")
	 private String jam_pulang;

     @Column(name="hari")
	 private String hari;

     @Column(name="tanggal")
	 private String tanggal;

     @Column(name="keterangan")
	 private String keterangan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_absen() {
        return id_absen;
    }

    public void setId_absen(String id_absen) {
        this.id_absen = id_absen;
    }

    public String getJam_datang() {
        return jam_datang;
    }

    public void setJam_datang(String jam_datang) {
        this.jam_datang = jam_datang;
    }

    public String getJam_pulang() {
        return jam_pulang;
    }

    public void setJam_pulang(String jam_pulang) {
        this.jam_pulang = jam_pulang;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

}
