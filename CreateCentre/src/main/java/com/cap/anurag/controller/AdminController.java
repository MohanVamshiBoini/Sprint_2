package com.cap.anurag.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.entities.DiagnosticCentre;
import com.cap.anurag.service.AdminService;

@RestController
@RequestMapping("/DiagnosticCentre")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	@Autowired
	AdminService service;

	// Fetches Center Details and maps
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/create")
	public ResponseEntity<Boolean> create(@RequestBody DiagnosticCentre diagnosticCentre) {
		String centre = service.getCentre(diagnosticCentre.getCentreName());
		if (centre != null) {
			return new ResponseEntity(false, HttpStatus.FOUND);
		} else {
			Random rand = new Random();
			int rand_int1 = rand.nextInt(1000);
			diagnosticCentre.setCentreId(Integer.toString(rand_int1));
			diagnosticCentre = service.addCentre(diagnosticCentre);
			return new ResponseEntity(true, HttpStatus.OK);
		}
	}

	@ResponseStatus(value = HttpStatus.FOUND, reason = "centre present")
	@ExceptionHandler({ Exception.class })
	public void handleException() {

	}
}