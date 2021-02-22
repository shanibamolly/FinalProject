package com.pack.PolicyManagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.PolicyManagement.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	

}
