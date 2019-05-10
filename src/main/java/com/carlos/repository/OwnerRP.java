package com.carlos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.entity.OwnerEntity;


@Repository
public interface OwnerRP  extends  JpaRepository<OwnerEntity, Long> {

}
