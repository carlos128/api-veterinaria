package com.carlos.controller;

import static com.carlos.utilitis.Constans.HISTORIALMEDICAL;
import static com.carlos.utilitis.Constans.HISTORIALMEDICAL_ID;

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

import com.carlos.entity.HistoryMedicalEntity;
import com.carlos.model.HistoryMedical;
import com.carlos.services.DoctorServices;
import com.carlos.services.HistoryMedicalServices;
import com.carlos.services.MascotServices;


@RestController
public class HistoryMedicalController {
  
	@Autowired
	HistoryMedicalServices historyMedicalServices;
	@Autowired
	DoctorServices doctorServices;
	@Autowired
	MascotServices mascotServices;
	
	ModelMapper   mapperModel = new ModelMapper();
	
	@GetMapping(HISTORIALMEDICAL)
	public List<HistoryMedicalEntity> getAcudientes(){
		
		return historyMedicalServices.get();
	}
	
	@PostMapping(HISTORIALMEDICAL)
	public  ResponseEntity<Object>  getUsuario(@RequestBody HistoryMedical historyMedical) throws Exception {
		
		
		HistoryMedicalEntity historyMedicalEntity = mapperModel.map(historyMedical, HistoryMedicalEntity.class);
	
		return historyMedicalServices.add(historyMedicalEntity,
											doctorServices.getId(historyMedical.getFk_id_doctor_hm()),
											mascotServices.getId(historyMedical.getFk_id_mascot_hm()));
		
	}
	
	@PutMapping(HISTORIALMEDICAL_ID)
	public  ResponseEntity<Object> updateUsuario( @RequestBody HistoryMedical usuario, 
													@PathVariable Long  id){
		HistoryMedicalEntity historyMedicalEntity = mapperModel.map(usuario, HistoryMedicalEntity.class);
		return  historyMedicalServices.update(historyMedicalEntity, id);
	}
	
	@DeleteMapping(HISTORIALMEDICAL_ID)
	public  void deleteUsuario( @PathVariable Long  id){
		historyMedicalServices.delete(id);
	}
}
