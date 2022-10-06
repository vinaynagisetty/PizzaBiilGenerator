package com.pizzabilll.org;

public class BasePizza {
	private int price;
	private Boolean veg;
	private int extracheesePrice=100;
	private int extratoppingsPrice=50;
	private int takeAwayPrice=20;
	private int basepizzaprice;
	private boolean isextracheeseAdded=false;
	private boolean isextratoppingsAdded=false;
	private boolean istakeawayopted=false;

	
	public BasePizza(Boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price=300;
		}
		else {
			this.price=400;
		}
		basepizzaprice=this.price;
	}
	public void addExtracheese() {
		isextracheeseAdded=true;
		
		this.price +=extracheesePrice;
	}
	public void addExtrToppings() {
		isextratoppingsAdded=true;
		this.price +=extratoppingsPrice;
	}
	public void takeAwayopted() {
		istakeawayopted=true;
		this.price +=takeAwayPrice;
	}
	public void bill() {
		String bill="";
		System.out.println("Base pizza price:"+basepizzaprice);
		if(isextracheeseAdded) {
			bill +="Extra cheese added:"+extracheesePrice+"\n";
		}
		if(isextratoppingsAdded) {
			bill +="Extra Toppings added:"+extratoppingsPrice+"\n";
		}
		if(istakeawayopted) {
			bill +="Take away opted:"+takeAwayPrice+ "\n";
		}
		bill +="total bill :"+this.price + "\n";
		System.out.println(bill);
	
	}
	



	

}
