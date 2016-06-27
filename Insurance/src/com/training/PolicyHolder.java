package com.training;

public class PolicyHolder {

	
	private String policyHolderName;
	private String nominee;
	
	
	
	
	public PolicyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PolicyHolder(String policyHolderName, String nominee) {
		super();
		this.policyHolderName = policyHolderName;
		this.nominee = nominee;
	}


	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	public String payPremium(double premiumAmount)
	{
		return premiumAmount + " := paid by cash";
	}
	
}
