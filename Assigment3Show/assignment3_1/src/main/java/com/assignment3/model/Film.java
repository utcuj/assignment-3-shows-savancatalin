package com.assignment3.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="film")
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idfilm", unique = true, nullable = false)
	private Integer idfilm;
	@Column
	private String nume;
	@Column
	private Integer idfilmtip;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	
	
	
	public Integer getIdfilm() {
		return idfilm;
	}
	public void setIdfilm(Integer idFilm) {
		this.idfilm = idFilm;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public Integer getIdfilmtip() {
		return idfilmtip;
	}
	public void setIdfilmtip(Integer idfilmtip) {
		this.idfilmtip = idfilmtip;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date createdAt) {
		this.date = createdAt;
	}
	

}
