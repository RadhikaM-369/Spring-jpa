package com.xworkz.passport.service;

import java.time.LocalDateTime;

import javax.persistence.PersistenceException;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repository.PassportRepository;
import com.xworkz.passport.repository.PassportRepositoryImpl;

public class PassportServiceImpl implements PassportService {

	PassportRepository dao = new PassportRepositoryImpl();

	public PassportServiceImpl() {
		System.out.println("invoked PassportServiceimpl constructor");
	}

	@Override
	public boolean validateAndSave(PassportEntity pEntity) {
		boolean valid = false;
		try {
			if (pEntity.getIssuedBy().length() < 3 || pEntity.getIssuedBy().length() > 135) {
				valid = false;
				System.out.println("Invalid property Issuedby");
			} else {
				valid = true;
				System.out.println("Valid property Issuedby");
			}

			LocalDateTime now = LocalDateTime.now();
			LocalDateTime localDateTime1 = now.plusMonths(1);
			boolean futureDate = localDateTime1.isAfter(now);
			if (pEntity.getIssuedAt() == null || futureDate == false) {
				valid = false;
				System.out.println("Invalid property IssuedAt");
			} else {
				valid = true;
				System.out.println("Valid property IssuedAt");
			}

			LocalDateTime now1 = LocalDateTime.now();
			LocalDateTime regular = now1.plusYears(10);
			LocalDateTime diplomatic = now1.plusYears(5);
			boolean regular1 = regular.isAfter(now1);
			boolean diplomatic1 = diplomatic.isAfter(now1);
			if (pEntity.getExpiresAt() == null || regular1 == false || diplomatic1 == false) {
				valid = false;
				System.out.println("Invalid property ExpiresAt");
			} else {
				valid = true;
				System.out.println("Valid property ExpiresAt");
			}
			if (pEntity.getGender() == null) {
				valid = false;
				System.out.println("Invalid property getGender ");
			} else {
				valid = true;
				System.out.println("Valid property getGender");
			}
			String passport_no = String.valueOf(pEntity.getPassportNo());
			if (passport_no.length() != 8 || passport_no.matches("^[A-Z][1-9]\\d\\s?\\d{4}[1-9]$") == false) {
				valid = false;
				System.out.println("Invalid property Passport Number");
			} else {
				valid = true;
				System.out.println("Valid property PassportNumber");
			}
			if (pEntity.getAddress() == null || pEntity.getAddress().length() < 20
					|| pEntity.getAddress().length() > 200) {
				valid = false;
				System.out.println("Invalid property Address");
			} else {
				valid = true;
				System.out.println("Valid property Address");
			}
			if (pEntity.getFullName() == null || pEntity.getFullName().length() < 10
					|| pEntity.getFullName().length() > 200) {
				valid = false;
				System.out.println("Invalid property FullName");
			} else {
				valid = true;
				System.out.println("Valid property FullName");
			}

			if (pEntity.isLegalIssue() == true) {
				valid = false;
				System.out.println("Invalid property LegalIssue");
			} else {
				valid = true;
				System.out.println("Valid property LegalIssue");
			}

			if (pEntity.getPassportPersonalType() == null) {
				valid = false;
				System.out.println();
			} else {

			}

			boolean dob = regular.isBefore(now1);
			if (pEntity.getDob() == null || dob==false)

				if (pEntity.getBloodGroup() == null) {
					valid = false;
					System.out.println("Invalid property BloodGroup");
				} else {
					valid = true;
					System.out.println("Valid property BloodGroup");
				}

			if (pEntity.getVerifiedDocument() == null) {
				valid = false;
				System.out.println("Invalid property VerifiedDocument");
			} else {
				valid = true;
				System.out.println("Valid property VerifiedDocument");
			}
			if(valid)
			{
			dao.save(pEntity);
			}
			else{
				System.out.println("invalid entity");
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {

		}
		return false;
	}

}
