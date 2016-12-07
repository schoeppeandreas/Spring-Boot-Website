package de.ans.repository;

import org.springframework.data.repository.CrudRepository;

import de.ans.entity.TheUser;

public interface UserRepository extends CrudRepository<TheUser, Long>{
	TheUser findById(Long id);
}
