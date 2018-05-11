package com.assignment3.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="subscribe")


public class Subscribe {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idsubscribe", unique = true, nullable = false)
	private Integer idsubscribe;
	@Column
	private Integer iduser;
	@Column
	private Integer idfilmtip;
	
	
	
	public Integer getIdsubscribe() {
		return idsubscribe;
	}
	public void setIdsubscribe(Integer idsubscribe) {
		this.idsubscribe = idsubscribe;
	}
	public Integer getIduser() {
		return iduser;
	}
	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}
	public Integer getIdfilmtip() {
		return idfilmtip;
	}
	public void setIdfilmtip(Integer idfilmtip) {
		this.idfilmtip = idfilmtip;
	}
	


}
