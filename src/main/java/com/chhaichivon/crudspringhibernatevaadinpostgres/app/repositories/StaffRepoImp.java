package com.chhaichivon.crudspringhibernatevaadinpostgres.app.repositories;

import com.chhaichivon.crudspringhibernatevaadinpostgres.app.models.Staffs;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * Created by Chhai Chivon on 5/30/2017.
 */

@Transactional
@Repository
public class StaffRepoImp implements StaffRepo {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Staffs> getAllStaffs() {
		try{
			return (List<Staffs>)sessionFactory.getCurrentSession()
					.createCriteria(Staffs.class).list();
		}catch (Exception ex){
			System.out.print(ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean addNewStaff(Staffs staffs) {
		try{
			sessionFactory.getCurrentSession().save(staffs);
			return  true;
		}catch (Exception ex){
			ex.printStackTrace();
			System.out.print(ex.getMessage());
		}
		return false;
	}

	@Override
	public Boolean updateStaff(Staffs staffs) {
		try {
			sessionFactory.getCurrentSession().update(staffs);
		}catch (Exception ex){
			System.out.print(ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean deleteStaff(Staffs deleteStaffs) {
		Session session = null;
		try{
			session = sessionFactory.getCurrentSession();
			Staffs staffs = session.get(Staffs.class, deleteStaffs.getStaffId());
			staffs.setStatus(false);
			session.saveOrUpdate(staffs);
			return  true;
		}catch (Exception ex){
			System.out.print(ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public Staffs findStaffById(Long id) {
		try{
			return sessionFactory.getCurrentSession().get(Staffs.class,id);
		}catch (Exception ex){
			System.out.print(ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

}
