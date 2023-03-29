package com.local_church.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.local_church.entity.Life;

@Repository
public interface LifeRepository extends JpaRepository<Life, Integer>{
	@Query(value = "select title, thumbnail, link from Life join Info i where i.church_name = :churchName", nativeQuery = true)
	List<Map<String,Object>> findByInfo_ChurchName(String churchName);
}
