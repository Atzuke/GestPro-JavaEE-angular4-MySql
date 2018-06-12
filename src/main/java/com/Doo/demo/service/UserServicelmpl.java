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
}
