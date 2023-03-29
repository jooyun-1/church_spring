package com.local_church.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.local_church.entity.Logo;

@Repository
public interface LogoRepository extends JpaRepository<Logo, Integer>{
	@Query(value = "SELECT l.logo_img FROM Logo l join Info i WHERE i.church_name = :churchName", nativeQuery = true)
	Map<String, Object> findByInfo_ChurchName(@Param("churchName") String churchName); 
}