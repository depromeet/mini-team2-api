package com.depromeet.mini.team2.api.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.depromeet.mini.team2.api.dto.SubwayDTO;
import com.depromeet.mini.team2.api.mapper.SubwayMapper;
import com.depromeet.mini.team2.api.model.Subway;

@Service
public class SubwayServiceImpl implements SubwayService{
	private Logger logger = LoggerFactory.getLogger(SubwayServiceImpl.class);
	
	@Autowired
	private SubwayMapper subwayMapper;
	
	@Override
	public List<SubwayDTO> getSubways() {
		// TODO Auto-generated method stub
		List<Subway> subways = subwayMapper.findAll();
		if(Objects.isNull(subways)|| CollectionUtils.isEmpty(subways))
			return Collections.emptyList();
		logger.debug(String.valueOf(subways.size()));
		logger.debug(subways.get(0).toString());
		
		List<SubwayDTO> subwayDTOs = new ArrayList<>();
		for (Subway subway : subways) {
			logger.debug(subway.toString());
			subwayDTOs.add(subway.toSubwayDTO());
		}
		return subwayDTOs;
	}
}
