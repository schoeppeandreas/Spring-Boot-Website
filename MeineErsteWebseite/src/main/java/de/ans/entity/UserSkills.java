package de.ans.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class UserSkills {

	private UserSkills(){}
	private String skill;
	
	@ManyToMany
	private List<TheUser> users;

	public List<TheUser> getUsers() {
		return users;
	}
	public void setUsers(List<TheUser> users) {
		this.users = users;
	}
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

	
	@Override
	public String toString() {
		return String.format("UserSkills [id=%s, skill=%s]", id, skill);
	}
	
}
