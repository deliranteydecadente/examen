package com.jrve.microservicios.app.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS_W")
public class PedidosW {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double total;
	private Date dateSate;
	private UsuariosW userName;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getDateSate() {
		return dateSate;
	}
	public void setDateSate(Date dateSate) {
		this.dateSate = dateSate;
	}
	
	@ManyToOne(fetch = FetchType.LAZY,targetEntity = UsuariosW.class)
	public UsuariosW getUserName() {
		return userName;
	}
	public void setUserName(UsuariosW userName) {
		this.userName = userName;
	}
	
	
	
	

}
