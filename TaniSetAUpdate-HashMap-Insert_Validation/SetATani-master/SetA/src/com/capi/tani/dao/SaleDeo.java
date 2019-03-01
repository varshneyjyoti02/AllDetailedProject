package com.capi.tani.dao;

import java.util.HashMap;

import com.capi.tani.bean.Sales;

public interface SaleDeo {
	public HashMap<Integer,Sales> insertSaleDetails(Sales sale);

}
