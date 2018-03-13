package com.pattern.strategy.payport;

public enum PayType {

	//把支付方式当常量维护，用户使用更加方便
	ALI(new AliPay()), TX(new TxPay()), JD(new JdPay());
	
	private Payment payment;
	PayType(Payment payment){
		
		this.payment = payment;
	}
	
	public Payment getPayment(){
		
		return payment;
	}
}
