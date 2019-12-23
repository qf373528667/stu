package com.example.demo.entities;

import java.io.Serializable;


public class ClubType implements Serializable{

	private Integer clubType;
	private String clubTypeName;
	
	public ClubType() {
		super();
	}
	public ClubType(Integer clubType, String clubTypeName) {
		super();
		this.clubType = clubType;
		this.clubTypeName = clubTypeName;
	}
	public Integer getClubType() {
		return clubType;
	}
	public void setClubType(Integer clubType) {
		this.clubType = clubType;
	}
	public String getClubTypeName() {
		return clubTypeName;
	}
	public void setClubTypeName(String clubTypeName) {
		this.clubTypeName = clubTypeName;
	}
	@Override
	public String toString() {
		return "ClubType [clubType=" + clubType + ", clubTypeName=" + clubTypeName + "]";
	}
	
}
