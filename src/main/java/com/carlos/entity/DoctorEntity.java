package com.carlos.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.sun.istack.NotNull;

@Entity 
@Table(name="sys_doctor")
public class DoctorEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  long  id;
	
	@NotNull
	@Column(length=100)
	private  String  lastName;
	
	@NotNull
	@Column(length=100)
	private  String  firstName;
	
	@NotNull
	@Column()
	@JsonFormat(pattern="yyy-mm-dd",shape=Shape.STRING)
	private  String  birthdate;
	
	@NotNull
	@Column(length=100)
	private  String  createBy;
	
	@NotNull
	@Column()
	@JsonFormat(pattern="yyy-mm-dd",shape=Shape.STRING)
	private  String  createDt;
	
	@Column(length=100)
	private  String  updateBy;
	
	@Column()
	@JsonFormat(pattern="yyy-mm-dd",shape=Shape.STRING)
	private  String  updateDt;
	
	@JoinColumn(name="fk_id_user_doctor")
	@OneToOne
	private UserEntity userEntity;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
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
	
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	

}
