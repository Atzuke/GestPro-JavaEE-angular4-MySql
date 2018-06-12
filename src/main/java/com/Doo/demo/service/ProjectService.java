package com.Doo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Doo.demo.dao.UserRepository;
import com.Doo.demo.modelo.Project;
import com.Doo.demo.modelo.User;

public interface ProjectService {

	//crea/guardar/actualizar un proyecto
		Project save(Project proyecto);
		
	//recupera la lista de proyectos
	List<Project> findAll();
	
	// elimina usuario con el id magico.
		void deleteProject(Long id);
}
