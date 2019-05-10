package com.carlos.model;

import java.io.Serializable;



public class HistoryMedical  implements  Serializable {

	private static final long serialVersionUID = 1L;
	
	private long   id;
	private String time;
	private String date;
	private String observations;
	private String createBy;
	private String createDt;
	private String updateBy;
	private String updateDt;
	private long fk_id_doctor_hm;
	private long fk_id_mascot_hm;
	
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
	public long getFk_id_doctor_hm() {
		return fk_id_doctor_hm;
	}
	public void setFk_id_doctor_hm(long fk_id_doctor_hm) {
		this.fk_id_doctor_hm = fk_id_doctor_hm;
	}
	public long getFk_id_mascot_hm() {
		return fk_id_mascot_hm;
	}
	public void setFk_id_mascot_hm(long fk_id_mascot_hm) {
		this.fk_id_mascot_hm = fk_id_mascot_hm;
	}
	

}
