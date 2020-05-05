package com.cap.anurag.service;

import com.cap.anurag.entities.DiagnosticCentre;

public interface AdminService {

	DiagnosticCentre addCentre(DiagnosticCentre diagnosticCentre);

	String getCentre(String centreName);


}
