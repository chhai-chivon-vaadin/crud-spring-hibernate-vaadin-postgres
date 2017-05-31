package com.chhaichivon.crudspringhibernatevaadinpostgres.app.controllers;

import com.chhaichivon.crudspringhibernatevaadinpostgres.app.models.Staff;
import com.chhaichivon.crudspringhibernatevaadinpostgres.app.service.IStaffService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ChhaiChivon on 5/30/2017.
 */

@Controller
public class StaffController {

	@Autowired
	private IStaffService iStaffService;

	@RequestMapping(value = "/delete/{id}")
	public String delete(@PathVariable("id") int id){
		Staff staff = new Staff(id);
		iStaffService.deleteStaff(staff);
		return "redirect:/";
	}

	@RequestMapping(value = "/update/{id}")
	public String update(@PathVariable("int") int id, ModelMap modelMap){
		Staff staff;
		staff = iStaffService.getStaffById(id);
		modelMap.addAttribute("Staff",staff);
		return "staff-update";
	}

	@RequestMapping(value = "/edit",method = RequestMethod.POST)
	public String edit(Staff staff){
		iStaffService.updateStaff(staff);
		return "redirect:/";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Staff staff){
		Staff staff1 = new Staff("firstname","lastname","email");
		iStaffService.saveStaff(staff1);
		System.out.print("Add Staff "+ staff.toString());
		return "redirect:/";
	}

	@RequestMapping(value = "/add-staff")
	public String add(){
		return "add-staff";
	}

	@RequestMapping("/")
	public String index(ModelMap modelMap){
		List<Staff> staffs = iStaffService.listAllStaff();
		modelMap.addAttribute("Staff", staffs);
		return "staff";
	}


	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> list(){
		Map<String, Object> map = new HashMap<>();
		if(!(iStaffService.listAllStaff().isEmpty())){
			responseSuccess(map,iStaffService.listAllStaff());
		}else{
			responseFail(map);
		}
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	public Map<String, Object> responseSuccess(Map<String, Object> map, Object object){
		map.put("DATA" , object);
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
