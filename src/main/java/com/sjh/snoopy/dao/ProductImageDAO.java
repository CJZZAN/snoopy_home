package com.sjh.snoopy.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjh.snoopy.pojo.Product;
import com.sjh.snoopy.pojo.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
	public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
	
}


