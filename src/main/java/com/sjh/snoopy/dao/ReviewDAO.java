package com.sjh.snoopy.dao;
 
import java.util.List;

import com.sjh.snoopy.pojo.Product;
import com.sjh.snoopy.pojo.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDAO extends JpaRepository<Review,Integer>{

	List<Review> findByProductOrderByIdDesc(Product product);
	int countByProduct(Product product);

}


