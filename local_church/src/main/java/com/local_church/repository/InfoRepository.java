package com.local_church.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.local_church.entity.Info;

@Repository
public interface InfoRepository extends JpaRepository<Info, Integer> {
	Info findByChurchName(String churchName);

}
