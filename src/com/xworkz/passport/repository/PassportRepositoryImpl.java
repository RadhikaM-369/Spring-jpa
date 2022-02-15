package com.xworkz.passport.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.util.EMFUtil;

public class PassportRepositoryImpl implements PassportRepository {

	@Override
	public void save(PassportEntity entity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
		try {
			entityManager.persist(entity);
			trans.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}
	

}
