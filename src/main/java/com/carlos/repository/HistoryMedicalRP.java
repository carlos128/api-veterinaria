package com.carlos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.entity.HistoryMedicalEntity;



@Repository
public interface HistoryMedicalRP  extends  JpaRepository<HistoryMedicalEntity, Long>{

}
