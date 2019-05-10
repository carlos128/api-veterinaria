package com.carlos.controller;
import static com.carlos.utilitis.Constans.SIGN_UP_URL;
import static com.carlos.utilitis.Constans.USUARIO_ID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.carlos.entity.UserEntity;
import com.carlos.model.User;
import com.carlos.services.UserServices;
import org.modelmapper.ModelMapper;


@RestController
public class UserController {

	@Autowired
	UserServices userServices;
	ModelMapper   mapperModel = new ModelMapper();
	
	
	@PostMapping(SIGN_UP_URL)
	public  ResponseEntity<Object>  getUsuario(@RequestBody User usuario) throws Exception {
		
		UserEntity userEntity = mapperModel.map(usuario, UserEntity.class);
		
		return userServices.add(userEntity);
		
	}
	
	@PutMapping(USUARIO_ID)
	public  ResponseEntity<Object> updateUsuario( @RequestBody User usuario, 
													@PathVariable Long  id){
		UserEntity userEntity = mapperModel.map(usuario, UserEntity.class);
		return  userServices.update(userEntity, id);
	}
	
	@DeleteMapping(USUARIO_ID)
	public  void deleteUsuario( @PathVariable Long  id){
		userServices.delete(id);
	}
	
}
