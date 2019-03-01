package com.capi.tani.service;

import java.util.HashMap;

import com.capi.tani.bean.Sales;
import com.capi.tani.exception.ProductNameIsNumeric;

public interface SaleService {
	
		public HashMap<Integer,Sales> insertSaleDetails(Sales sale) throws ProductNameIsNumeric;
		public boolean validateProductCode(int prodId);
		boolean validateQuantity(int qty);
		public boolean validateProductCat(String prodCat);
		public boolean validateProductName(String prodName,String prodCat) throws ProductNameIsNumeric;
		public boolean validateProductPrice(float price);
		//boolean validateProductName(String prodName, String prodCat);

	}



