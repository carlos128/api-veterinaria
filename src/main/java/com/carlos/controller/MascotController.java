package com.carlos.controller;

import static com.carlos.utilitis.Constans.MASCOT;
import static com.carlos.utilitis.Constans.MASCOT_ID;

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

import com.carlos.entity.MascotEntity;
import com.carlos.model.Mascot;
import com.carlos.services.MascotServices;
import com.carlos.services.OwnerServices;

@RestController
public class MascotController {

	@Autowired
	MascotServices mascotServices;
	@Autowired
	OwnerServices  ownerServices;
	ModelMapper   mapperModel = new ModelMapper();
	
	@GetMapping(MASCOT)
	public List<MascotEntity> getAcudientes(){
		
		return mascotServices.get();
	}
	
	@PostMapping(MASCOT)
	public  ResponseEntity<Object>  getUsuario(@RequestBody Mascot mascot) throws Exception {
		
		
		MascotEntity mascotEntity = mapperModel.map(mascot, MascotEntity.class);
	
		return mascotServices.add(mascotEntity,ownerServices.getId(mascot.getFk_id_owner_mascot()));
		
	}
	
	@PutMapping(MASCOT_ID)
	public  ResponseEntity<Object> updateUsuario( @RequestBody Mascot usuario, 
													@PathVariable Long  id){
		MascotEntity mascotEntity = mapperModel.map(usuario, MascotEntity.class);
		return  mascotServices.update(mascotEntity, id);
	}
	
	@DeleteMapping(MASCOT_ID)
	public  void deleteUsuario( @PathVariable Long  id){
		mascotServices.delete(id);
	}

}
