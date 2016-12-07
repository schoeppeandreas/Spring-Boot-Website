package de.ans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.ans.entity.TheUser;
import de.ans.repository.UserRepository;

@Service
public class UsersService {

	@Autowired
	UserRepository userRepository;
	
	public Iterable<TheUser> getAllUser(){	
		return userRepository.findAll();
	}

	public TheUser getById(Long id) {
		return userRepository.findById(id);
	}
	
}
