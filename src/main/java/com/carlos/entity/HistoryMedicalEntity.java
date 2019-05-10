package com.carlos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="sys_history_medical")
public class HistoryMedicalEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long   id;
	
	@Column
	@JsonFormat(pattern="hh:mm:ss",shape=Shape.STRING)
	private String time;
	
	@Column
	@JsonFormat(pattern="yyy-mm-dd",shape=Shape.STRING)
	private String date;
	
	@Column(length=200)
	private String observations;
	
	@Column(length=200)
	private String createBy;
	
	@Column
	@JsonFormat(pattern="yyy-mm-dd",shape=Shape.STRING)
	private String createDt;
	
	@Column(length=200)
	private String updateBy;
	
	@Column
	@JsonFormat(pattern="yyy-mm-dd",shape=Shape.STRING)
	private String updateDt;
	
	@JoinColumn(name="fk_id_doctor_hm")
	@ManyToOne
	private  DoctorEntity doctorEntity;
	
	@JoinColumn(name="fk_id_mascot_hm")
	@ManyToOne
	private  MascotEntity mascotEntity;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
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

	public DoctorEntity getDoctorEntity() {
		return doctorEntity;
	}

	public void setDoctorEntity(DoctorEntity doctorEntity) {
		this.doctorEntity = doctorEntity;
	}

	public MascotEntity getMascotEntity() {
		return mascotEntity;
	}

	public void setMascotEntity(MascotEntity mascotEntity) {
		this.mascotEntity = mascotEntity;
	}
	
	
	
	
}
