package com.xworkz.passport.constants;

public enum Gender {
 Female('F'),Male('M'),Others('O');

private char genderValue;

Gender(char genderValue) {
	this.genderValue=genderValue;
}

public char getGenderValue() {
	return genderValue;
}

}
