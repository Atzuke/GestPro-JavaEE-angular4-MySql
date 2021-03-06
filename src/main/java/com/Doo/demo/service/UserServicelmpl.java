package com.Doo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Doo.demo.dao.UserRepository;
import com.Doo.demo.modelo.User;

@Service
public class UserServicelmpl implements UserService {

	@Autowired
	protected UserRepository userRepository;

	public User save(User user) {
		
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return this.userRepository.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		this.userRepository.deleteById(id);
		
	}

	@Override
	public User Login(User user) {
		
		List<User> usuarios = this.userRepository.findAll();
		for(User u: usuarios)
			if(user.getCorreo().equals( u.getCorreo())  && user.getContraseña().equals(u.getContraseña())) {
				return u;
			}
		return null;
	}
}
