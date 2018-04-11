package com.depromeet.mini.team2.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.depromeet.mini.team2.api.model.Subway;

@Mapper
public interface SubwayMapper {
	List<Subway> findAll();
}
