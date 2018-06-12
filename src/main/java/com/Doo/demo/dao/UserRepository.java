package com.Doo.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Doo.demo.modelo.User;

public interface UserRepository extends JpaRepository<User,Long>  {
	
	@SuppressWarnings("unchecked")
	User save(User user);

}
