package com.chhaichivon.crudspringhibernatevaadinpostgres.app.service;

import com.chhaichivon.crudspringhibernatevaadinpostgres.app.models.Staffs;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chhai Chivon on 5/30/2017.
 */
public interface StaffService {
	public List<Staffs> getAllStaffs();
	public Boolean addNewStaff(Staffs staffs);
	public Boolean updateStaff(Staffs staffs);
	public Boolean deleteStaff(Staffs id);
	public Staffs findStaffById(Long id);
}
