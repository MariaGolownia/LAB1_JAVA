package Model.entity;

import Model.entity.interestRate.InterestRateOfInvestmentLoan;

public class InvestmentLoan extends InterestRateOfInvestmentLoan{
	private String bankName;
	private Boolean possibilityOfEarlyRepayment;
	private Boolean possibilitOfIncreasingCredit;
	
	public InvestmentLoan(String bankName, double interestRate, Boolean possibilityOfEarlyRepayment,
			Boolean possibilitOfIncreasingCredit) {
		super(interestRate);
		this.bankName = bankName;
		this.possibilityOfEarlyRepayment = possibilityOfEarlyRepayment;
		this.possibilitOfIncreasingCredit = possibilitOfIncreasingCredit;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Boolean getPossibilityOfEarlyRepayment() {
		return possibilityOfEarlyRepayment;
	}

	public void setPossibilityOfEarlyRepayment(Boolean possibilityOfEarlyRepayment) {
		this.possibilityOfEarlyRepayment = possibilityOfEarlyRepayment;
	}

	public Boolean getPossibilitOfIncreasingCredit() {
		return possibilitOfIncreasingCredit;
	}

	public void setPossibilitOfIncreasingCredit(Boolean possibilitOfIncreasingCredit) {
		this.possibilitOfIncreasingCredit = possibilitOfIncreasingCredit;
	}

	@Override
	public String toString() {
		return "InvestmentLoan [bankName=" + bankName + "InterestRateOfInvestmentLoan=" + getInterestRate()+ ", possibilityOfEarlyRepayment=" + possibilityOfEarlyRepayment
				+ ", possibilitOfIncreasingCredit=" + possibilitOfIncreasingCredit + "]";
	}
	
	
}
