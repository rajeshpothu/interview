/*package com.slokam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.model.People;
import com.slokam.service.PeopleService;

@RestController
@RequestMapping("/people")
public class PeopleController {
	
	@Autowired
	private PeopleService peopleservice;

	@RequestMapping(value=("/save"),method=RequestMethod.POST)
	public void save(@RequestBody People people){
		
		People people = new People();
		people.setId(1);
		people.setName("data");
		people.setAge(67);
		people.setQual("btech");
		
		peopleservice.save(people);
		
		//return people;
	}
	
	@RequestMapping(value=("/getall"),method=RequestMethod.GET)
	public List<People>getAll(){
		
		List<People> list = peopleservice.getAll();
		
		return list;
	}
	@RequestMapping(value=("/delete"),method=RequestMethod.DELETE)
	public void delete(@RequestBody People people){
		peopleservice.delete(people);
		
	}
	@RequestMapping(value=("/getid/{id}"),method=RequestMethod.GET)
	public People getoneRecord(@PathVariable Integer id){
		
		return peopleservice.getRecord(id);
		
	}
	
}
*/