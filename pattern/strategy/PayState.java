package com.pattern.strategy;

public class PayState {

	private int code;
	private String msg;
	private Double amount;
	
	public PayState(int code, String msg, Double amount){
		
		this.code = code;
		this.msg = msg;
		this.amount = amount;
	}
	
	public String toString(){
		
		return "支付状态["+ code + "],"+ msg +",支付金额："+ amount;
	}
}
