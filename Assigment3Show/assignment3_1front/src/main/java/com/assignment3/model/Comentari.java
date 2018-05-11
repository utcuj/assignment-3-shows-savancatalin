package com.assignment3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="comentari")

public class Comentari {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
	private Integer idcomentari;
	@Column
	private Integer iduser;
	@Column
	private Integer idfilm;
	@Column
	private String comentariu;
	@Column
	private Integer nota;
	public Integer getIdcomentari() {
		return idcomentari;
	}
	public void setIdcomentari(Integer idcomentari) {
		this.idcomentari = idcomentari;
	}
	public Integer getIduser() {
		return iduser;
	}
	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}
	public Integer getIdfilm() {
		return idfilm;
	}
	public void setIdfilm(Integer idfilm) {
		this.idfilm = idfilm;
	}
	public String getComentariu() {
		return comentariu;
	}
	public void setComentariu(String comentariu) {
		this.comentariu = comentariu;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}


	
	



}
