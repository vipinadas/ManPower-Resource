package com.avantika.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import com.avantika.dto.ManPowerResource;

public class ManPowerResourceDaoImpl implements ManPowerResourceDao {
	@Override
	public void createManPowerResourceDao(ManPowerResource mpr) {
		Session session = com.avantika.sessionutil.SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(mpr);
		transaction.commit();
		com.avantika.sessionutil.SessionUtil.closeSession(session);
		System.out.println(session);

	}

	@Override
	public ManPowerResource retrieveManPowerDao(int mId) {
		Session session = com.avantika.sessionutil.SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		ManPowerResource mPR = session.get(ManPowerResource.class, mId);
		transaction.commit();
		session.close();
		return mPR;

	}

	@Override
	public void updateManPowerResource(ManPowerResource mpr) {

		Session session = com.avantika.sessionutil.SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.update(mpr);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteManPowerResourceDao(int mId) {
		Session session = com.avantika.sessionutil.SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		ManPowerResource mpr = (ManPowerResource) retrieveManPowerDao(mId);
		session.delete(mpr);
		transaction.commit();
		session.close();
	}

	@SuppressWarnings("deprecation")
	@Override
	public void checkManPowerResourceDao() {
		Session session = com.avantika.sessionutil.SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(ManPowerResource.class);
		Criterion criterion1 = Restrictions.idEq(new Integer(1011));
		Criterion criterion2 = Restrictions.gt("mSalary", 10000.00d);
		Criterion criterion3 = Restrictions.lt("mSalary", 50000.00d);
		Criterion criterion4 = Restrictions.and(criterion2, criterion3);
		//criteria.add(criterion1);
		// criteria.add(criterion2);
		// criteria.add(criterion3);
		// criteria.add(criterion4);
		criteria.add(criterion4);
		@SuppressWarnings("unchecked")
		List<ManPowerResource> mpr = criteria.list();
		for (ManPowerResource mpr1 : mpr) {
			System.out.println(mpr1);

		}

	}
}
