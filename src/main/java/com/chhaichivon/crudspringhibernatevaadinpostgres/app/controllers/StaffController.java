package com.chhaichivon.crudspringhibernatevaadinpostgres.app.controllers;

import com.chhaichivon.crudspringhibernatevaadinpostgres.app.models.Staffs;
import com.chhaichivon.crudspringhibernatevaadinpostgres.app.service.StaffService;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Chhai Chivon on 5/30/2017.
 */

@Controller
@RequestMapping(value = "/staff")
public class StaffController {

	@Autowired
	private StaffService staffService;

	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> list(){
		Map<String, Object> map = new HashMap<>();
		if(!(staffService.getAllStaffs().isEmpty())){
			responseSuccess(map,staffService.getAllStaffs());
		}else{
			responseFail(map);
		}
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	public Map<String, Object> responseSuccess(Map<String, Object> map, List<Staffs> objectList){
		map.put("DATA" , objectList);
		map.put("STATUS",true);
		map.put("MESSAGE","SUCCESS");
		return map;
	}
	public Map<String,Object> responseFail(Map<String, Object> map){
		map.put("STATUS", false);
		map.put("MESSAGE","FAIL");
		return map;
	}

}
