package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cts.dao.InterviewRepository;
import com.cts.exceprionhandling.IntreviewIdException;
import com.cts.model.InterviewDetails;

@Service
public class InterviewService {
	@Autowired
	private InterviewRepository olp;
	@Autowired
	public List<InterviewDetails> getAll() {

		List<InterviewDetails> list = olp.findAll();

		return list;
	}

	public InterviewDetails saveOldLap(InterviewDetails old) {
		try {
			InterviewDetails saveLap = olp.save(old);
			return saveLap;
		} catch (Exception e) {
			throw new IntreviewIdException("Interview ID'" + old.getInterviewId() + "'already exist");
		}

	}
	public void updateInterview(int id) {
		try {
			olp.findByinterviewId(id);
		} catch (Exception e) {
			throw new IntreviewIdException("Interview ID'" + "InterviewDetails.getInterviewId()" + "'already exist");
		}

	}

	public void updateSave(InterviewDetails i){
		
		olp.save(i);
	}
	public void delelteInterview(Integer old) {
		olp.delete(old);
	}

	public InterviewDetails findByOldLapIdentifier(Integer oldLaptapId) throws IntreviewIdException{
		InterviewDetails old = null;
		try {

			old = olp.getOne(oldLaptapId);
		} catch (Exception e) {
			throw new IntreviewIdException("oldLaptapId not exist");
		}
		return old;
	}

	public void deleteInterview(int id) {

		olp.delete(id);
		
	}
	public InterviewDetails getInterviewObjectFromListById(int id) {
          return olp.getOne(id);		
	}
	 public List<InterviewDetails> listAll(String keyword) {
	        if (keyword != null) {
	           
	          List<InterviewDetails> search = olp.search(keyword);
	          return search;
	        }
	        return olp.findAll();
	    }
	 
	 //findByname based on click from UI
		public List<InterviewDetails>findByInterviewQuestion(String interviewQuestion){
			return olp.findByInterviewQuestion(interviewQuestion);
		}
		 }
