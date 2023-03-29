package com.local_church.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.local_church.entity.BusInfo;

@Repository
public interface BusInfoRepository extends JpaRepository<BusInfo, Integer>{
	@Query(value = "select img from bus_info join info i where i.church_name = :churchName", nativeQuery = true)
	Map<String, Object> findByInfo_ChurchName(@Param("churchName") String churchName);
}
