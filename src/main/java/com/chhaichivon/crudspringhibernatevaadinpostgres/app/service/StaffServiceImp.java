package com.chhaichivon.crudspringhibernatevaadinpostgres.app.service;

import com.chhaichivon.crudspringhibernatevaadinpostgres.app.models.Staffs;
import com.chhaichivon.crudspringhibernatevaadinpostgres.app.repositories.StaffRepo;
import com.chhaichivon.crudspringhibernatevaadinpostgres.app.repositories.StaffRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chhai Chivon on 5/30/2017.
 */
@Service
public class StaffServiceImp implements StaffService {

	@Autowired
	private StaffRepo staffRepo;

	@Override
	public List<Staffs> getAllStaffs() {
		return staffRepo.getAllStaffs();
	}

	@Override
	public Boolean addNewStaff(Staffs staffs) {
		return staffRepo.addNewStaff(staffs);
	}

	@Override
	public Boolean updateStaff(Staffs staffs) {
		return staffRepo.updateStaff(staffs);
	}

	@Override
	public Boolean deleteStaff(Staffs id) {
		return staffRepo.deleteStaff(id);
	}

	@Override
	public Staffs findStaffById(Long id) {
		return staffRepo.findStaffById(id);
	}
}
