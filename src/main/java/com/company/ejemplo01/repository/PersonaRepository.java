package com.company.ejemplo01.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.company.ejemplo01.entitys.Persona;

public interface PersonaRepository extends Repository<Persona, Integer> {
	
	List<Persona>findAll();
	Persona findById (int id);
	Persona save(Persona p);
	void delete(Persona p);
	
}
