package com.carlos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carlos.entity.OwnerEntity;
import com.carlos.repository.OwnerRP;

@Service
public class OwnerServices {
	
	@Autowired
	private  OwnerRP ownerRP;
	
	@SuppressWarnings("unused")
	private OwnerEntity ownerEntity;
	
	
	public List<OwnerEntity> get(){
		
		return  ownerRP.findAll();
	}
	public  OwnerEntity  getId( Long   id ) {
		
		Optional<OwnerEntity> optional =  ownerRP.findById(id);
		
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( OwnerEntity owner) throws Exception{
		
		try {
			
			ownerEntity = ownerRP.save(owner);
			return ResponseEntity.status(201).body("Registro  ingresado  con exito");
		}catch (Exception e) {
			return  ResponseEntity.badRequest().body(e);
			
		}
		
	}
	
	public  ResponseEntity<Object>  update( OwnerEntity  owner,  Long  id){
		
		try {
			@SuppressWarnings("unused")
			Optional<OwnerEntity>  optional  = ownerRP.findById(id);
			owner.setId(id);
			ownerRP.save(owner);
			return  ResponseEntity.status(201).body( owner);
		} catch (Exception e) {
			return  ResponseEntity.badRequest().body(e);
		}
		
	}
	
	public  void delete( Long  id) {
		
		ownerRP.deleteById(id);
	}


}
