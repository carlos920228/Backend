package com.softlution.test.service;

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

}
