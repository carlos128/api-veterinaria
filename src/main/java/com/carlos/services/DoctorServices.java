package com.carlos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carlos.entity.DoctorEntity;
import com.carlos.entity.UserEntity;
import com.carlos.repository.DoctorRP;



@Service
public class DoctorServices {

	@Autowired
	private  DoctorRP doctorRP;
	
	@SuppressWarnings("unused")
	private DoctorEntity doctorModel;
	
	
	public List<DoctorEntity> get(){
		
		return  doctorRP.findAll();
	}
	public  DoctorEntity  getId( Long   id ) {
		
		Optional<DoctorEntity> optional =  doctorRP.findById(id);
		
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( DoctorEntity doctor, UserEntity userEntity) throws Exception{
		
		try {
			doctor.setUserEntity(userEntity);
			doctorModel = doctorRP.save(doctor);
			return ResponseEntity.status(201).body("Registro  ingresado  con exito");
		}catch (Exception e) {
			return  ResponseEntity.badRequest().body(e);
			
		}
		
	}
	
	public  ResponseEntity<Object>  update( DoctorEntity  doctor,  Long  id){
		
		try {
			@SuppressWarnings("unused")
			Optional<DoctorEntity>  optional  = doctorRP.findById(id);
			doctor.setId(id);
			doctorRP.save(doctor);
			return  ResponseEntity.status(201).body( doctor);
		} catch (Exception e) {
			return  ResponseEntity.badRequest().body(e);
		}
		
	}
	
	public  void delete( Long  id) {
		
		doctorRP.deleteById(id);
	}
}
