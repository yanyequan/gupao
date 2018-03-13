package com.pattern.strategy;

import com.pattern.strategy.payport.AliPay;
import com.pattern.strategy.payport.JdPay;
import com.pattern.strategy.payport.PayType;
import com.pattern.strategy.payport.TxPay;

public class Order {

	private String uid;
	private String oid;
	private Double amount;
	
	public Order(String uid, String oid, Double amount){
		
		this.uid = uid;
		this.oid = oid;
		this.amount = amount;
	}
	
	//使用 switch 方法
	public void pay(PayType paytype){ 
		
		System.out.println("订单编号："+ oid);
		
		switch(paytype){
			case ALI:
				new AliPay().pay1(uid, amount);
				break;
			case TX:
				new TxPay().pay1(uid, amount);
				break;
			case JD:
				new JdPay().pay1(uid, amount);
				break;
		}
	}
	
	//使用枚举方法
	public void pay1(PayType paytype){
		
		System.out.println("订单编号："+ oid);
		
		paytype.getPayment().pay2(uid, amount);
	}

	//使用枚举方法，返回订单执行状态
	public PayState pay2(PayType paytype){
		
		System.out.println("订单编号："+ oid);
		
		return paytype.getPayment().pay2(uid, amount);
	}
}
