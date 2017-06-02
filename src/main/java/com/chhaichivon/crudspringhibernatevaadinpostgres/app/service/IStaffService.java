package com.chhaichivon.crudspringhibernatevaadinpostgres.app.service;

import com.chhaichivon.crudspringhibernatevaadinpostgres.app.models.Staffs;

import java.util.List;

/**
 * Created by Kan-Chanproseth on 5/30/2017.
 */
public interface IStaffService {
	public Staffs getStaffById(int id);
	public void saveStaff(Staffs staff);
	public void updateStaff(Staffs staff);
	public void deleteStaff(Staffs staff);
	public List<Staffs> listAllStaff();
}
