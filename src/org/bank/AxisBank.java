package org.bank;

public class AxisBank extends BankInfo  {
	
	@Override
	
	public void deposit() {
		System.out.println("deposit amount on aug is 50000");

	}
	
	public static void main(String[] args) {
		
		AxisBank a=new  AxisBank();
		
		a.deposit();
	
		
	}		
	
	

}
