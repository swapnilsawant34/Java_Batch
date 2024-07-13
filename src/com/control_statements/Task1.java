package com.control_statements;

//Consider a deal of a product, determine whether profit or loss earned in the deal based on buying and selling prices
public class Task1 {

	public static void main(String[] args) {
		  int sellingPrice=100;
		  int buyingPrice=200;
		
		 if (sellingPrice > buyingPrice) {
	            int profit = sellingPrice - buyingPrice;
	            System.out.println("Profit earned: " + profit);
	        } else if (sellingPrice < buyingPrice) {
	            int loss = buyingPrice - sellingPrice;
	            System.out.println("Loss" + loss);
	        } else {
	            System.out.println("no profit, no loss.");
	        }
		

	}

}
