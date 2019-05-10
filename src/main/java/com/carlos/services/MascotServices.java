package com.carlos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carlos.entity.MascotEntity;
import com.carlos.entity.OwnerEntity;
import com.carlos.repository.MascotRP;

@Service
public class MascotServices {
	
	@Autowired
	private  MascotRP mascotRP;
	
	@SuppressWarnings("unused")
	private MascotEntity mascotEntity;
	
	
	public List<MascotEntity> get(){
		
		return  mascotRP.findAll();
	}
	public  MascotEntity  getId( Long   id ) {
		
		Optional<MascotEntity> optional =  mascotRP.findById(id);
		
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( MascotEntity mascot, OwnerEntity ownerEntity) throws Exception{
		
		try {
			mascot.setOwnerEntity(ownerEntity);;
			mascotEntity = mascotRP.save(mascot);
			return ResponseEntity.status(201).body("Registro  ingresado  con exito");
		}catch (Exception e) {
			return  ResponseEntity.badRequest().body(e);
			
		}
		
	}
	
	public  ResponseEntity<Object>  update( MascotEntity  mascot,  Long  id){
		
		try {
			@SuppressWarnings("unused")
			Optional<MascotEntity>  optional  = mascotRP.findById(id);
			mascot.setId(id);
			mascotRP.save(mascot);
			return  ResponseEntity.status(201).body( mascot);
		} catch (Exception e) {
			return  ResponseEntity.badRequest().body(e);
		}
		
	}
	
	public  void delete( Long  id) {
		
		mascotRP.deleteById(id);
	}

}
