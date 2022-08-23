package com.usk.capstone.admin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.usk.capstone.entity.Products;

public class ProductCatalogCRUDD {

	public static void main(String[] args) {
		Collection <Products> c = new ArrayList<Products>();
		Scanner s = new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Insert");
			System.out.println("4.Search");
			System.out.println("5.Deletee");
			System.out.println("Please make a selection : ");
			
			ch = s.nextInt();
			
			switch(ch) {
			
			case 1:
				System.out.print("Enter product id : ");
				int prodId = s.nextInt();
				
				System.out.print("Enter product name : ");
				String prodName = s.toString();
				
				System.out.print("Enter product description : ");
				String prodDesc = s.toString();
				
				System.out.print("Enter product category : ");
				String prodCategory = s.toString();
				
				System.out.print("Enter product upc code : ");
				String prodUPC = s.toString();
				
				System.out.print("Enter product inventory count : ");
				int prodCount = s.nextInt();
				
				System.out.print("Upload product image : ");
				String prodImage = s.toString();
				
				System.out.print("Enter product price : ");
				float prodPrice = s.nextFloat();
				
				System.out.print("Enter product status : ");
				Boolean prodStatus = s.nextBoolean();
				
				c.add(new Products(prodId, prodName, prodDesc, prodCategory,
						prodUPC, prodCount, prodImage, prodPrice, prodStatus));
				
				break;
			}
		} while(ch!=0);
	}

}
