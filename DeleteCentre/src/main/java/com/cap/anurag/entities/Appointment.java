package com.cap.anurag.entities;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Appointment")
public class Appointment {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String userId;
	private BigInteger appointmentid;
	@OneToOne(mappedBy = "appointment", cascade = CascadeType.ALL)
	private Test test;
	private Date datetime;
	private boolean approved;
	@ManyToOne
	@JoinColumn(name="dia_no")
	private DiagnosticCentre diagnosticCentre;

	public DiagnosticCentre getDiagnosticCentre() {
		return diagnosticCentre;
	}

	public void setDiagnosticCentre(DiagnosticCentre diagnosticCentre) {
		this.diagnosticCentre = diagnosticCentre;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BigInteger getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(BigInteger appointmentid) {
		this.appointmentid = appointmentid;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public DiagnosticCentre getCentre() {
		return diagnosticCentre;
	}

	public void setCentre(DiagnosticCentre diagnosticCentre) {
		this.diagnosticCentre = diagnosticCentre;
	}

	@Override
	public String toString() {
		return "Appointment [userId=" + userId + ", appointmentid=" + appointmentid + ", test=" + test + ", datetime="
				+ datetime + ", approved=" + approved + ", diagnosticCentre=" + diagnosticCentre + "]";
	}

}
