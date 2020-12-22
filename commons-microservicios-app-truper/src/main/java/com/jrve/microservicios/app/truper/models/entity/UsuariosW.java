package com.jrve.microservicios.app.truper.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="usuarios_w")
public class UsuariosW {

	@Id
	private String username;
	@Column(length = 150)
	private String password;
	@Column(length = 150)
	private String rol_;
	@Column(length = 200)
	private String nombre;
	@Column(length = 200)
	private String apellidos;
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
	public String getRol_() {
		return rol_;
	}
	public void setRol_(String rol_) {
		this.rol_ = rol_;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
	
	
}
