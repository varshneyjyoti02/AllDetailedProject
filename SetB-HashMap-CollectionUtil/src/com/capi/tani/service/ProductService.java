package com.capi.tani.service;

import com.capi.tani.beans.Product;
import com.capi.tani.exception.ProductNotFound;

public interface ProductService {
	Product getProductDetails(int prodCode) throws ProductNotFound;

}
