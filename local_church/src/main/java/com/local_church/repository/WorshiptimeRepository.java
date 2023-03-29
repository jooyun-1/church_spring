package com.local_church.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.local_church.entity.Worshiptime;

@Repository
public interface WorshiptimeRepository extends JpaRepository<Worshiptime, Integer>{
	@Query(value = "select type, part, time, location, manager from worshiptime join Info i "
			+ "where i.church_name = :churchName", nativeQuery = true)
	List<Map<String,Object>> findByInfo_ChurchName(@Param("churchName") String churchName);
}
