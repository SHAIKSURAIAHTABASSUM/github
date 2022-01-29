package com.sheryians.major.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sheryians.major.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
}
