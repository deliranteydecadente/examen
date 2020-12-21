package com.jrve.microservicios.app.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS_DETALLE_W")
public class PedidosDetalleW {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne(fetch = FetchType.LAZY,targetEntity = PedidosW.class)
	private PedidosW pedido;
	
	
	@ManyToOne(fetch = FetchType.LAZY,targetEntity = ProductoW.class)
	private ProductoW producto;
	private double amout;
	private double price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public double getAmout() {
		return amout;
	}
	public void setAmout(double amout) {
		this.amout = amout;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ProductoW getProducto() {
		return producto;
	}
	public void setProducto(ProductoW producto) {
		this.producto = producto;
	}
	public PedidosW getPedido() {
		return pedido;
	}
	public void setPedido(PedidosW pedido) {
		this.pedido = pedido;
	}
	
	
	
	
	
	

}
