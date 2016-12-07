package de.ans.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TheUser {
	
	private TheUser(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	private String vorname;
	private String nachname;
	
	@OneToMany(mappedBy="users")
	private List<UserSkills> skills;
	
	public List<UserSkills> getSkills() {
		return skills;
	}
	public void setSkills(List<UserSkills> skills) {
		this.skills = skills;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	@Override
	public String toString() {
		return String.format("Users [id=%s, vorname=%s, nachname=%s]", id, vorname, nachname);
	}
	
}
