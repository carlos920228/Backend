package com.softlution.test.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softlution.test.modelo.Personas;
public interface PersonasRepository extends JpaRepository<Personas, Long>{

@SuppressWarnings("unchecked")
Personas save(Personas persona);

List<Personas> findAll(); 
}
