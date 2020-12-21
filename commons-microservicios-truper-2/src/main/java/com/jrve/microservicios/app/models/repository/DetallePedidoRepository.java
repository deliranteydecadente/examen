package com.jrve.microservicios.app.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.jrve.microservicios.app.models.PedidosDetalleW;

public interface DetallePedidoRepository extends CrudRepository<PedidosDetalleW, Long>{

}
