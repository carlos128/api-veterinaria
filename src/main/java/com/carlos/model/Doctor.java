package com.carlos.model;

import java.io.Serializable;

public class Doctor  implements   Serializable{

	private static final long serialVersionUID = 1L;
	
	private  long  id;
	private  String  lastName; 
	private  String  firstName;
	private  String  birthdate;
	private  String  createBy;
	private  String  createDt;
	private  String  updateBy;
	private  String  updateDt;
	private  long  fk_id_user_doctor;
	
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
	public String getCreateDt() {
		return createDt;
	}
	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}
	public long getFk_id_user_doctor() {
		return fk_id_user_doctor;
	}
	public void setFk_id_user_doctor(long fk_id_user_doctor) {
		this.fk_id_user_doctor = fk_id_user_doctor;
	}
	
	
	
	
	
}
