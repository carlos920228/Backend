package com.softlution.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.softlution.test.dao.PersonasRepository;
import com.softlution.test.modelo.Personas;
import org.springframework.stereotype.Service;
@Service
public class PersonasServiceImpl implements PersonasService {
	@Autowired
	protected PersonasRepository personaRepository;

	@Override
	public Personas save(Personas persona) {
		return this.personaRepository.save(persona);
	}
/**
 * Devuelve la lista de las personas existentes en la base
 * 
 */
	@Override
	public List<Personas> findAll() {
		
		return this.personaRepository.findAll();
	} 

}
