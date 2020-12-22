package com.jrve.microservicios.app.truper.models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos_w")
public class PedidosW {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private double total;
	private Date dateSale;
	@ManyToOne(targetEntity = UsuariosW.class)
	private UsuariosW username;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getDateSale() {
		return dateSale;
	}
	public void setDateSale(Date dateSale) {
		this.dateSale = dateSale;
	}
	public UsuariosW getUsername() {
		return username;
	}
	public void setUsername(UsuariosW username) {
		this.username = username;
	}
	
	

}
