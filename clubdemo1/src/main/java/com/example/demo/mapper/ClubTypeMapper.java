package com.example.demo.mapper;

import java.util.Collection;

import org.apache.ibatis.annotations.Select;

import com.example.demo.entities.ClubType;

public interface ClubTypeMapper {

	@Select("select * from tb_club_type")
	public Collection<ClubType> getAllClubType();
}
