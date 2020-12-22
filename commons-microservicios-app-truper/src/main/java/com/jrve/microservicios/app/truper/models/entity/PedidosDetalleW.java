package com.jrve.microservicios.app.truper.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos_detalle_w")
public class PedidosDetalleW {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(targetEntity = PedidosW.class)
	private PedidosW id_pedido;
	@ManyToOne(targetEntity = ProductoW.class)
	private ProductoW sku;
	private double amout;
	private double price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PedidosW getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(PedidosW id_pedido) {
		this.id_pedido = id_pedido;
	}
	public ProductoW getSku() {
		return sku;
	}
	public void setSku(ProductoW sku) {
		this.sku = sku;
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
	
	
	
}
