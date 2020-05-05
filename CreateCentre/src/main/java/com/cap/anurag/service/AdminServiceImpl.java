package com.cap.anurag.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.anurag.dao.AdminDao;
import com.cap.anurag.entities.DiagnosticCentre;
@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Autowired
    AdminDao dao;
	@Override
	public DiagnosticCentre addCentre(DiagnosticCentre diagnosticCentre) {
		return dao.save(diagnosticCentre);//JpaRepository method to create
	}

	@Override
	public String getCentre(String centreName) {
		return dao.getCentre(centreName);
	}
	

}
