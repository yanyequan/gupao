package com.pattern.strategy.payport;

import com.pattern.strategy.PayState;

public interface Payment {

	public void pay1(String uid, Double amount);
	
	public PayState pay2(String uid, Double amount);
}
