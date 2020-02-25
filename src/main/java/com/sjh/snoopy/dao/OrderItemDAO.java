package com.sjh.snoopy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjh.snoopy.pojo.Order;
import com.sjh.snoopy.pojo.OrderItem;
import com.sjh.snoopy.pojo.Product;
import com.sjh.snoopy.pojo.User;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}

