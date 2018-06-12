package com.Doo.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Doo.demo.modelo.Project;
import com.Doo.demo.modelo.User;

public interface ProjectRepository extends JpaRepository<Project,Long> {
	
	@SuppressWarnings("unchecked")
	Project save(Project proyect);
	
	List<Project> findAll();

}
