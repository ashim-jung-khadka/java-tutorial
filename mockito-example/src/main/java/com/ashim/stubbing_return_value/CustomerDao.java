package com.ashim.stubbing_return_value;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

public class CustomerDao {

	@PersistenceContext
	private EntityManager entityManager;

	public CustomerDao(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

	public Optional<Customer> findById(long expectedId) {
		return Optional.ofNullable(entityManager.find(Customer.class, expectedId));
	}
}
