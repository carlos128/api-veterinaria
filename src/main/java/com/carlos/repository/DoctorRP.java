package com.carlos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.entity.DoctorEntity;



@Repository
public interface DoctorRP  extends  JpaRepository<DoctorEntity, Long> {
	Optional<DoctorEntity> findById(Long  id);
}
