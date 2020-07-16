package com.slokam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.slokam.dao.OldLapRepository;
import com.slokam.exceprionhandling.OldLaptapIdException;
import com.slokam.model.OldLaptapDetails;

@Service
public class OldLapService {
	@Autowired
	private OldLapRepository olp;

	public List<OldLaptapDetails> getAll() {

		List<OldLaptapDetails> list = olp.findAll();

		return list;
	}

	public OldLaptapDetails saveOldLap(OldLaptapDetails old) {
		try {
			OldLaptapDetails saveLap = olp.save(old);
			return saveLap;
		} catch (Exception e) {
			throw new OldLaptapIdException("OldLaptap ID'" + old.getOldLaptapId() + "'already exist");
		}

	}

	public void delelteOldLap(Integer old) {

		olp.delete(old);
	}

	public OldLaptapDetails findByOldLapIdentifier(Integer oldLaptapId) {
		OldLaptapDetails old = null;
		try {

			old = olp.getOne(oldLaptapId);
		} catch (Exception e) {
			throw new OldLaptapIdException("oldLaptapId not exist");
		}
		return old;
	}

}
