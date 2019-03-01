package com.capi.tani.ui;

import java.util.Scanner;

import com.capi.tani.dao.ProductDao;
import com.capi.tani.dao.ProductDaoImpl;
import com.capi.tani.exception.ProductNotFound;
import com.capi.tani.service.ProductService;
import com.capi.tani.service.ProductServiceImpl;

public class MainProduct {
	public static void main(String[] args) throws ProductNotFound
	{
		String name;
		String category;
		int price;
		int qty;
		int id;
		ProductDao pd=new ProductDaoImpl();
		ProductService ps=new ProductServiceImpl(pd);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1. to fetch bill and 2. to exit");
		int ch=sc.nextInt();
		while(true)
		{
			
		
		switch(ch) {
		case 1:
			
			id=sc.nextInt();
			qty=sc.nextInt();
			
			if(qty<=0)
			{
				System.out.println("Quantity is not Valid");
				break;
			}
			int temp=id/1000;
			if(temp<=0||temp>9)
			{
				
				System.out.println("Code is not Valid");
				break;
			}
			
			
				try {
			System.out.println("Product Code :"+ps.getProductDetails(id).getId());
			System.out.println("Product Name :"+ps.getProductDetails(id).getName());
			System.out.println("Product Category :"+ps.getProductDetails(id).getCategory());
			System.out.println("Product Price :"+ps.getProductDetails(id).getPrice());
			System.out.println("Quantity :"+qty);
			System.out.println("Line Total :"+qty*ps.getProductDetails(id).getPrice());
			
				}
				catch(ProductNotFound p)
				{
					System.out.println(p);
				}
			break;
			
		case 2 :System.exit(0);
			break;
			
		}
	}

}
}
