package com.softlution.test.service;

import com.softlution.test.modelo.Personas;
import java.util.List;
public interface PersonasService {
	/**
	 * Guarda una persona
	 * @param persona
	 * @return persona guardada
	 */
	Personas save(Personas persona);
/**
 * Muestra todas las personas agregadas a la base de las datos
 * @return lista de las personas
 */
	List<Personas> findAll();
/**
 * Método que elimina un usuario recibiendo el ID
 * @param id
 */
void deletePerson(Long id);


}
