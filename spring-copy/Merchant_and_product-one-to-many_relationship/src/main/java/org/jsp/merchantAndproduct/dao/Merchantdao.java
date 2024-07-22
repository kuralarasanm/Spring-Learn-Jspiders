package org.jsp.merchantAndproduct.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.jsp.merchantAndproduct.dto.Merchant;
import org.jsp.springempapp.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@SuppressWarnings("all")
@Repository
public class Merchantdao {
	@Autowired
	private EntityManager manager;
	
	public Merchant saveMerchant(Merchant m) {
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(m);
		transaction.begin();
		transaction.commit();
		return m;
	}
	
	public Merchant updateEmployee(Merchant mer) {
		Merchant dbmer = manager.find(Merchant.class, mer.getId());
		if (dbmer != null) {
			EntityTransaction transaction = manager.getTransaction();
			dbmer.setName(mer.getName());
			dbmer.setPhone(mer.getPhone());
			dbmer.setEmail(mer.getEmail());
			dbmer.setPassword(mer.getPassword());
			
			
			transaction.begin();
			transaction.commit();
			return mer;
		}
		return null;
	}
	
	public Merchant findById(int id) {
		return manager.find(Merchant.class, id);
	}
	
	
	public Merchant verifyMerchant(long phone, String password) {
		Query q = manager.createQuery("select m from Merchant m where m.phone=?1 and m.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		try {
			return (Merchant) q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public Merchant verifyMerchant(String email, String password) {
		Query q = manager.createQuery("select m from Merchant m where m.email=?1 and m.password=?2");
		q.setParameter(1, email);
		q.setParameter(2, password);
		try {
			return (Merchant) q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public Merchant verifyMerchant(int id, String password) {
		Query q = manager.createQuery("select m from Merchant m where m.id=?1 and m.password=?2");
		q.setParameter(1, id);
		q.setParameter(2, password);
		try {
			return (Merchant) q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	
}

