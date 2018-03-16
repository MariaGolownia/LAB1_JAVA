package Mood;


public class Label {
	public static String seeLabel (String str)
	{
		String processedString="";
		String firstLine="";
		String secondLine=""; 
		String thirdLine="";
		String fourthLine="";
		String fifthLine="";
		
		int i;
		char[] arrayOfChar = str.toCharArray();
	
		for(i=0; i<str.length(); i++)  {
			switch (arrayOfChar[i])
			{
			case ('A'):
			case('a'):
				firstLine +="`¶¶¶¶`";
			    secondLine += "¶¶``¶¶";
			    thirdLine += "¶¶¶¶¶¶";
			    fourthLine += "¶¶``¶¶";
			    fifthLine += "¶¶``¶¶";
				//processedString+="`¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶";
				break;
				
			case ('B'):
			case ('b'):
				firstLine +="¶¶¶¶¶`";
		    	secondLine += "¶¶``¶¶";
		    	thirdLine +="¶¶¶¶¶`";
		    	fourthLine +="¶¶``¶¶";
		    	fifthLine +="¶¶¶¶¶`";
				//processedString+="¶¶¶¶¶\r\n" + 	"¶¶``¶¶\r\n" + "¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶";
				break;
				
			case ('C'):
			case ('c'):
				firstLine +="`¶¶¶¶`" ;
	    		secondLine += "¶¶``¶¶" ;
	    		thirdLine +="¶¶````" ;
	    		fourthLine +="¶¶``¶¶";
	    		fifthLine +="`¶¶¶¶`";
	    		//processedString+="`¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶\r\n" + "¶¶``¶¶\r\n" + "`¶¶¶¶";
			break;
			
			case ('D'):
			case ('d'):
				firstLine +="¶¶¶¶¶`";
    			secondLine += "¶¶``¶¶";
    			thirdLine +="¶¶``¶¶";
    			fourthLine +="¶¶``¶¶";
    			fifthLine +="¶¶¶¶¶`";
    			//processedString+="¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" +"¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶";
			break;
			
			case ('E'):
			case ('e'):
				firstLine +="¶¶¶¶¶`";
    			secondLine += "¶¶````";
    			thirdLine +="¶¶¶¶``";
    			fourthLine +="¶¶````";
    			fifthLine +="¶¶¶¶¶`";
    			//processedString+="¶¶¶¶¶\r\n" + 	"¶¶\r\n" + 	"¶¶¶¶\r\n" + "¶¶\r\n" + "¶¶¶¶¶";
			break;
			
			case ('F'):
			case ('f'):
				firstLine +="¶¶¶¶¶¶";
    			secondLine +="¶¶````" ;
    			thirdLine +="¶¶¶¶``";
    			fourthLine += "¶¶````";
    			fifthLine +="¶¶````";
    			//processedString+="¶¶¶¶¶¶\r\n" + "¶¶\r\n" + 	"¶¶¶¶\r\n" + "¶¶\r\n" + "¶¶";
    			break;
    			
			case ('G'):
			case ('g'):
				firstLine +="`¶¶¶¶`";
    			secondLine += "¶¶````" ;
    			thirdLine +="¶¶`¶¶¶";
    			fourthLine +="¶¶``¶¶";
    			fifthLine +="`¶¶¶¶`";
    			//processedString+="`¶¶¶¶\r\n" + 	"¶¶\r\n" + 	"¶¶`¶¶¶\r\n" + "¶¶``¶¶\r\n" + "`¶¶¶¶";
    			break;
			
			case ('H'):
			case ('h'):
				firstLine +="¶¶``¶¶";
    			secondLine += "¶¶``¶¶" ;
    			thirdLine += "¶¶¶¶¶¶";
    			fourthLine +="¶¶``¶¶";
    			fifthLine += "¶¶``¶¶";
    			//processedString+="¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶";
    			break;
			
			case ('I'):
			case ('i'):
				firstLine +="¶¶¶¶¶¶";
    			secondLine += "``¶¶``";
    			thirdLine +="``¶¶``";
    			fourthLine +="``¶¶``";
    			fifthLine +="¶¶¶¶¶¶";
    			//processedString+="¶¶¶¶¶¶\r\n" + "``¶¶\r\n" + "``¶¶\r\n" + "``¶¶\r\n" + "¶¶¶¶¶¶";
    			break;
			
			case ('J'):
			case ('j'):
				firstLine +="¶¶¶¶¶¶";
    			secondLine +="````¶¶" ;
    			thirdLine +=	"````¶¶";
    			fourthLine +=	"¶¶``¶¶";
    			fifthLine +="`¶¶¶¶`";
    			//processedString+="¶¶¶¶¶¶\r\n" +	"````¶¶\r\n" + 	"````¶¶\r\n" + 	"¶¶``¶¶\r\n" + 	"`¶¶¶¶";
			break;
			
			case ('K'):
			case ('k'):
				firstLine +="¶¶``¶¶";
    			secondLine +=  "¶¶`¶¶`";
    			thirdLine +="¶¶¶¶``";
    			fourthLine +="¶¶`¶¶`";
    			fifthLine +="¶¶``¶¶";
    			//processedString+="¶¶``¶¶\r\n" + "¶¶`¶¶\r\n" + "¶¶¶¶\r\n" + "¶¶`¶¶\r\n" + "¶¶``¶¶";
			break;
			
			case ('L'):
			case ('l'):
				firstLine +="¶¶````" ;
    			secondLine += "¶¶````";
    			thirdLine +="¶¶````";
    			fourthLine +="¶¶````";
    			fifthLine +="¶¶¶¶¶¶";
    			//processedString+="¶¶\r\n" + "¶¶\r\n" + "¶¶\r\n" + "¶¶\r\n" + "¶¶¶¶¶¶";
			break;
			
			case ('M'):
			case ('m'):
				firstLine +="¶¶```¶";
    			secondLine +=  "¶¶¶`¶¶" ;
    			thirdLine +="¶¶`¶`¶";
    			fourthLine += "¶¶```¶";
    			fifthLine +="¶¶```¶";
    			//processedString+="¶¶```¶\r\n" + "¶¶¶`¶¶\r\n" + "¶¶`¶`¶\r\n" + "¶¶```¶\r\n" + "¶¶```¶";
			break;
			
			case ('N'):
			case ('n'):
				firstLine +="¶¶``¶¶";
    			secondLine += "¶¶¶`¶¶";
    			thirdLine +="¶¶`¶¶¶";
    			fourthLine +="¶¶``¶¶";
    			fifthLine +="¶¶``¶¶";
    			//processedString+="¶¶``¶¶\r\n" + "¶¶¶`¶¶\r\n" +	"¶¶`¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶";
			break;
			
			case ('O'):
			case ('o'):
				firstLine +="`¶¶¶¶`";
    			secondLine += "¶¶``¶¶" ;
    			thirdLine += "¶¶``¶¶";
    			fourthLine += "¶¶``¶¶";
    			fifthLine +="`¶¶¶¶`";
    			//processedString+="`¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "`¶¶¶¶";
    			break;
			
			case ('P'):
			case ('p'):
				firstLine +="¶¶¶¶¶`";
    			secondLine += "¶¶``¶¶";
    			thirdLine +="¶¶¶¶¶`";
    			fourthLine +="¶¶````";
    			fifthLine +="¶¶````";
    			//processedString+="¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶\r\n" + "¶¶\r\n" + "¶¶";
			break;
			
			case ('Q'):
			case ('q'):
				firstLine +="`¶¶¶¶`";
    			secondLine += "¶¶``¶¶";
    			thirdLine +="¶¶`¶¶¶";
    			fourthLine +="¶¶``¶¶";
    			fifthLine +="`¶¶¶¶¶";;
    			//processedString+="`¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶`¶¶¶\r\n" + "¶¶``¶¶\r\n" + "`¶¶¶¶¶";
			break;
			
			case ('R'):
			case ('r'):
				firstLine +="¶¶¶¶¶`";
    			secondLine += "¶¶``¶¶" ;
    			thirdLine += "¶¶¶¶¶`";
    			fourthLine += "¶¶``¶¶" ;
    			fifthLine +="¶¶``¶¶";
    			//processedString+="¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶";
    			break;
    			
			case ('S'):
			case ('s'):
				firstLine +="`¶¶¶¶`";
    			secondLine += "¶¶````" ;
    			thirdLine +="`¶¶¶¶`";
    			fourthLine +="````¶¶";
    			fifthLine +="`¶¶¶¶`";
    			//processedString+="`¶¶¶¶\r\n" + "¶¶\r\n" + "`¶¶¶¶\r\n" + "````¶¶\r\n" + "`¶¶¶¶";
    			break;
    			
			case ('T'):
			case ('t'):
				firstLine +="¶¶¶¶¶¶";
    			secondLine +=  "``¶¶``";
    			thirdLine += "``¶¶``";
    			fourthLine +="``¶¶``";
    			fifthLine +="``¶¶``";
    			//processedString+="¶¶¶¶¶¶\r\n" + "``¶¶\r\n" + "``¶¶\r\n" + "``¶¶\r\n" + 	"``¶¶";
    			break;
    			
			case ('U'):
			case ('u'):
				firstLine +="¶¶``¶¶";
    			secondLine +="¶¶``¶¶" ;
    			thirdLine +="¶¶``¶¶";
    			fourthLine += "¶¶``¶¶";
    			fifthLine += "`¶¶¶¶`";
    			//processedString+="¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" +"¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "`¶¶¶¶";
    			break;
    			
			case ('V'):
			case ('v'):
				firstLine +="¶¶``¶¶";
    			secondLine += "¶¶``¶¶";
    			thirdLine +="¶¶``¶¶" ;
    			fourthLine += "`¶¶¶¶`";
    			fifthLine +="``¶¶``";
    			//processedString+="¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + 	"¶¶``¶¶\r\n" + "`¶¶¶¶\r\n" + "``¶¶";
    			break;
    			
			case ('W'):
			case ('w'):
				firstLine +="¶¶```¶";
    			secondLine += "¶¶```¶";
    			thirdLine += "¶¶`¶`¶";
    			fourthLine +="¶¶¶¶¶¶" ;
    			fifthLine +="`¶¶`¶¶";
    			//processedString+="¶¶```¶\r\n" + "¶¶```¶\r\n" + "¶¶`¶`¶\r\n" + "¶¶¶¶¶¶\r\n" + "`¶¶`¶¶";
			break;
			
				case ('X'):
				case ('x'):
				firstLine +="¶¶``¶¶";
				secondLine +=  "`¶¶¶¶`" ;
				thirdLine += "``¶¶``" ;
				fourthLine += "`¶¶¶¶`" ;
				fifthLine +="¶¶``¶¶";
				//processedString+="¶¶``¶¶\r\n" + "`¶¶¶¶\r\n" + "``¶¶\r\n" + "`¶¶¶¶\r\n" + "¶¶``¶¶";
			break;
			
			case ('Y'):
			case ('y'):
				firstLine +="¶¶``¶¶";
    			secondLine += "`¶¶¶¶`";
    			thirdLine += "``¶¶``";
    			fourthLine += "``¶¶``" ;
    			fifthLine +="``¶¶``";
    			//processedString+="¶¶``¶¶\r\n" + "`¶¶¶¶\r\n" + "``¶¶\r\n" + "``¶¶\r\n" + "``¶¶";
    			break;
    			
			case ('Z'):
			case ('z'):
				firstLine +="¶¶¶¶¶¶";
    			secondLine += "```¶¶`" ;
    			thirdLine +="``¶¶``";
    			fourthLine +=	"`¶¶```";
    			fifthLine +="¶¶¶¶¶¶";
    			//processedString+="¶¶¶¶¶¶\r\n" + "```¶¶\r\n" + 	"``¶¶\r\n" + "`¶¶\r\n" + "¶¶¶¶¶¶";
    			break;
    			
    			
			case ('À'):
			case('à'):
				firstLine +="`¶¶¶¶`";
			    secondLine += "¶¶``¶¶";
			    thirdLine += "¶¶¶¶¶¶" ;
			    fourthLine += "¶¶``¶¶";
			    fifthLine +=  "¶¶``¶¶";
				//processedString+="`¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶";
				break;
				
			case ('Á'):
			case('á'):
				firstLine +="¶¶¶¶¶`";
			    secondLine += "¶¶````" ;
			    thirdLine +=   "¶¶¶¶¶`";
			    fourthLine += "¶¶``¶¶";
			    fifthLine +=  "¶¶¶¶¶`";
				//processedString+="¶¶¶¶¶\r\n" + "¶¶\r\n" + "¶¶¶¶¶\r\n" +	"¶¶``¶¶\r\n" + 	"¶¶¶¶¶";
				break;
				
			case ('Â'):
			case('â'):
				firstLine +="¶¶¶¶¶`";
			    secondLine +="¶¶``¶¶" ;
			    thirdLine +=  "¶¶¶¶¶`";
			    fourthLine += "¶¶``¶¶";
			    fifthLine +=  "¶¶¶¶¶`";
				//processedString+="¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶";
				break;
				
			case ('Ã'):
			case('ã'):
				firstLine +="¶¶¶¶¶¶";
			    secondLine += "¶¶````";
			    thirdLine += "¶¶````" ;
			    fourthLine += "¶¶````";
			    fifthLine += "¶¶````" ;
				//processedString+="¶¶¶¶¶¶\r\n" + "¶¶\r\n" + "¶¶\r\n" + "¶¶\r\n" + "¶¶";
				break;
				
			case ('Ä'):
			case('ä'):
				firstLine +="``¶¶¶``" ;
			    secondLine +=  "`¶¶`¶¶`";
			    thirdLine +=   "`¶¶`¶¶`";
			    fourthLine += "¶¶¶¶¶¶¶";
			    fifthLine +=  "¶`````¶";
				//processedString+="``¶¶¶\r\n" + "`¶¶`¶¶\r\n" + "`¶¶`¶¶\r\n" + "¶¶¶¶¶¶¶\r\n" +"¶`````¶";
				break;
				
			case ('Å'):
			case('å'):
			case ('¨'):
			case('¸'):
				firstLine +="¶¶¶¶¶¶";
			    secondLine += "¶¶````";
			    thirdLine +=  "¶¶¶¶``" ;
			    fourthLine +="¶¶````" ;
			    fifthLine += "¶¶¶¶¶¶" ;
				//processedString+="¶¶¶¶¶¶\r\n" + "¶¶\r\n" + "¶¶¶¶\r\n" + "¶¶\r\n" + "¶¶¶¶¶¶";
				break;
						
			case ('Æ'):
			case('æ'):
				firstLine +="¶¶`¶`¶¶";
			    secondLine +="`¶¶¶¶¶`" ;
			    thirdLine +=  "``¶¶¶``" ;
			    fourthLine += "`¶¶¶¶¶`";
			    fifthLine += "¶¶`¶`¶¶" ;
				//processedString+="¶¶`¶`¶¶\r\n" + "`¶¶¶¶¶\r\n" + "``¶¶¶\r\n" + "`¶¶¶¶¶\r\n" + "¶¶`¶`¶¶";
				break;
				
			case ('Ç'):
			case('ç'):
				firstLine +="¶¶¶¶¶`";
			    secondLine += "````¶¶";
			    thirdLine +=  "``¶¶¶`";
			    fourthLine +=  "````¶¶";
			    fifthLine +=  "¶¶¶¶¶`";
				//processedString+="¶¶¶¶¶\r\n" + "````¶¶\r\n" + "``¶¶¶\r\n" + "````¶¶\r\n" + 	"¶¶¶¶¶";
				break;
				
			case ('È'):
			case('è'):
				firstLine +="¶¶``¶¶";
			    secondLine +="¶¶``¶¶" ;
			    thirdLine +=   "¶¶`¶¶¶";
			    fourthLine += "¶¶¶`¶¶";
			    fifthLine += "¶¶``¶¶" ;
				//processedString+="¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶`¶¶¶\r\n" + "¶¶¶`¶¶\r\n" + "¶¶``¶¶";
				break;
				
			case ('É'):
			case('é'):
				firstLine +="``¶¶``";
			    secondLine += "¶¶``¶¶";
			    thirdLine +=   "¶¶`¶¶¶" ;
			    fourthLine += "¶¶¶`¶¶" ;
			    fifthLine += "¶¶``¶¶" ;
				//processedString+="``¶¶\r\n" +	"¶¶``¶¶\r\n" + "¶¶`¶¶¶\r\n" + "¶¶¶`¶¶\r\n" + "¶¶``¶¶";
				break;
				
			case ('Ê'):
			case('ê'):
				firstLine +="¶¶``¶¶";
			    secondLine +="¶¶`¶¶`"  ;
			    thirdLine += "¶¶¶¶``" ;
			    fourthLine += "¶¶`¶¶`";
			    fifthLine +=  "¶¶``¶¶";
				//processedString+="¶¶``¶¶\r\n" + "¶¶`¶¶\r\n" + "¶¶¶¶\r\n" + "¶¶`¶¶\r\n" + "¶¶``¶¶";
				break;
				
			case ('Ë'):
			case('ë'):
				firstLine +="```¶¶¶";
			    secondLine += "``¶`¶¶" ;
			    thirdLine +=  "`¶``¶¶";
			    fourthLine +="¶¶``¶¶" ;
			    fifthLine +=  "¶¶``¶¶";
				//processedString+="```¶¶¶\r\n" + "``¶`¶¶\r\n" + "`¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶";
				break;
				
			case ('Ì'):
			case('ì'):
				firstLine +="¶¶```¶¶" ;
			    secondLine += "¶¶¶`¶¶¶" ;
			    thirdLine +=    "¶¶`¶`¶¶" ;
			    fourthLine +=  "¶¶```¶¶";
			    fifthLine +=  "¶¶```¶¶";
				//processedString+="¶¶```¶¶\r\n" + "¶¶¶`¶¶¶\r\n" + "¶¶`¶`¶¶\r\n" + "¶¶```¶¶\r\n" + "¶¶```¶¶";
				break;
				
			case ('Í'):
			case('í'):
				firstLine +="¶¶``¶¶";
			    secondLine +=  "¶¶``¶¶";
			    thirdLine +=  "¶¶¶¶¶¶";
			    fourthLine += "¶¶``¶¶";
			    fifthLine +=  "¶¶``¶¶";
				//processedString+="¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶";
				break;
				
			case ('Î'):
			case('î'):
				firstLine +="`¶¶¶¶`" ;
			    secondLine += "¶¶``¶¶";
			    thirdLine +=   "¶¶``¶¶" ;
			    fourthLine += "¶¶``¶¶" ;
			    fifthLine += "`¶¶¶¶`" ;
				//processedString+="`¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "`¶¶¶¶";
				break;
				
			case ('Ï'):
			case('ï'):
				firstLine +="¶¶¶¶¶¶";
			    secondLine +=  "¶¶``¶¶";
			    thirdLine += "¶¶``¶¶" ;
			    fourthLine += "¶¶``¶¶";
			    fifthLine +=  "¶¶``¶¶";
				processedString+="¶¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" +"¶¶``¶¶\r\n" + "¶¶``¶¶";
				break;
				
			case ('Ð'):
			case('ð'):
				firstLine +="¶¶¶¶¶`";
			    secondLine += "¶¶``¶¶";
			    thirdLine += "¶¶¶¶¶¶"  ;
			    fourthLine += "¶¶````";
			    fifthLine +=  "¶¶````";
				//processedString+="¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + 	"¶¶¶¶¶¶\r\n" + 	"¶¶\r\n" + 	"¶¶";
				break;
				
			case ('Ñ'):
			case('ñ'):
				firstLine +="`¶¶¶¶`";
			    secondLine +="¶¶``¶¶" ;
			    thirdLine +=  "¶¶````";
			    fourthLine += "¶¶``¶¶";
			    fifthLine +=  "`¶¶¶¶`";
				//processedString+="`¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶\r\n" + "¶¶``¶¶\r\n" + "`¶¶¶¶";
				break;
				
			case ('Ò'):
			case('ò'):
				firstLine +="¶¶¶¶¶¶" ;
			    secondLine += "``¶¶``";
			    thirdLine +=  "``¶¶``" ;
			    fourthLine += "``¶¶``" ;
			    fifthLine +=  "``¶¶``";
				//processedString+="¶¶¶¶¶¶\r\n" + "``¶¶\r\n" + "``¶¶\r\n" +	"``¶¶\r\n" + "``¶¶";
				break;
				
			case ('Ó'):
			case('ó'):
				firstLine +="¶¶``¶¶";
			    secondLine +=  "`¶¶`¶¶";
			    thirdLine +=  "``¶¶¶¶";
			    fourthLine += 	"````¶¶" ;
			    fifthLine += "``¶¶¶`" ;
				//processedString+="¶¶``¶¶\r\n" + "`¶¶`¶¶\r\n" + 	"``¶¶¶¶\r\n" + 	"````¶¶\r\n" + 	"``¶¶¶";
				break;
				
			case ('Ô'):
			case('ô'):
				firstLine +="`¶¶¶¶¶¶`";
			    secondLine += "¶``¶¶``¶" ;
			    thirdLine += "¶``¶¶``¶" ;
			    fourthLine +="`¶¶¶¶¶¶`" ;
			    fifthLine += "```¶¶```" ;
				//processedString+="`¶¶¶¶¶¶\r\n" + "¶``¶¶``¶\r\n" + "¶``¶¶``¶\r\n" + 	"`¶¶¶¶¶¶\r\n" + "```¶¶";
				break;
				
			case ('Õ'):
			case('õ'):
				firstLine +="¶¶``¶¶" ;
			    secondLine += "`¶¶¶¶`" ;
			    thirdLine +=  "``¶¶``";
			    fourthLine += "`¶¶¶¶`";
			    fifthLine +=  "¶¶``¶¶";
				//processedString+="¶¶``¶¶\r\n" + "`¶¶¶¶\r\n" + "``¶¶\r\n" + "`¶¶¶¶\r\n" + "¶¶``¶¶";
				break;
				
			case ('Ö'):
			case('ö'):
				firstLine +="¶¶``¶¶";
			    secondLine +="¶¶``¶¶" ;
			    thirdLine += "¶¶``¶¶" ;
			    fourthLine += "¶¶``¶¶";
			    fifthLine +=  "`¶¶¶`¶";
				//processedString+="¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" +	"`¶¶¶`¶";
				break;
				
			case ('×'):
			case('÷'):
				firstLine +="¶¶``¶¶";
			    secondLine +=  "¶¶``¶¶" ;
			    thirdLine += "`¶¶¶¶¶" ;
			    fourthLine += "````¶¶" ;
			    fifthLine += "````¶¶" ;
				//processedString+="¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + 	"`¶¶¶¶¶\r\n" + 	"````¶¶\r\n" + 	"````¶¶";
				break;
				
			case ('Ø'):
			case('ø'):
				firstLine +="¶¶```¶";
			    secondLine += "¶¶```¶";
			    thirdLine +=  "¶¶`¶`¶";
			    fourthLine += "¶¶`¶`¶";
			    fifthLine += "¶¶¶¶¶¶" ;
				//processedString+="¶¶```¶\r\n" + "¶¶```¶\r\n" + 	"¶¶`¶`¶\r\n" + 	"¶¶`¶`¶\r\n" + 	"¶¶¶¶¶¶";
				break;
				
			case ('Ù'):
			case('ù'):
				firstLine +="¶¶```¶¶";
			    secondLine += "¶¶```¶¶" ;
			    thirdLine += "¶¶`¶`¶¶" ;
			    fourthLine += "¶¶`¶`¶¶";
			    fifthLine +=  "¶¶¶¶¶`¶";
				//processedString+="¶¶```¶¶\r\n" + "¶¶```¶¶\r\n" + "¶¶`¶`¶¶\r\n" + "¶¶`¶`¶¶\r\n" + "¶¶¶¶¶`¶";
				break;
				
			case ('Ú'):
			case('ú'):
				firstLine +="¶¶¶```" ;
			    secondLine += "`¶¶```" ;
			    thirdLine += "`¶¶¶¶¶" ;
			    fourthLine +="`¶¶``¶`"  ;
			    fifthLine += "`¶¶¶¶¶`" ;
				//processedString+="¶¶¶\r\n" + "`¶¶\r\n" + 	"`¶¶¶¶¶\r\n" + 	"`¶¶``¶\r\n" + 	"`¶¶¶¶¶";
				break;
				
			case ('Ü'):
			case('ü'):
				firstLine +="¶¶````";
			    secondLine += "¶¶````" ;
			    thirdLine += "¶¶¶¶``" ;
			    fourthLine += "¶¶``¶¶" ;
			    fifthLine +=  "¶¶¶¶¶";
				//processedString+="¶¶\r\n" + "¶¶\r\n" + 	"¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶¶¶¶";
				break;
				
			case ('Ý'):
			case('ý'):
				firstLine +="`¶¶¶¶`";
			    secondLine += "¶¶``¶¶" ;
			    thirdLine +=  "```¶¶¶";
			    fourthLine += 	"¶¶``¶¶";
			    fifthLine += "`¶¶¶¶`" ;
				//processedString+="`¶¶¶¶\r\n" + 	"¶¶``¶¶\r\n" + 	"```¶¶¶\r\n" + 	"¶¶``¶¶\r\n" + 	"`¶¶¶¶";
				break;
				
			case ('Þ'):
			case('þ'):
				firstLine +="¶¶``¶¶`";
			    secondLine +="¶¶`¶``¶" ;
			    thirdLine += "¶¶¶¶¶`¶" ;
			    fourthLine += "¶¶`¶``¶" ;
			    fifthLine +=  "¶¶``¶¶`";
				//processedString+="¶¶``¶¶\r\n" + "¶¶`¶``¶\r\n" + "¶¶¶¶¶`¶\r\n" + "¶¶`¶``¶\r\n" + "¶¶``¶¶";
				break;
				
			case ('ß'):
			case('ÿ'):
				firstLine +="`¶¶¶¶¶";
		    	secondLine += "¶¶``¶¶" ;
		    	thirdLine +=  "`¶¶¶¶¶";
		    	fourthLine += "¶¶``¶¶" ;
		    	fifthLine +=  "¶¶``¶¶";
				//processedString+="`¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + 	"`¶¶¶¶¶\r\n" + 	"¶¶``¶¶\r\n" + 	"¶¶``¶¶";
				break;
				
			
				
			case (','):
				firstLine +="```";
    			secondLine +=  "```" ;
    			thirdLine +="```";
    			fourthLine +="¶¶`";
    			fifthLine +="`¶`";
    			//processedString+="\r\n" + "\r\n" +"\r\n" +"¶¶\r\n" +"`¶";
    			break;
    			
			case ('.'):
				firstLine +="```";
    			secondLine += "```" ;
    			thirdLine +="```" ;
    			fourthLine +="```" ;
    			fifthLine += "¶¶`";
    			//processedString+="\r\n" + "\r\n" + "\r\n" 	+"\r\n" + "¶¶";
    			break;
    			
			case ('!'):
				firstLine +="``¶¶¶`";
    			secondLine += "``¶¶¶`";
    			thirdLine += "``¶¶¶`" ;
    			fourthLine += "``````" ;
    			fifthLine +="``¶¶¶`";
    			//processedString+="``¶¶¶\r\n" + 	"``¶¶¶\r\n" + "``¶¶¶\r\n" + "\r\n" + "``¶¶¶";
    			break;
    			
			case ('?'):
				firstLine +="`¶¶¶¶`";
    			secondLine +="¶```¶¶";
    			thirdLine +="``¶¶¶`";
    			fourthLine +="``````";
    			fifthLine +="``¶¶``";
    			//processedString+="`¶¶¶¶\r\n" + 	"¶```¶¶\r\n" + 	"``¶¶¶\r\n" + "\r\n" +"``¶¶";
			break;
			
			case (':'):
				firstLine +="```";
    			secondLine +="¶¶`" ;
    			thirdLine += "```";
    			fourthLine += "¶¶`";
    			fifthLine += "```";
    			//processedString+="\r\n" + "¶¶\r\n" + "\r\n" + "¶¶\r\n" + "";
    			break;
    			
			case ('-'):
				firstLine +="``````";
    			secondLine += "``````";
    			thirdLine +="¶¶¶¶¶`";
    			fourthLine += "``````" ;
    			fifthLine +="``````";
    			//processedString+="\r\n" + "\r\n" + 	"¶¶¶¶¶\r\n" + "\r\n" + "";
    			break;
    			
			case ('+'):
				firstLine +="``¶¶``";
    			secondLine += "``¶¶``";
    			thirdLine += "¶¶¶¶¶¶";
    			fourthLine +="``¶¶``" ;
    			fifthLine +="``¶¶``";
    			//processedString+="\r\n" + 	"``¶¶\r\n" + "¶¶¶¶¶¶\r\n" + "``¶¶";
    			break;
    			
			case ('='):
				firstLine +="``````";
    			secondLine += "¶¶¶¶¶¶";
    			thirdLine +="``````";
    			fourthLine +="¶¶¶¶¶¶";
    			fifthLine += "``````";
    			//processedString+="\r\n" + "¶¶¶¶¶¶\r\n" + "\r\n" + "¶¶¶¶¶¶\r\n" + "";
    			break;
    			
			case ('('):
				firstLine +="`¶¶" ;
    			secondLine += "¶¶`";
    			thirdLine += "¶``" ;
    			fourthLine += "¶¶`";
    			fifthLine += "`¶¶";
				//processedString+=	"`¶¶\r\n" + "¶¶\r\n" + "¶\r\n" + "¶¶\r\n" + "`¶¶";
			break;
			
			case (')'):
				firstLine +="¶¶`";
    			secondLine += "`¶¶";
    			thirdLine +="``¶";
    			fourthLine += "`¶¶";
    			fifthLine +="¶¶`";
    			//processedString+="¶¶\r\n" + "`¶¶\r\n" + "``¶\r\n" + "`¶¶\r\n" + "¶¶";
    			break;
    			
			case ('*'):
				firstLine +="``````";
    			secondLine +="`¶``¶`";
    			thirdLine +="¶¶¶¶¶¶" ;
    			fourthLine +="`¶``¶`";
    			fifthLine += "``````";
    			//processedString+="¶¶``¶¶\r\n" + "`¶¶¶¶\r\n" + "``¶¶\r\n" + 	"`¶¶¶¶\r\n" + "¶¶``¶¶";
    			break;
    			
			case ('/'):
				firstLine +="`````¶" ;
    			secondLine += "````¶`" ;
    			thirdLine +="```¶``";
    			fourthLine +="``¶```" ;
    			fifthLine +="¶`````";
				//processedString+=
				break;
    			
			case (' '):
				firstLine +="````";
    			secondLine += "````";
    			thirdLine +="````";
    			fourthLine +="````";
    			fifthLine +="````";
    			//processedString+="````\n````\n````\n````\n````";
    			break;
    			
			case ('1'):
				firstLine +="```¶¶`";
    			secondLine += "`¶¶¶¶`";
    			thirdLine +="```¶¶`" ;
    			fourthLine += "```¶¶`";
    			fifthLine +="```¶¶`";
    			//processedString+="```¶¶\r\n" + "`¶¶¶¶\r\n" + "```¶¶\r\n" + "```¶¶\r\n" + "```¶¶";
    			break;
    			
			case ('2'):
				firstLine +="`¶¶¶¶`";
	    		secondLine += "¶¶``¶¶";
	    		thirdLine +="```¶¶'";
	    		fourthLine +="`¶¶'''";
	    		fifthLine +="¶¶¶¶¶¶";
	    		//processedString+="`¶¶¶¶\r\n" + 	"¶¶``¶¶\r\n" + 	"```¶¶\r\n" + "`¶¶\r\n" + "¶¶¶¶¶¶";
			break;
			
			case ('3'):
				firstLine +="`¶¶¶¶`";
	    		secondLine += "¶```¶¶" ;
	    		thirdLine += "``¶¶¶`";
	    		fourthLine += "¶```¶¶";
	    		fifthLine +="`¶¶¶¶`";
	    		//processedString+="`¶¶¶¶\r\n" + "¶```¶¶\r\n" + "``¶¶¶\r\n" + "¶```¶¶\r\n" +"`¶¶¶¶";
			break;
			
			case ('4'):
				firstLine +="¶¶````";
	    		secondLine +=  "¶¶``¶¶";
	    		thirdLine +="¶¶¶¶¶¶";
	    		fourthLine +="````¶¶";
	    		fifthLine +="````¶¶";
	    		//processedString+="¶¶\r\n" + "¶¶``¶¶\r\n" + 	"¶¶¶¶¶¶\r\n" + 	"````¶¶\r\n" + 	"````¶¶";
				break;
				
			case ('5'):
				firstLine +="¶¶¶¶¶`";
	    		secondLine += "¶¶````";
	    		thirdLine +="¶¶¶¶¶`";
	    		fourthLine +="````¶¶";
	    		fifthLine +="¶¶¶¶¶`";
	    		//processedString+="¶¶¶¶¶\r\n" + 	"¶¶\r\n" + 	"¶¶¶¶¶\r\n" +"````¶¶\r\n" + "¶¶¶¶¶";
				break;
				
			case ('6'):
				firstLine +="`¶¶¶¶`";
	    		secondLine += "¶¶````";
	    		thirdLine += "¶¶¶¶¶`";
	    		fourthLine += "¶¶``¶¶";
	    		fifthLine +="`¶¶¶¶`";
	    		//processedString+="`¶¶¶¶\r\n" + "¶¶\r\n" + "¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + 	"`¶¶¶¶";
				break;
				
			case ('7'):
				firstLine +="¶¶¶¶¶¶";
	    		secondLine += "¶¶``¶¶" ;
	    		thirdLine += "```¶¶`";
	    		fourthLine += "``¶¶``";
	    		fifthLine += "`¶¶```";
	    		//processedString+="¶¶¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "```¶¶\r\n" + "``¶¶\r\n" + "`¶¶";
				break;
				
			case ('8'):
				firstLine +="`¶¶¶¶`" ;
	    		secondLine += "¶¶``¶¶" ;
	    		thirdLine +="`¶¶¶¶`" ;
	    		fourthLine += "¶¶``¶¶" ;
	    		fifthLine +="`¶¶¶¶`";
	    		//processedString+="`¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "`¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + 	"`¶¶¶¶";
				break;
			
			case ('9'):
				firstLine +="`¶¶¶¶`" ;
    			secondLine += "¶¶``¶¶" ;
    			thirdLine +="`¶¶¶¶¶";
    			fourthLine +="````¶¶" ;
    			fifthLine +="`¶¶¶¶`";
				//processedString+="`¶¶¶¶\r\n" +"¶¶``¶¶\r\n" + "`¶¶¶¶¶\r\n" + "````¶¶\r\n" + 	"`¶¶¶¶";
				break;
				
			case ('0'):
				firstLine +="`¶¶¶¶`";
    			secondLine += "¶¶``¶¶" ;
    			thirdLine += "¶¶``¶¶";
    			fourthLine += "¶¶``¶¶";
    			fifthLine +="`¶¶¶¶`";
    			//processedString+="`¶¶¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "¶¶``¶¶\r\n" + "`¶¶¶¶";
			break;
			
			case ('\n'):
				firstLine +="\n";
    			secondLine += "\n";
    			thirdLine +="\n";
    			fourthLine += "\n";
    			fifthLine +="\n";
    	 		break;
    			
			default:
				break;
			}	
			firstLine +="``" ;
			secondLine += "``"  ;
			thirdLine += "``" ;
			fourthLine += "``"  ;
			fifthLine +="``" ;
		}
		processedString = firstLine +"\n"+ secondLine +"\n" + thirdLine +"\n" + fourthLine  +"\n"+ fifthLine ;
		
		return processedString;
		
	}

}


