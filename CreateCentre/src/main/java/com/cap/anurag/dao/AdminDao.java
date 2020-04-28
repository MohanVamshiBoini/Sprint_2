package com.cap.anurag.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.anurag.entities.DiagnosticCentre;

public interface AdminDao extends JpaRepository<DiagnosticCentre, String> {
	@Query("select centreName from DiagnosticCentre")
	String getCentre(String centreName);
}
