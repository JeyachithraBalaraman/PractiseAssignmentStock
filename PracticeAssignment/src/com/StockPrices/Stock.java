package com.StockPrices;

import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;

public class Stock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count, i;
		LinkedList<Double> sharePrice = new LinkedList<Double>();
		LinkedList<Boolean> trueFalse = new LinkedList<Boolean>();
		System.out.println("Stockers");
		System.out.println("Enter number of Companies");
		int n = sc.nextInt();
		for (i = 0; i < n; i++) {
			System.out.println("Enter value of " + (i + 1) + " company Stock");
			sharePrice.add(sc.nextDouble());
			System.out.println("Company Stock Raise/Fall enter true/false ");
			trueFalse.add(sc.nextBoolean());

		} // for
		System.out.println("Details entered");
		System.out.print(sharePrice + " ");
		System.out.println(trueFalse + " ");
		int option = 0;
		do {
			System.out.println("OPERATIONS");
			System.out.println("1.Display the companies stock prices in ascending Order");
			System.out.println("2.Display the companies stock prices in decending Order");
			System.out.println("3.Display the total no. of companies for which stock prices rose today");
			System.out.println("4.Display the total no. of companies for which stock prices declined today");
			System.out.println("5.Search for specific stock price- present or not");
			System.out.println("6.Exit");
			System.out.println("Select operation to be performed- 1 to 6");
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Companies Stock Prices in Ascending order");
				Collections.sort(sharePrice);
				System.out.print(sharePrice);
				System.out.println();
				break;
			case 2:
				System.out.println("Companies Stock Prices in decending order ");
				Collections.sort(sharePrice, Collections.reverseOrder());
				System.out.print(sharePrice);
				System.out.println();
				break;
			case 3:
				count = 0;
				for (i = 0; i < n; i++) {
					if (trueFalse.get(i) == true)
						count++;
				}
				System.out.println("Number of companies for which StockPrices rose today is : " + count);
				break;
			case 4:
				count = 0;
				for (i = 0; i < n; i++) {
					if (trueFalse.get(i) == false)
						count++;
				}
				System.out.println("Number of companies for which StockPrices declined today is :" + count);
				break;
			case 5:
				System.out.println("Enter Value to search for ");
				double s = sc.nextDouble();
				count = 0;
				for (i = 0; i < n; i++) {
					if (sharePrice.get(i) == s)
						count++;
				}
				if (count == 0)
					System.out.println("Value not present");
				else
					System.out.println("Value Present");
				break;
			case 6:
				break;

			}// switch

		} while (option != 0);
		sc.close();
	}// main
}// class
