package com.Doo.demo.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Doo.demo.modelo.User;
import com.Doo.demo.service.UserService;
import com.Doo.demo.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import antlr.StringUtils;

@RestController
public class Usercontroller {

	@Autowired
	protected UserService userService;
	
	protected ObjectMapper mapper;
	
	
	@RequestMapping(value="/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson) 
			throws JsonParseException, JsonMappingException, IOException {
		
		this.mapper = new ObjectMapper();
		
		User user = this.mapper.readValue(userJson, User.class);
		
		
		if(!this.validate(user)) {
			
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"Los campos obligatorios no están compeltos");
		}
		
		this.userService.save(user);
		return new RestResponse(HttpStatus.OK.value(), "La operación tuvo exito");
		
	}
	
	@RequestMapping(value="/getUsers", method = RequestMethod.GET)
	public List<User> getUsers() {
		return this.userService.findAll();
	}
	
	@RequestMapping(value="/deleteUser", method = RequestMethod.POST)
	public void deleteUser(@RequestBody String userJson)
	throws Exception {
		
		this.mapper = new ObjectMapper();
		
		User user = this.mapper.readValue(userJson, User.class);
		
		if(user.getId() == null) {
			
			throw new Exception("El id es nulo");
		}
		
		this.userService.deleteUser(user.getId());
		
	}
	
	private boolean validate(User user) {
		
		boolean isValid = true;
		
		if(user.getNombre() == "" || user.getNombre() == null) {
			
			isValid = false;
		}
		if(user.getCorreo() == "" || user.getCorreo() == null) {
			
			isValid = false;
		}
		if(user.getContraseña() == "" || user.getContraseña() == null) {
			
			isValid = false;
		}
		return isValid;
	}
}
