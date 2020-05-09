package com.cap.anurag.service;

import java.util.List;

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
	public void deleteCentreById(String centreId) {
		dao.delete(centreId);//JpaRepository method for deleting using centreId
		
	}

	@Override
	public List<DiagnosticCentre> getCentres() {
		return dao.findAll();
	}

	@Override
	public Boolean getDetails(String centreId) {
		return dao.exists(centreId);
	}

	

}
