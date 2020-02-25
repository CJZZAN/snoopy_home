package com.sjh.snoopy.comparator;


import java.util.Comparator;

import com.sjh.snoopy.pojo.Product;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return (int) (p1.getPromotePrice()-p2.getPromotePrice());
	}

}


