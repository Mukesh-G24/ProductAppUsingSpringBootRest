package com.cts.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaProvider {
	
	public static EntityManager getJpaProvider() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lunchtime");
		return emf.createEntityManager();
		
	}
}
