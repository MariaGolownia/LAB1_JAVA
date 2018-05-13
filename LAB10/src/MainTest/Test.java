package MainTest;

import Model.entity.BankGuarantee;
import Model.entity.InvestmentLoan;
import Model.logic.BankAnalyzer;

public class Test {

	public static void main(String[] args) {
		
	BankGuarantee bankGuarantee1 = new BankGuarantee("FranceBank", 0.5, true, true);
	BankGuarantee bankGuarantee2 = new BankGuarantee("BelarusBank", 3.0, true, false);
	BankGuarantee bankGuarantee3 = new BankGuarantee("USABank", 0.23, true, true);
	BankGuarantee bankGuarantee4 = new BankGuarantee("GermanyBank", 1.2, true, true);
	BankGuarantee bankGuarantee5 = new BankGuarantee("BadBank", 99.999, false, false);
	BankGuarantee bankGuarantee6 = new BankGuarantee("ChinaBank", 0.2, true, true);
	BankGuarantee bankGuarantee7 = new BankGuarantee("RussiaBank", 3.0, true, true);
	
	BankAnalyzer bankAnalyzer1 = new BankAnalyzer();
	bankAnalyzer1.add(bankGuarantee1);
	bankAnalyzer1.add(bankGuarantee2);
	bankAnalyzer1.add(bankGuarantee3);
	bankAnalyzer1.add(bankGuarantee4);
	bankAnalyzer1.add(bankGuarantee5);
	bankAnalyzer1.add(bankGuarantee6);
	bankAnalyzer1.add(bankGuarantee7);
	
	System.out.println(bankAnalyzer1.sortOfBankGuaranteeAtRates());
	
	InvestmentLoan investmentLoan1 = new InvestmentLoan("FranceBank", 4.2, true, true);
	InvestmentLoan investmentLoan2 = new InvestmentLoan("BelarusBank", 10.0, true, true);
	InvestmentLoan investmentLoan3 = new InvestmentLoan("USABank", 2.2, true, true);
	InvestmentLoan investmentLoan4 = new InvestmentLoan("GermanyBank", 1.2, true, true);
	InvestmentLoan investmentLoan5 = new InvestmentLoan("BadBank", 100.2, true, true);
	InvestmentLoan investmentLoan6 = new InvestmentLoan("ChinaBank", 1.3, true, true);
	InvestmentLoan investmentLoan7 = new InvestmentLoan("RussiaBank", 7.8, true, true);
	
	BankAnalyzer bankAnalyzer2 = new BankAnalyzer();
	bankAnalyzer2.add(investmentLoan1);
	bankAnalyzer2.add(investmentLoan2);
	bankAnalyzer2.add(investmentLoan3);
	bankAnalyzer2.add(investmentLoan4);
	bankAnalyzer2.add(investmentLoan5);
	bankAnalyzer2.add(investmentLoan6);
	bankAnalyzer2.add(investmentLoan7);
	
	System.out.println(bankAnalyzer2.sortOfInvestmentLoanAtRates());
	}
}
