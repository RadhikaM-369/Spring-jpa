package com.xworkz.passport.constants;

public enum VerifiedDocuments {
ADHARCARD("Adhar_no"),BIRTH_CERTIFICATE("Birth_certificate"),MARKSCARD("Markscard"),DRIVINGLICENCE("DL");

private String value;

VerifiedDocuments(String Value) {
	this.value=value;
}

public String getValue() {
	return value;
}


}
