package com.slokam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.model.OldLaptapDetails;


@Repository
public interface OldLapRepository extends JpaRepository<OldLaptapDetails, Integer> {
	
	public OldLaptapDetails findByOldLaptapId(String oldLaptapId);

}
