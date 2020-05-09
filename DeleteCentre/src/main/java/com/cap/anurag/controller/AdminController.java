package com.cap.anurag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.exception.RecordNotFoundException;
import com.cap.anurag.service.AdminService;

@RestController
@RequestMapping("/DiagnosticCentre")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
@Autowired
AdminService service;
	//fetches center id for deleting
	@DeleteMapping("/delete/{centreId}")
	public ResponseEntity<Boolean> deleteCentreById(@PathVariable("centreId") String centreId) {
		Boolean data=service.getDetails(centreId);
		if(Boolean.TRUE.equals(data))
		{
		service.deleteCentreById(centreId);
		return new ResponseEntity<>(true, new HttpHeaders(), HttpStatus.OK);
		}
		else
			throw new RecordNotFoundException("Centre Name found");
	}
	
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> userNotFound(RecordNotFoundException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
