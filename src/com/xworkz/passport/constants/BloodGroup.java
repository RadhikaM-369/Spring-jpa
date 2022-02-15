package com.xworkz.passport.constants;

public enum BloodGroup {
A_POSITIVE("A+"), A_NEGATIVE("A-"),
B_POSTIVE("B+"), B_NEGATIVE("B-"),
AB_POSITIVE("AB+"),AB_NEGATIVE("AB-"),
O_POSITIVE("O+"),O_NEGATIVE("O-");

private String booldGroup;

BloodGroup(String booldGroup) {
this.booldGroup=booldGroup;
}

public String getBooldGroup() {
	return booldGroup;
}

}
