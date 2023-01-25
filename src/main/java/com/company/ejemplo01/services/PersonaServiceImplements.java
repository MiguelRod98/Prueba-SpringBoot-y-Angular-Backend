package com.company.ejemplo01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.ejemplo01.entitys.Persona;
import com.company.ejemplo01.repository.PersonaRepository;

@Service
public class PersonaServiceImplements implements PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public List<Persona> listar() {
		return personaRepository.findAll();
	}

	@Override
	public Persona listarId(int id) {
		return personaRepository.findById(id);
	}

	@Override
	public Persona add(Persona p) {
		return personaRepository.save(p);
	}

	@Override
	public Persona edit(Persona p) {
		return personaRepository.save(p);
	}

	@Override
	public Persona delete(int id) {
		Persona p = personaRepository.findById(id);
        if(p!=null){
        	personaRepository.delete(p);
        }
       return p;
	}

}
