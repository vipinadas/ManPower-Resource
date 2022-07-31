package com.avantika.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.avantika.dto.Address;
import com.avantika.dto.ManPowerResource;

public class ManPowerDao implements ManPowerDaoInter {
	
	@Override
	public void createEmployeeDao(ManPowerResource employee) {
		Session session = com.avantika.sessionutil.SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(employee);
		transaction.commit();
		com.avantika.sessionutil.SessionUtil.closeSession(session);
		System.out.println(session);
		
	}

	@Override
	public ManPowerResource retrieveManPowerDao(int mId) {
		Session session = com.avantika.sessionutil.SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		//ManPowerResource mPR = session.get(ManPowerResource.class, 1);
		//System.out.println(mPR);
		TypedQuery query=session.createQuery("from ManPowerResource");
		List<ManPowerResource> list=query.getResultList();
	Iterator<ManPowerResource> itr=list.iterator();
	while(itr.hasNext())
	{
		ManPowerResource emp=itr.next();
		System.out.println(emp.getEmployeeId()+" "+ emp.getName()+emp.getEmail());
		Address address=emp.getAddress();
		System.out.println(address.getAddressId()+address.getAddressLine1()+address.getCity()+address.getState()+address.getCountry()+address.getPincode());
	}
		
		transaction.commit();
		session.close();
		return null;
		
	}

	@Override
	public void updateEmployee(ManPowerResource e1) {
		Session session = com.avantika.sessionutil.SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		ManPowerResource employee = (ManPowerResource)session.get(ManPowerResource.class, 1); 
		employee.setEmail("vipinamohandas@gmail.com");
		session.update(employee);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void deleteEmployee(int mId) {
		Session session = com.avantika.sessionutil.SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		ManPowerResource employee = (ManPowerResource)session.get(ManPowerResource.class,mId); 
		session.delete(employee);
		transaction.commit();
		session.close();
	}}
	

