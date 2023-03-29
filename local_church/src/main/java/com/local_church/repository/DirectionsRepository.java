package com.local_church.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.local_church.entity.Directions;

@Repository
public interface DirectionsRepository extends JpaRepository<Directions, Integer> {
	@Query(value = "select d.lat,d.lng,d.parking_img from directions d join Info i where i.church_name = :churchName", nativeQuery = true)
	Map<String,Object> findByInfo_ChurchName(@Param("churchName") String churchName);
}
