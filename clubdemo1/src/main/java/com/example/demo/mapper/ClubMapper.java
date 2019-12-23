package com.example.demo.mapper;

import java.util.Collection;

import org.apache.ibatis.annotations.Delete;

import com.example.demo.entities.Club;

public interface ClubMapper {

	Collection<Club> getAllClub();

	void insertClub(Club club);

	@Delete("delete from tb_club where club_name=#{clubName}")
	void delete(String clubName);

	Club getClubByName(String name);

	void updateClub(Club club);

}
