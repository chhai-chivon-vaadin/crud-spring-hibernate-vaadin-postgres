package com.chhaichivon.crudspringhibernatevaadinpostgres.app.service;

import com.chhaichivon.crudspringhibernatevaadinpostgres.app.models.Staff;

import java.util.List;

/**
 * Created by Kan-Chanproseth on 5/30/2017.
 */
public interface IStaffService {
	public Staff getStaffById(int id);
	public void saveStaff(Staff staff);
	public void updateStaff(Staff  staff);
	public void deleteStaff(Staff staff);
	public List<Staff> listAllStaff();
}
