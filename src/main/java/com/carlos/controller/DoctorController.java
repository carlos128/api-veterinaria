package com.carlos.controller;

import static com.carlos.utilitis.Constans.DOCTOR;
import static com.carlos.utilitis.Constans.DOCTOR_ID;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.entity.DoctorEntity;
import com.carlos.model.Doctor;
import com.carlos.services.DoctorServices;
import com.carlos.services.UserServices;


@RestController
public class DoctorController {
	
	@Autowired
	DoctorServices doctorServices;
	@Autowired
	UserServices  userServices;
	ModelMapper   mapperModel = new ModelMapper();
	
	@GetMapping(DOCTOR)
	public List<DoctorEntity> getAcudientes(){
		
		return doctorServices.get();
	}
	
	@PostMapping(DOCTOR)
	public  ResponseEntity<Object>  getUsuario(@RequestBody Doctor doctor) throws Exception {
		
		
		DoctorEntity doctorEntity = mapperModel.map(doctor, DoctorEntity.class);
	
		return doctorServices.add(doctorEntity,userServices.getId(doctor.getFk_id_user_doctor()));
		
	}
	
	@PutMapping(DOCTOR_ID)
	public  ResponseEntity<Object> updateUsuario( @RequestBody Doctor usuario, 
													@PathVariable Long  id){
		DoctorEntity doctorEntity = mapperModel.map(usuario, DoctorEntity.class);
		return  doctorServices.update(doctorEntity, id);
	}
	
	@DeleteMapping(DOCTOR_ID)
	public  void deleteUsuario( @PathVariable Long  id){
		doctorServices.delete(id);
	}

}
