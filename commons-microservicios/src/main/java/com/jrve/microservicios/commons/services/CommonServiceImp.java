package com.jrve.microservicios.commons.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class CommonServiceImp<E, R extends CrudRepository<E, Long>> implements CommonService<E> {
	
	@Autowired 
	protected R repository;
	
	
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		return this.repository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Optional<E> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Transactional
	public E save(E entity) {
		
		return this.repository.save(entity);
	}
	
	@Transactional
	public void deletebyId(Long id) {
		this.repository.deleteById(id);

	}

}
