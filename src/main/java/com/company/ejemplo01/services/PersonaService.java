package com.company.ejemplo01.services;

import java.util.List;

import com.company.ejemplo01.entitys.Persona;

public interface PersonaService {

	List<Persona>listar();
	Persona listarId(int id);
	Persona add(Persona p);
	Persona edit(Persona p);
	Persona delete(int id);
	
}
