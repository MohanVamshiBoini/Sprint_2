package com.cap.anurag.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Test")
public class Test {
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String testId;
	private String testName;
	@ManyToOne
	@JoinColumn(name="diag_no")
	private DiagnosticCentre diagnosticCentre;
	@ManyToOne
	@JoinColumn(name="app_no")
	private Appointment appointment;
	public DiagnosticCentre getDiagnosticCentre() {
		return diagnosticCentre;
	}
	public void setDiagnosticCentre(DiagnosticCentre diagnosticCentre) {
		this.diagnosticCentre = diagnosticCentre;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + "]";
	}
}
