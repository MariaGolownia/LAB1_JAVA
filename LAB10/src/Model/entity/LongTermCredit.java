package Model.entity;

import Model.entity.interestRate.InterestRateOfLongTermCredit;

public class LongTermCredit extends InterestRateOfLongTermCredit{
	private String bankName;
	private Boolean possibilityOfEarlyRepayment;
	private Boolean possibilitOfIncreasingCredit;
	
	public LongTermCredit(double interestRates,Double interestRate, String bankName, Boolean possibilityOfEarlyRepayment,
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
		return "LongTermCredit [bankName=" + bankName + "InterestRateOfLongTermCredit=" + getInterestRate() + ", possibilityOfEarlyRepayment=" + possibilityOfEarlyRepayment
				+ ", possibilitOfIncreasingCredit=" + possibilitOfIncreasingCredit + "]";
	}
	
	
	
	
}
