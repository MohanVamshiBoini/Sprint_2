package com.cap.anurag.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "diagnosticcentre")
public class DiagnosticCentre {
	@Id
	private String centreId;
	private String centreName;
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "test_c_id")
	private List<Test> listOfTests = new ArrayList<Test>();
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "appointment_c_id")
	private List<Appointment> appointmentList = new ArrayList<Appointment>();

	public List<Test> getListOfTests() {
		return listOfTests;
	}

	public void setListOfTests(List<Test> listOfTests) {
		this.listOfTests = listOfTests;
	}

	public String getCentreId() {
		return centreId;
	}

	public void setCentreId(String centreId) {
		this.centreId = centreId;
	}

	public String getCentreName() {
		return centreName;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	@Override
	public String toString() {
		return "DiagnosticCentre [centreId=" + centreId + ", centreName=" + centreName + ", listOfTests=" + listOfTests
				+ ", appointmentList=" + appointmentList + "]";
	}

}

