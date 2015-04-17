package com.codict.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codict.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
