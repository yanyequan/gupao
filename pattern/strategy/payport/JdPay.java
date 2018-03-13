package com.pattern.strategy.payport;

import com.pattern.strategy.PayState;

public class JdPay implements Payment {

	@Override
	public void pay1(String uid, Double amount) {

		System.out.println("正在使用京东支付...");
		System.out.println("支付金额："+ amount);
	}

	@Override
	public PayState pay2(String uid, Double amount) {
		
		System.out.println("正在使用京东支付...");
		return new PayState(200, "支付成功", amount);
	}

}
