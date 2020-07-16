package com.slokam.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.model.OldLaptapDetails;
import com.slokam.service.OldLapService;

@RestController
@RequestMapping("/goodsservice")
@CrossOrigin
public class OldLapController {

	@Autowired
	private OldLapService ols;
	@Autowired
	private com.slokam.service.MapValidationErrorService mapValidationErrorService;
	// return new ResponseEntity<String>("Project with ID: '"+projectId+"' was
	// deleted", HttpStatus.OK);

	@RequestMapping(value = ("/saveOldLapTap"), method = RequestMethod.POST)
	public ResponseEntity<?> saveOldLap(@Valid @RequestBody OldLaptapDetails old, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
		/*
		 * if(result.hasErrors()){ Map<String,String> errorMap = new
		 * HashMap<>(); for (FieldError error : result.getFieldErrors()) {
		 * errorMap.put(error.getField(), error.getDefaultMessage()); } return
		 * new
		 * ResponseEntity<Map<String,String>>(errorMap,HttpStatus.BAD_REQUEST);
		 * }
		 */
		if (errorMap != null)
			return errorMap;
		OldLaptapDetails oldLp = ols.saveOldLap(old);
		return new ResponseEntity<OldLaptapDetails>(oldLp, HttpStatus.CREATED);

	}

	@RequestMapping(value = ("/getAllOldLapTaps"), method = RequestMethod.GET)
	public List<OldLaptapDetails> getAll() {

		List<OldLaptapDetails> list = ols.getAll();

		return list;
	}

	@GetMapping("/getOneLaptap/{oldLaptapId}")
	public ResponseEntity<OldLaptapDetails> getProjectId(@PathVariable Integer oldLaptapId) {
		OldLaptapDetails old = ols.findByOldLapIdentifier(oldLaptapId);
		return new ResponseEntity(old, HttpStatus.OK);

	}

	@DeleteMapping("/delelteOldLap/{oldLaptapId}")
	public ResponseEntity<?> deleteOldLaptap(@PathVariable Integer oldLaptapId) {

		ols.delelteOldLap(oldLaptapId);
		return new ResponseEntity<String>("OldLapTap with ID :+ '" + oldLaptapId + "'was deleted ", HttpStatus.OK);

	}

}
