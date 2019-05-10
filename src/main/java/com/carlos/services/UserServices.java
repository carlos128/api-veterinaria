package com.carlos.services;


import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.carlos.entity.UserEntity;
import com.carlos.repository.UserRP;



@Service
public class UserServices {
	
	@Autowired
	private  UserRP userRP;
	@SuppressWarnings("unused")
	private UserEntity userModel;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public  UserEntity  getId( Long  id ) {
		
		Optional<UserEntity> optional =  userRP.findById(id);
		
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( UserEntity user) throws Exception{
		
		try {
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			userModel = userRP.save(user);
			return ResponseEntity.status(201).body("Registro  ingresado  con exito");
		}catch (Exception e) {
			return  ResponseEntity.badRequest().body(e);
			
		}
		
	}
	
	public  ResponseEntity<Object>  update( UserEntity  user,  Long  id){
		
		try {
			@SuppressWarnings("unused")
			Optional  <UserEntity>  optional  = userRP.findById(id);
			user.setId(id);
			userRP.save(user);
			return  ResponseEntity.status(201).body( user);
		} catch (Exception e) {
			return  ResponseEntity.badRequest().body(e);
		}
		
	}
	
	public  void delete( Long  id) {
		
		userRP.deleteById(id);
	}

}
