package com.carlos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.entity.UserEntity;


@Repository
public interface UserRP extends  JpaRepository<UserEntity, Long> {
	
	Optional<UserEntity> findByUserName(String  userName);
	Optional<UserEntity> findById(Long  id);
}
