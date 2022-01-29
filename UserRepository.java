package com.sheryians.major.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheryians.major.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User>  findUserByEmail(String email);

}