package com.mywms.data.jpa.repository;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class RepoProvider {
	private static final RepoProvider SELF = new RepoProvider();

	public static RepoProvider getInstance() {
		return SELF;
	}
	
	@PersistenceContext 
	private EntityManager entityManager;
	
	
	private static final Map<String, JpaRepository> cacheSimpleJpaRepository = new HashMap<String, JpaRepository>();
	
	public <T> JpaRepository<T,Serializable> getJpaRepository(Class<T> domainClass) {
		String domainClassName = domainClass.getSimpleName();
		JpaRepository<T,Serializable> jpaRepository = cacheSimpleJpaRepository.get(domainClassName);
		if(null==jpaRepository) {
			jpaRepository = new SimpleJpaRepository<T,Serializable>(domainClass, entityManager);
			cacheSimpleJpaRepository.put(domainClassName, jpaRepository);
		}
		return jpaRepository;
	}

}

