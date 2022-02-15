package com.xworkz.passport.constants;

public enum PassportPersonalType {
REGULAR('R'),DIPLOMATIC('D');

private char c;

PassportPersonalType(char c) {
this.c=c;
}

public char getC() {
	return c;
}
}
