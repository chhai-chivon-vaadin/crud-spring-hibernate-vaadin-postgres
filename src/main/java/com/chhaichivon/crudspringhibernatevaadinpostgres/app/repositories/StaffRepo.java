package com.chhaichivon.crudspringhibernatevaadinpostgres.app.repositories;

import com.chhaichivon.crudspringhibernatevaadinpostgres.app.models.Staff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Kan-Chanproseth on 5/30/2017.
 */

@Repository
@Transactional
public class StaffRepo {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public void saveStaff(Staff  staff){
		getSession().save(staff);
	}

	public void updateStaff(Staff staff){
		getSession().update(staff);
	}

	public void deleteStaff(Staff staff){
		getSession().delete(staff);
	}

	public Staff getStaffById(int id){
		return getSession().get(Staff.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Staff> listAllStaff(){
		return getSession().createQuery("from Staff").list();
	}
}
