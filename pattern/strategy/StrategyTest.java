package com.pattern.strategy;

import com.pattern.strategy.payport.PayType;

public class StrategyTest {

	public static void main(String[] args) {

		System.out.println("策略模式测试");
		
		Order order = new Order("10", "1000", 123.45);
		
		System.out.println("===支付方法 pay");
		order.pay(PayType.ALI);
		order.pay(PayType.TX);
		order.pay(PayType.JD);
		
		System.out.println("===支付方法 pay1");
		order.pay1(PayType.ALI);
		order.pay1(PayType.TX);
		order.pay1(PayType.JD);
		
		System.out.println("===支付方法 pay2");
		System.out.println(order.pay2(PayType.ALI));
		System.out.println(order.pay2(PayType.TX));
		System.out.println(order.pay2(PayType.JD));
	}

}
