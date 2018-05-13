package Model.logic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.entity.BankGuarantee;
import Model.entity.InvestmentLoan;
import Model.entity.LongTermCredit;
import Model.entity.ShortTermCredit;
import Model.entity.interestRate.InterestRateOfBankGuarantee;

public class TestBankAnalyzer {
	
	private static InterestRateOfBankGuarantee interestRateOfBankGuarantee;
	
	
	BankGuarantee bankGuarantee1 = new BankGuarantee("FranceBank", 0.5, true, true);
	BankGuarantee bankGuarantee2 = new BankGuarantee("BelarusBank", 3.0, true, false);
	BankGuarantee bankGuarantee3 = new BankGuarantee("USABank", 0.23, true, true);
	BankGuarantee bankGuarantee4 = new BankGuarantee("GermanyBank", 1.2, true, true);
	BankGuarantee bankGuarantee5 = new BankGuarantee("BadBank", 99.999, false, false);
	BankGuarantee bankGuarantee6 = new BankGuarantee("ChinaBank", 0.2, true, true);
	BankGuarantee bankGuarantee7 = new BankGuarantee("RussiaBank", 3.0, true, true);
	

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		interestRateOfBankGuarantee = new InterestRateOfBankGuarantee(0.00);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeterminBestBankGuarantee() {
		
		BankAnalyzer bankAnalyzer1 = new BankAnalyzer();
		bankAnalyzer1.add(bankGuarantee1);
		bankAnalyzer1.add(bankGuarantee2);
		bankAnalyzer1.add(bankGuarantee3);
		bankAnalyzer1.add(bankGuarantee4);
		bankAnalyzer1.add(bankGuarantee5);
		bankAnalyzer1.add(bankGuarantee6);
		bankAnalyzer1.add(bankGuarantee7);
		
	    String result = bankAnalyzer1.sortOfBankGuaranteeAtRates();
	
		//fail("Not yet implemented");
	}

	@Test
	public void testDeterminBestInvestmentLoan() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeterminBestLongTermCredit() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeterminBestShortTermCredit() {
		fail("Not yet implemented");
	}

}
