package de.ans.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	
	private Users(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	private String vorname;
	private String nachname;
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
