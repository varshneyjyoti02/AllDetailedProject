package com.capi.tani.dao;

import com.capi.tani.beans.Product;
import com.capi.tani.exception.ProductNotFound;

public interface ProductDao {
	Product getProductDetails(int prodCode) throws ProductNotFound;

}
