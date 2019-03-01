package com.capi.tani.dao;

import com.capi.tani.beans.Product;
import com.capi.tani.exception.ProductNotFound;
import com.capi.tani.util.CollectionUtil;

public class ProductDaoImpl implements ProductDao{
CollectionUtil cu=new CollectionUtil();
	@Override
	public Product getProductDetails(int prodCode) throws ProductNotFound {
		// TODO Auto-generated method stub
		if(cu.getProducts().get(prodCode)!=null)
		{
		return cu.getProducts().get(prodCode);
		}
		else
		{
		throw new ProductNotFound();
		}
	}

}
