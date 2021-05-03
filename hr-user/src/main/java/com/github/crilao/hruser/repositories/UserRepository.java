package com.github.crilao.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.crilao.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
