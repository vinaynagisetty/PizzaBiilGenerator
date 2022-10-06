package com.pizzabilll.org;

public class Bill {

	public static void main(String[] args) {
//        BasePizza bp=new BasePizza(false);
//        bp.takeAwayopted();
//        bp.bill();
		DeluxePizza dp=new DeluxePizza(true);
		dp.takeAwayopted();
		dp.addExtrToppings();
		dp.bill();
	;
	}

}
