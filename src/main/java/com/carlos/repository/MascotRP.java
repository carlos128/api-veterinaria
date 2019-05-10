package com.carlos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.entity.MascotEntity;


@Repository
public interface MascotRP extends  JpaRepository<MascotEntity, Long>{
	Optional<MascotEntity> findById(Long  id);
}
