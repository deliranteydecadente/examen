package com.jrve.microservicios.app.truper.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.jrve.microservicios.app.truper.models.entity.ProductoW;

public interface ProductoRepository extends CrudRepository<ProductoW, String>{

}
