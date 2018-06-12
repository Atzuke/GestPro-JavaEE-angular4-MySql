package com.Doo.demo.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Doo.demo.modelo.Project;
import com.Doo.demo.modelo.User;
import com.Doo.demo.service.ProjectService;
import com.Doo.demo.service.UserService;
import com.Doo.demo.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import antlr.StringUtils;

@RestController
public class ProjectController {
		
	Project proyecto = new Project();
	
	@Autowired
	protected ProjectService projectService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveOrUpdateProjects", method = RequestMethod.POST)
	public RestResponse saveOrUpdateProjects(@RequestBody String ProjectJson) 
			throws JsonParseException, JsonMappingException, IOException {
		
		this.mapper = new ObjectMapper();
		
		Project proyect = this.mapper.readValue(ProjectJson, Project.class);
		
		
		if(!this.validate(proyect)) {
			
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"Los campos obligatorios no están compeltos");
		}
		
		this.projectService.save(proyect);
		return new RestResponse(HttpStatus.OK.value(), "La operación tuvo exito");
		
	}
	
	@RequestMapping(value="/getProjects", method = RequestMethod.GET)
	public List<Project> getProjects() {
		return this.projectService.findAll();
	}
	
	@RequestMapping(value="/deleteProject", method = RequestMethod.POST)
	public void deleteProject(@RequestBody String ProjectJson)
	throws Exception {
		
		this.mapper = new ObjectMapper();
		
		Project proyecto = this.mapper.readValue(ProjectJson, Project.class);
		
		if(proyecto.getId() == null) {
			
			throw new Exception("El id es nulo");
		}
		
		this.projectService.deleteProject(proyecto.getId());
		
	}

	
	private boolean validate(Project proyect) {
			
		boolean isValid = true;
			
		if(proyect.getNombre() == "" || proyect.getNombre() == null) {
				
			isValid = false;
		}
		
		return isValid;
		
	}

}
