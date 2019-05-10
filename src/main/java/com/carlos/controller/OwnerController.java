package com.carlos.controller;

import static com.carlos.utilitis.Constans.OWNER;
import static com.carlos.utilitis.Constans.OWNER_ID;

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

import com.carlos.entity.OwnerEntity;
import com.carlos.model.Owner;
import com.carlos.services.OwnerServices;


@RestController
public class OwnerController {
	 
	@Autowired
	OwnerServices ownerServices;
	ModelMapper   mapperModel = new ModelMapper();
	
	@GetMapping(OWNER)
	public List<OwnerEntity> getAcudientes(){
		
		return ownerServices.get();
	}
	
	@PostMapping(OWNER)
	public  ResponseEntity<Object>  getUsuario(@RequestBody Owner owner) throws Exception {
		
		
		OwnerEntity ownerEntity = mapperModel.map(owner, OwnerEntity.class);
	
		return ownerServices.add(ownerEntity);
		
	}
	
	@PutMapping(OWNER_ID)
	public  ResponseEntity<Object> updateUsuario( @RequestBody Owner usuario, 
													@PathVariable Long  id){
		OwnerEntity ownerEntity = mapperModel.map(usuario, OwnerEntity.class);
		return  ownerServices.update(ownerEntity, id);
	}
	
	@DeleteMapping(OWNER_ID)
	public  void deleteUsuario( @PathVariable Long  id){
		ownerServices.delete(id);
	}

}
