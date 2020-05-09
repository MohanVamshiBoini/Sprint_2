package com.cap.anurag.service;

import java.util.List;

import com.cap.anurag.entities.DiagnosticCentre;

public interface AdminService {


	void deleteCentreById(String centreId);

	List<DiagnosticCentre> getCentres();

	Boolean getDetails(String centreId);

}
