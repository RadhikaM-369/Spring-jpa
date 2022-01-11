package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tourist_Table")
public class TouristEntity implements Serializable{
	@Id
	@Column(name="tid")
private int id;
	
	@Column(name="tlocation")
private String location;
	
	@Column(name="tSealevelfamous")
private int sealevel;
	
	@Column(name="tfamous")
private String famousFor;
	
	@Column(name="tEntryFee")
private int entryFee;
	
	@Column(name="tseason")
private String season;

public TouristEntity() {
	
}

public TouristEntity(int id, String location, int sealevel, String famousFor, int entryFee, String season) {
	this.id = id;
	this.location = location;
	this.sealevel = sealevel;
	this.famousFor = famousFor;
	this.entryFee = entryFee;
	this.season = season;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public int getSealevel() {
	return sealevel;
}

public void setSealevel(int sealevel) {
	this.sealevel = sealevel;
}

public String getFamousFor() {
	return famousFor;
}

public void setFamousFor(String famousFor) {
	this.famousFor = famousFor;
}

public int getEntryFee() {
	return entryFee;
}

public void setEntryFee(int entryFee) {
	this.entryFee = entryFee;
}

public String getSeason() {
	return season;
}

public void setSeason(String season) {
	this.season = season;
}

@Override
public String toString() {
	return "TouristEntity [id=" + id + ", location=" + location + ", sealevel=" + sealevel + ", famousFor=" + famousFor
			+ ", entryFee=" + entryFee + ", season=" + season + "]";
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}


}
