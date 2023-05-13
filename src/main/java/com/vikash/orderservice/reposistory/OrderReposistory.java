package com.vikash.orderservice.reposistory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vikash.orderservice.entity.OrderEntity;

@Repository
public class OrderReposistory {

	@Autowired
	private SessionFactory sessionFactory;

	public OrderEntity saveOrder(OrderEntity orderEntity) {

		OrderEntity order = null;
		try {
			Session session = sessionFactory.openSession();
			Transaction Transaction = session.beginTransaction();
			order = (OrderEntity) session.merge(orderEntity);
			Transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return order;

	}

}
