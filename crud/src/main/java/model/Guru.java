package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Guru")
public class Guru {
    
    @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name ="nik")
	 private int id;
	 
	 @Column(name="namaptk")
	 private String namaptk;
	 
	 @Column(name="jenis_kelamin")
	 private String jenis_kelamin;
	 
     @Column(name="tempat_lahir")
	 private String tempat_lahir;

     @Column(name="agama")
	 private String agama;

     @Column(name="tgl_lahir")
	 private String tgl_lahir;

     @Column(name="npwp")
	 private String npwp;

     @Column(name="alamat")
	 private String alamat;

     @Column(name="status_perkawinan")
	 private String status_perkawinan;

     @Column(name="hp")
	 private String hp;

     @Column(name="email")
	 private String email;

     @Column(name="foto")
	 private String foto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaptk() {
        return namaptk;
    }

    public void setNamaptk(String namaptk) {
        this.namaptk = namaptk;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getStatus_perkawinan() {
        return status_perkawinan;
    }

    public void setStatus_perkawinan(String status_perkawinan) {
        this.status_perkawinan = status_perkawinan;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}
