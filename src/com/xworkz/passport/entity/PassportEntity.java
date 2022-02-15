package com.xworkz.passport.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.passport.constants.BloodGroup;
import com.xworkz.passport.constants.Gender;
import com.xworkz.passport.constants.PassportPersonalType;
import com.xworkz.passport.constants.VerifiedDocuments;
@Entity
@Table(name="passport_details")
public class PassportEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
private int Id;
	@Column(name = "issued_By")
private String issuedBy;
	@Column(name = "issued_At")
private LocalDateTime issuedAt;
	@Column(name = "expires_At")
private LocalDate expiresAt;
	@Column(name = "Gender")
private Gender gender;
	@Column(name = "passport_No")
private long passportNo;
	@Column(name = "Address")
private String address;
	@Column(name = "FullName")
private String fullName;
	@Column(name = "LegalIssue")
private boolean legalIssue;
	@Column(name = "passportType")
private PassportPersonalType  passportPersonalType;
	@Column(name = "DOBirth")
private LocalDate dob;
	@Column(name = "blood_group")
private BloodGroup bloodGroup;
	@Column(name = "verified_Document")
private VerifiedDocuments verifiedDocument;

public PassportEntity(String issuedBy, LocalDateTime issuedAt, LocalDate expiresAt, Gender gender, long passportNo,
		String address, String fullName, boolean legalIssue, PassportPersonalType passportPersonalType, LocalDate dob,
		BloodGroup bloodGroup, VerifiedDocuments verifiedDocument) {
	super();
	this.issuedBy = issuedBy;
	this.issuedAt = issuedAt;
	this.expiresAt = expiresAt;
	this.gender = gender;
	this.passportNo = passportNo;
	this.address = address;
	this.fullName = fullName;
	this.legalIssue = legalIssue;
	this.passportPersonalType = passportPersonalType;
	this.dob = dob;
	this.bloodGroup = bloodGroup;
	this.verifiedDocument = verifiedDocument;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getIssuedBy() {
	return issuedBy;
}
public void setIssuedBy(String issuedBy) {
	this.issuedBy = issuedBy;
}
public LocalDateTime getIssuedAt() {
	return issuedAt;
}
public void setIssuedAt(LocalDateTime issuedAt) {
	this.issuedAt = issuedAt;
}
public LocalDate getExpiresAt() {
	return expiresAt;
}
public void setExpiresAt(LocalDate expiresAt) {
	this.expiresAt = expiresAt;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public long getPassportNo() {
	return passportNo;
}
public void setPassportNo(long passportNo) {
	this.passportNo = passportNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public boolean isLegalIssue() {
	return legalIssue;
}
public void setLegalIssue(boolean legalIssue) {
	this.legalIssue = legalIssue;
}
public PassportPersonalType getPassportPersonalType() {
	return passportPersonalType;
}
public void setPassportPersonalType(PassportPersonalType passportPersonalType) {
	this.passportPersonalType = passportPersonalType;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public BloodGroup getBloodGroup() {
	return bloodGroup;
}
public void setBloodGroup(BloodGroup bloodGroup) {
	this.bloodGroup = bloodGroup;
}
public VerifiedDocuments getVerifiedDocument() {
	return verifiedDocument;
}
public void setVerifiedDocument(VerifiedDocuments verifiedDocument) {
	this.verifiedDocument = verifiedDocument;
} 

}
