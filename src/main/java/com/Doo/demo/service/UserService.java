package com.Doo.demo.service;

import java.util.List;

import com.Doo.demo.modelo.User;

public interface UserService {

	//guardar un usuario
	User save(User user);

	//recupera la lista de usuarios
	List<User> findAll();

	
	// elimina usuario con el id magico.
	void deleteUser(Long id);


}
