package com.sjh.snoopy.dao;
 

import java.util.List;

import com.sjh.snoopy.pojo.Product;
import com.sjh.snoopy.pojo.Property;
import com.sjh.snoopy.pojo.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

	List<PropertyValue> findByProductOrderByIdDesc(Product product);
	PropertyValue getByPropertyAndProduct(Property property, Product product);

	
	
	
}


