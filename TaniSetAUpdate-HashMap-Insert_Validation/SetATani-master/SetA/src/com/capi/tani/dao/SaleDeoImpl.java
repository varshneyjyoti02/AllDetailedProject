package com.capi.tani.dao;

import java.util.HashMap;

import com.capi.tani.bean.Sales;

public class SaleDeoImpl implements SaleDeo {
  
	HashMap<Integer,Sales> salesMap=new HashMap<Integer,Sales>();
	
	@Override
	public HashMap<Integer, Sales> insertSaleDetails(Sales sale) {
		// TODO Auto-generated method stub
		salesMap.put(sale.getSaleId(),sale);
		return salesMap ;
	}

}
