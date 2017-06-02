package com.chhaichivon.crudspringhibernatevaadinpostgres.app.service;

import com.chhaichivon.crudspringhibernatevaadinpostgres.app.models.Staffs;
import com.chhaichivon.crudspringhibernatevaadinpostgres.app.repositories.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kan-Chanproseth on 5/30/2017.
 */
@Service
public class StaffService implements IStaffService{

	@Autowired
	private StaffRepo staffRepo;

	@Override
	public Staffs getStaffById(int id) {
		staffRepo.getStaffById(id);
		return null;
	}

	@Override
	public void saveStaff(Staffs staff) {
		staffRepo.saveStaff(staff);
	}

	@Override
	public void updateStaff(Staffs staff) {
		staffRepo.updateStaff(staff);
	}

	@Override
	public void deleteStaff(Staffs staff) {
		staffRepo.deleteStaff(staff);
	}

	@Override
	public List<Staffs> listAllStaff() {
		return staffRepo.listAllStaff();
	}
}
