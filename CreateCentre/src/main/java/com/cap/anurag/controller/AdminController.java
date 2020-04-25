package com.cap.anurag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.entities.DiagnosticCentre;
import com.cap.anurag.service.AdminService;

@RestController
@RequestMapping("/DiagnosticCentre")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
@Autowired
AdminService service;
	//Fetches Center Details and maps
	@PostMapping("/create")
	public ResponseEntity<Boolean> create(@RequestBody DiagnosticCentre diagnosticCentre) {
		//service.getCentre(diagnosticCentre.getCentreId());
		diagnosticCentre = service.addCentre(diagnosticCentre);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	/*
	 * @ResponseStatus(value = HttpStatus.FOUND, reason = "centre present")
	 * 
	 * @ExceptionHandler({ Exception.class }) public void handleException() {
	 * 
	 * }
	 */
}
