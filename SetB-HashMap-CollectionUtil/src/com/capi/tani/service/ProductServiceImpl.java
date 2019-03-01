package com.capi.tani.service;

import com.capi.tani.beans.Product;
import com.capi.tani.dao.ProductDao;
import com.capi.tani.dao.ProductDaoImpl;
import com.capi.tani.exception.ProductNotFound;

public class ProductServiceImpl implements ProductService{
ProductDao pd=new ProductDaoImpl();
	public ProductServiceImpl(ProductDao pd) {
		// TODO Auto-generated constructor stub
		this.pd=pd;
		
	}

	@Override
	public Product getProductDetails(int prodCode) throws ProductNotFound {
		// TODO Auto-generated method stub
		return pd.getProductDetails(prodCode);
	}

}
