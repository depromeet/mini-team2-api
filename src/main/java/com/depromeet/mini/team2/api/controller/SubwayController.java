package com.depromeet.mini.team2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.depromeet.mini.team2.api.dto.SubwayDTO;
import com.depromeet.mini.team2.api.service.SubwayService;

@RestController
public class SubwayController {
	@Autowired
	private SubwayService subwayService;
	
	@RequestMapping(value= "/api/subways", method = RequestMethod.GET)
	public List<SubwayDTO> getSubways() {
		
		return subwayService.getSubways();
	}
	
	
	
	
}
