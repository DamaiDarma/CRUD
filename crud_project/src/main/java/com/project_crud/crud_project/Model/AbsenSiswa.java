package com.project_crud.crud_project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Absen_Siswa")
public class AbsenSiswa {

    @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name ="nis")
	 private int id;
	 
	 @Column(name="id_absen")
	 private String id_absen;
	 
	 @Column(name="jam_hadir")
	 private String jam_hadir;
	 
     @Column(name="id_hari")
	 private String id_hari;

     @Column(name="id_tanggal")
	 private String id_tanggal;

     @Column(name="id_jam")
	 private String id_jam;

     @Column(name="id_pelajaran")
	 private String id_pelajaran;

     @Column(name="id_kelas")
	 private String id_kelas;

     @Column(name="nik")
	 private String nik;

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

    public String getJam_hadir() {
        return jam_hadir;
    }

    public void setJam_hadir(String jam_hadir) {
        this.jam_hadir = jam_hadir;
    }

    public String getId_hari() {
        return id_hari;
    }

    public void setId_hari(String id_hari) {
        this.id_hari = id_hari;
    }

    public String getId_tanggal() {
        return id_tanggal;
    }

    public void setId_tanggal(String id_tanggal) {
        this.id_tanggal = id_tanggal;
    }

    public String getId_jam() {
        return id_jam;
    }

    public void setId_jam(String id_jam) {
        this.id_jam = id_jam;
    }

    public String getId_pelajaran() {
        return id_pelajaran;
    }

    public void setId_pelajaran(String id_pelajaran) {
        this.id_pelajaran = id_pelajaran;
    }

    public String getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(String id_kelas) {
        this.id_kelas = id_kelas;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    
}
