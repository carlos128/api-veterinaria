package com.carlos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="sys_owner")
public class OwnerEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  long  id;
	
	@Column(length=100)
	private  String  dni;
	
	@Column(length=100)
	private  String  lastName;
	
	@Column(length=100)
	private  String  firstName;
	
	@Column(length=100)
	private  String  createBy;
	
	@Column
	@JsonFormat(pattern="yyyy-mm-dd",shape=Shape.STRING)
	private  String  createDt;
	
	@Column(length=100)
	private  String  updateBy;
	
	@Column
	@JsonFormat(pattern="yyyy-mm-dd",shape=Shape.STRING)
	private  String  updateDt;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateDt() {
		return createDt;
	}

	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}
	
	 
}
