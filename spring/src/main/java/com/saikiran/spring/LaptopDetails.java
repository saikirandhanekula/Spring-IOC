package com.saikiran.spring;

public class LaptopDetails {
		String brand = "Dell";
		int price = 500;
		public LaptopDetails(String brand, int price){
			this.brand = brand;
			this.price=price;
		}
		public String getLaptopDetails(){
			return "brand"+brand+"price"+500;
			}
		}
