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

@Entity
@Table(name="sys_mascot")
public class MascotEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long  id;
	
	@Column(length=100)
	private String nameMascot;
	
	@Column(length=100)
	private String  breedMascot;
	
	@Column(length=100)
	private String  sortMascot;
	
	@Column(length=10)
	private int  mascotWeight;
	
	@Column
	@JsonFormat(pattern="yyyy-mm-dd")
	private String  ageMascot;
	
	@Column(length=100)
	private String  createBy;
	
	@Column
	@JsonFormat(pattern="yyyy-mm-dd")
	private String  createDt;
	
	@Column(length=100)
	private String  updateBy;
	
	@Column
	@JsonFormat(pattern="yyyy-mm-dd")
	private String  updateDt;
	
	@JoinColumn(name="fk_id_owner_mascot")
	@ManyToOne
	private OwnerEntity  ownerEntity;

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

	public String getAgeMascot() {
		return ageMascot;
	}

	public void setAgeMascot(String ageMascot) {
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

	public OwnerEntity getOwnerEntity() {
		return ownerEntity;
	}

	public void setOwnerEntity(OwnerEntity ownerEntity) {
		this.ownerEntity = ownerEntity;
	}
	
	
	

}
