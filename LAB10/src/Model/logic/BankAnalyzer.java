package Model.logic;

import Model.entity.BankGuarantee;
import Model.entity.InvestmentLoan;
import Model.entity.LongTermCredit;
import Model.entity.ShortTermCredit;

//18) Кредиты (Credits). Сформировать набор предложений клиенту по целевым
//кредитам различных банков для оптимального выбора. Учитывать возмож-
//ность досрочного погашения кредита и\или увеличения кредитной линии.
//Реализовать выбор и поиск кредита.

public class BankAnalyzer {
	public static final int DEFAULT_SIZE=12;
	
	private BankGuarantee[] BG;
	private InvestmentLoan[] IL;
	private LongTermCredit[] LTC;
	private ShortTermCredit[] STC;
	
	private int BGSize=0;
	private int ILSize=0;
	private int LTCSize=0;
	private int STCSize=0;
	
	public BankAnalyzer() {
		BG = new BankGuarantee[DEFAULT_SIZE];
		IL = new InvestmentLoan[DEFAULT_SIZE];
		LTC = new LongTermCredit[DEFAULT_SIZE];
		STC = new ShortTermCredit[DEFAULT_SIZE];
	}
	
	
	public void add(BankGuarantee bankGuarantee)
	{
		if (BGSize < BG.length)
		{
			BG[BGSize++]=bankGuarantee;
		}			
	}
	
	public void add(InvestmentLoan investmentLoan)
	{
		if (ILSize < IL.length)
		{
			IL[ILSize++]=investmentLoan;
		}			
	}
	
		public void add(LongTermCredit longTermCredit)
	{
		if (LTCSize < LTC.length)
		{
			LTC[LTCSize++]=longTermCredit;
		}			
	}
	public void add(ShortTermCredit shortTermCredit)
	{
		if (STCSize < STC.length)
		{
			STC[STCSize++]=shortTermCredit;
		}			
	}
	
  
    	public String sortOfBankGuaranteeAtRates()
    	{
    		String Ret="Bank guarantee offers from best to worst options:\n";
    		
            BankGuarantee temp;
            for (int i = 0; i < BG.length-1; i++)
            {
                for (int j = i + 1; j < BG.length; j++)
                {
                	if (BG[i]!=null && BG[j]!=null)
                	{
	                    if (BG[i].getInterestRate() > BG[j].getInterestRate())
	                    {
	                        temp = BG[i];
	                        BG[i] = BG[j];
	                        BG[j] = temp;
	                    }
                	}
                }            
            }
            for (int i = 0; i < BG.length; i++)
            {
            	if (BG[i]!=null)
            		Ret+=i+1 + ") BankName=" + BG[i].getBankName() + ", InterestRate =" + BG[i].getInterestRate() + "\n";          
            }
    		
    		return Ret;		
    	}  
    	
    	
    	public String sortOfInvestmentLoanAtRates()
    	{
    		String Ret="Investment Loan offers from best to worst options:\n";
    		
    		InvestmentLoan temp;
            for (int i = 0; i < IL.length; i++)
            {
                for (int j = i + 1; j < IL.length; j++)
                {
                	if (IL[i]!=null && IL[j]!=null)
                	{
                    if (IL[i].getInterestRate() > IL[j].getInterestRate())
                    {
                        temp = IL[i];
                        IL[i] = IL[j];
                        IL[j] = temp;
                    }    
                	}
                }            
            }
            for (int i = 0; i < IL.length; i++)
            {
              	if (IL[i]!=null)
            	Ret+=i+1 + ") BankName=" + IL[i].getBankName() + ", InterestRate =" + IL[i].getInterestRate() + "\n";          
            }
    		
    		return Ret;		
    	}
          
    	
            
	public String sortOfLongTermCreditAtRates() {
		String Ret = "Long Term Credit offers from best to worst options:\n";

		LongTermCredit temp;
		for (int i = 0; i < LTC.length; i++) {
			for (int j = i + 1; j < LTC.length; j++) {
				if (LTC[i]!=null && LTC[j]!=null)
            	{
				if (LTC[i].getInterestRate() > LTC[j].getInterestRate()) {
					temp = LTC[i];
					LTC[i] = LTC[j];
					LTC[j] = temp;
				}
            	}
			}
		}
		for (int i = 0; i < LTC.length; i++) {
			if (LTC[i]!=null) 
			Ret += i + 1 + ") BankName=" + LTC[i].getBankName() + ", InterestRate =" + LTC[i].getInterestRate() + "\n";
		} 

		return Ret;
	}
                    
                    
	public String sortOfShortTermCreditAtRates() {
		String Ret = "Short Term Credit offers from best to worst options:\n";

		ShortTermCredit temp;
		for (int i = 0; i < STC.length; i++) {
			for (int j = i + 1; j < STC.length; j++) {
				if (STC[i]!=null && STC[j]!=null)
            	{
				if (STC[i].getInterestRate() > STC[j].getInterestRate()) {
					temp = STC[i];
					STC[i] = STC[j];
					STC[j] = temp;
				}
            	}
			}
		}
		for (int i = 0; i < STC.length; i++) {
			if (STC[i]!=null)
			Ret += i + 1 + ") BankName=" + STC[i].getBankName() + ", InterestRate =" + STC[i].getInterestRate() + "\n";
		}

		return Ret;
	}
                         

}