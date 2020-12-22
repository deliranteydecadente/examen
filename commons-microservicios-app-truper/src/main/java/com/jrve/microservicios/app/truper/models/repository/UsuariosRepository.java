package com.jrve.microservicios.app.truper.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.jrve.microservicios.app.truper.models.entity.UsuariosW;

public interface UsuariosRepository extends CrudRepository<UsuariosW, String>{

}
