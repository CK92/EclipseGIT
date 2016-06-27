package com.training;

public class LifeInsurance {

		private long policyNumber;
		private String policyType;
		private double policyAmount;
		private double premium;
		private String paymentMode;
		
		
		public LifeInsurance() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public LifeInsurance(long policyNumber, String policyType, double policyAmount, 
				String paymentMode) {
			super();
			this.policyNumber = policyNumber;
			this.policyType = policyType;
			this.policyAmount = policyAmount;
			this.premium = premium;
			this.paymentMode = paymentMode;
		}


		public long getPolicyNumber() {
			return policyNumber;
		}
		public void setPolicyNumber(long policyNumber) {
			this.policyNumber = policyNumber;
		}
		public String getPolicyType() {
			return policyType;
		}
		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}
		public double getPolicyAmount() {
			return policyAmount;
		}
		public void setPolicyAmount(double policyAmount) {
			this.policyAmount = policyAmount;
		}
		public double getPremium() {
			return premium;
		}
		public void setPremium(double premium) {
			this.premium = premium;
		}
		public String getPaymentMode() {
			return paymentMode;
		}
		public void setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
		}
		
	}


