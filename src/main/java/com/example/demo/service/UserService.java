package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repos.UserRepository;

@Service
public class UserService 
{
	@Autowired
   private UserRepository repository;
	
	public User createUser(User user)
	{
		return repository.save(user);
	}
	public List<User> getAllUser()
	{
		return repository.findAll();
		
	}
	public Optional<User> findById(Integer id)
	{
		return repository.findById(id);
	}
	public void deleteUsers(Integer id)
	{
		repository.deleteById(id);
	}
}
