package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@SuppressWarnings("serial")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Club implements Serializable{

	private String clubName;		//club_name      | varchar(30)
	private String clubHeader;		//club_header    | varchar(30)
//	private Integer clubType;		//club_type      | int(3) unsigned
	private ClubType clubType;
	private Date creatime;			//creatime       | timestamp
	private Integer activeNumber;	//active_number  | int(6) unsigned
	private Integer membersNumber;	//members_number | int(6) unsigned
	private String clubComments;	//club_comments  | varchar(50)
	
}
