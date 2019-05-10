package com.carlos.model;

import java.io.Serializable;

public class Mascot  implements  Serializable{

	private static final long serialVersionUID = 1L;
	
	private long  id;
	private String nameMascot;
	private String breedMascot;
	private String sortMascot;
	private int  mascotWeight;
	private int  ageMascot;
	private String createBy;
	private String createDt;
	private String updateBy;
	private String updateDt;
	private Long  fk_id_owner_mascot;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameMascot() {
		return nameMascot;
	}
	public void setNameMascot(String nameMascot) {
		this.nameMascot = nameMascot;
	}
	public String getBreedMascot() {
		return breedMascot;
	}
	public void setBreedMascot(String breedMascot) {
		this.breedMascot = breedMascot;
	}
	public String getSortMascot() {
		return sortMascot;
	}
	public void setSortMascot(String sortMascot) {
		this.sortMascot = sortMascot;
	}
	public int getMascotWeight() {
		return mascotWeight;
	}
	public void setMascotWeight(int mascotWeight) {
		this.mascotWeight = mascotWeight;
	}
	public int getAgeMascot() {
		return ageMascot;
	}
	public void setAgeMascot(int ageMascot) {
		this.ageMascot = ageMascot;
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
	public Long getFk_id_owner_mascot() {
		return fk_id_owner_mascot;
	}
	public void setFk_id_owner_mascot(Long fk_id_owner_mascot) {
		this.fk_id_owner_mascot = fk_id_owner_mascot;
	}
	

}
