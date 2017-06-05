package com.chhaichivon.crudspringhibernatevaadinpostgres.app.repositories;

import com.chhaichivon.crudspringhibernatevaadinpostgres.app.models.Staffs;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Chhai Chivon on 6/5/2017.
 */

public interface StaffRepo {
	public List<Staffs> getAllStaffs();
	public Boolean addNewStaff(Staffs staffs);
	public Boolean updateStaff(Staffs staffs);
	public Boolean deleteStaff(Staffs id);
	public Staffs findStaffById(Long id);

}
