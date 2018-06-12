package com.Doo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Doo.demo.dao.ProjectRepository;
import com.Doo.demo.dao.UserRepository;
import com.Doo.demo.modelo.Project;
import com.Doo.demo.modelo.User;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	
		@Autowired
		protected ProjectRepository projectRepository;

		public Project save(Project proyecto) {
			
			return this.projectRepository.save(proyecto);
		}

		@Override
		public List<Project> findAll() {
			return this.projectRepository.findAll();
		}

		

		

		@Override
		public void deleteProject(Long id) {
			this.projectRepository.deleteById(id);
			
		}
	
}	
