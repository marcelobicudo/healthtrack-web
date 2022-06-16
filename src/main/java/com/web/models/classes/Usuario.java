package com.web.models.classes;

import java.sql.Date;

public class Usuario {
	private int id_usuario;
	private String nm_usuario;
	private String sn_usuario;
	private String sh_usuario;
	private Date dt_usuario;
	private String ds_email;
	private double vl_altura;
	
	public Usuario(int id_usuario, String nm_usuario, String sn_usuario, String sh_usuario, Date dt_usuario, String ds_email, double vl_altura) {
		this.id_usuario = id_usuario;
		this.nm_usuario = nm_usuario;
		this.sn_usuario = sn_usuario;
		this.sh_usuario = sh_usuario;
		this.dt_usuario = dt_usuario;
		this.ds_email = ds_email;
		this.vl_altura = vl_altura;
	}
	
	public Usuario() {

    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNm_usuario() {
        return nm_usuario;
    }

    public void setNm_usuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public String getSn_usuario() {
        return sn_usuario;
    }

    public void setSn_usuario(String sn_usuario) {
        this.sn_usuario = sn_usuario;
    }

    public String getSh_usuario() {
        return sh_usuario;
    }

    public void setSh_usuario(String sh_usuario) {
        this.sh_usuario = sh_usuario;
    }

    public Date getDt_usuario() {
        return dt_usuario;
    }

    public void setDt_usuario(Date dt_usuario) {
        this.dt_usuario = dt_usuario;
    }

    public String getDs_email() {
        return ds_email;
    }

    public void setDs_email(String ds_email) {
        this.ds_email = ds_email;
    }

    public double getVl_altura() {
        return vl_altura;
    }

    public void setVl_altura(double vl_altura) {
        this.vl_altura = vl_altura;
    }	
}
