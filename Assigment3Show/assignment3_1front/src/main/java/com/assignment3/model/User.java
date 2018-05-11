package com.assignment3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")


public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
	private Integer iduser;
	
	@Column
	private String nume;
	
	@Column
	private	String prenume;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String type;
	
	public User(Integer iduser, String nume, String prenume, String username, String password, String type) {
		this.iduser = iduser;
		this.nume = nume;
		this.prenume = prenume;
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public User() {
	}

	
	

	public String getType() {
		return type;
	}
	public void setType(String tipUser) {
		this.type = tipUser;
	}
	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer idUser) {
		this.iduser = idUser;
	}


	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String user) {
		this.username = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}


