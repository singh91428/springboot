package com.cp.tc.dao;

import org.springframework.data.repository.CrudRepository;

import com.cp.tc.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
