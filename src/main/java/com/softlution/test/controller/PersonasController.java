package com.softlution.test.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softlution.test.modelo.Personas;
import com.softlution.test.service.PersonasService;
import com.softlution.test.util.QueryResult;
import com.softlution.test.util.Response;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
@RestController
public class PersonasController {

	@Autowired
	protected PersonasService personasService;
	protected ObjectMapper mapper;
	@RequestMapping(value="/saveOrUpdate", method=RequestMethod.POST)
	public Response saveOrUpdate(@RequestBody String personaJson) throws JsonParseException, JsonMappingException, IOException {
		this.mapper=new ObjectMapper();
		Personas persona=this.mapper.readValue(personaJson, Personas.class);
		if(!this.validate(persona)) {
			return new Response(HttpStatus.NOT_ACCEPTABLE.value(),"Faltan campos obligatorios");
		}
		this.personasService.save(persona);
		return new Response(HttpStatus.OK.value(),"Operación Exitosa");
	}
	
private boolean validate(Personas persona) {
	boolean isValid=false;
	if(StringUtils.trimToNull(persona.getName())!=null) {
		isValid=true;		
	}
	return isValid;
}
	
/**
 * Devuelve la lista de personas existentes en la base de datos
 * @return
 */
	@RequestMapping(value="/getPerson", method=RequestMethod.GET)
	public List<Personas> getPerson() {
	return this.personasService.findAll();
	}
	@RequestMapping(value="/deletePerson",method=RequestMethod.POST)
	public void deletePerson(@RequestBody String personaJson) throws Exception {
		this.mapper=new ObjectMapper();
		Personas persona=this.mapper.readValue(personaJson, Personas.class);
		if(persona.getId()==null) {
			
			 throw new Exception("Error, no trae identificador");
		}
		this.personasService.deletePerson(persona.getId());
			}
}												