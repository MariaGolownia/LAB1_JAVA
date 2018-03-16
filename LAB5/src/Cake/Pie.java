package Cake;

public class Pie {
	
	public static String draw () {
		String stringOfPie = "";
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j <= 30; j++)
			{
				if((j<10 && (i == 0 || i == 9)) || (j<7 && (i == 1 || i == 8)) || (j<5 && (i == 2 || i == 7)) || (j<2 && (i == 3 || i == 6)))
					stringOfPie+=" ";
				else if ((j>20 && (i == 0 || i == 9)) || (j>23 && (i == 1 || i == 8)) || (j>25 && (i == 2 || i == 7)) || (j>28 && (i == 3 || i == 6)))
					stringOfPie+=" ";
				else stringOfPie+="*";
			
			}
			stringOfPie+="\n";
			
		}
		return stringOfPie;
	}

}
