package com.softlution.test.service;

import com.softlution.test.modelo.Personas;
import java.util.List;
public interface PersonasService {

	Personas save(Personas persona);

	List<Personas> findAll();


}
