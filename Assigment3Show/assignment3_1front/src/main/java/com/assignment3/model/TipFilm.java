package com.assignment3.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tipfilm")


public class TipFilm {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
	private Integer idfilmtip;
	@Column
	private String tipfilm;
	



	public Integer getIdfilmtip() {
		return idfilmtip;
	}

	public void setIdfilmtip(Integer idFilm) {
		this.idfilmtip = idFilm;
	}

	public String getTip() {
		return tipfilm;
	}

	public void setTip(String tip) {
		this.tipfilm = tip;
	}

}
