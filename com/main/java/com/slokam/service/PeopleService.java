/*package com.slokam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.dao.Peopledao;
import com.slokam.model.People;

@Service
public class PeopleService {
	
	@Autowired
	private Peopledao peopledao;
	
	
	public void save(People people){
		
		peopledao.save(people);
		
	}
	
	public List<People>getAll(){
		
		List<People> list = peopledao.findAll();
		
		return list;
	}

public void delete(People people){
	peopledao.delete(people);
		
	}

  public People getRecord(Integer id){
	  
	  peopledao.getOne(id);
	  
	 return null;
	
}
	
	
}
*/