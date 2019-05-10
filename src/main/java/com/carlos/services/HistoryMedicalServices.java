package com.carlos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carlos.entity.DoctorEntity;
import com.carlos.entity.HistoryMedicalEntity;
import com.carlos.entity.MascotEntity;
import com.carlos.repository.HistoryMedicalRP;

@Service
public class HistoryMedicalServices {
	@Autowired
	private  HistoryMedicalRP historyMedicalRP;
	
	@SuppressWarnings("unused")
	private HistoryMedicalEntity historyMedicalEntity;
	
	
	public List<HistoryMedicalEntity> get(){
		
		return  historyMedicalRP.findAll();
	}
	public  HistoryMedicalEntity  getId( Long   id ) {
		
		Optional<HistoryMedicalEntity> optional =  historyMedicalRP.findById(id);
		
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( HistoryMedicalEntity historyMedical, 
											DoctorEntity doctorEntity,MascotEntity mascotEntity) throws Exception{
		
		try {
			historyMedical.setDoctorEntity(doctorEntity);
			historyMedical.setMascotEntity(mascotEntity);
			historyMedicalEntity = historyMedicalRP.save(historyMedical);
			return ResponseEntity.status(201).body("Registro  ingresado  con exito");
		}catch (Exception e) {
			return  ResponseEntity.badRequest().body(e);
			
		}
		
	}
	
	public  ResponseEntity<Object>  update( HistoryMedicalEntity  historyMedical,  Long  id){
		
		try {
			@SuppressWarnings("unused")
			Optional<HistoryMedicalEntity>  optional  = historyMedicalRP.findById(id);
			historyMedical.setId(id);
			historyMedicalRP.save(historyMedical);
			return  ResponseEntity.status(201).body( historyMedical);
		} catch (Exception e) {
			return  ResponseEntity.badRequest().body(e);
		}
		
	}
	
	public  void delete( Long  id) {
		
		historyMedicalRP.deleteById(id);
	}
}
