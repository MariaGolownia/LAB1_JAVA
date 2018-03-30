package TryToGuessTheNumber;

public class LabelByCharacters {
	public static String createLabel (String str)
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
				firstLine +="`����`";
			    secondLine += "��``��";
			    thirdLine += "������";
			    fourthLine += "��``��";
			    fifthLine += "��``��";
				break;
				
			case ('B'):
			case ('b'):
				firstLine +="�����`";
		    	secondLine += "��``��";
		    	thirdLine +="�����`";
		    	fourthLine +="��``��";
		    	fifthLine +="�����`";
				break;
				
			case ('C'):
			case ('c'):
				firstLine +="`����`" ;
	    		secondLine += "��``��" ;
	    		thirdLine +="��````" ;
	    		fourthLine +="��``��";
	    		fifthLine +="`����`";
	    		break;
			
			case ('D'):
			case ('d'):
				firstLine +="�����`";
    			secondLine += "��``��";
    			thirdLine +="��``��";
    			fourthLine +="��``��";
    			fifthLine +="�����`";
    			break;
			
			case ('E'):
			case ('e'):
				firstLine +="�����`";
    			secondLine += "��````";
    			thirdLine +="����``";
    			fourthLine +="��````";
    			fifthLine +="�����`";
    			break;
			
			case ('F'):
			case ('f'):
				firstLine +="������";
    			secondLine +="��````" ;
    			thirdLine +="����``";
    			fourthLine += "��````";
    			fifthLine +="��````";
    			break;
    			
			case ('G'):
			case ('g'):
				firstLine +="`����`";
    			secondLine += "��````" ;
    			thirdLine +="��`���";
    			fourthLine +="��``��";
    			fifthLine +="`����`";
    			break;
			
			case ('H'):
			case ('h'):
				firstLine +="��``��";
    			secondLine += "��``��" ;
    			thirdLine += "������";
    			fourthLine +="��``��";
    			fifthLine += "��``��";
    			break;
			
			case ('I'):
			case ('i'):
				firstLine +="������";
    			secondLine += "``��``";
    			thirdLine +="``��``";
    			fourthLine +="``��``";
    			fifthLine +="������";
    			break;
			
			case ('J'):
			case ('j'):
				firstLine +="������";
    			secondLine +="````��" ;
    			thirdLine +=	"````��";
    			fourthLine +=	"��``��";
    			fifthLine +="`����`";
    			break;
			
			case ('K'):
			case ('k'):
				firstLine +="��``��";
    			secondLine +=  "��`��`";
    			thirdLine +="����``";
    			fourthLine +="��`��`";
    			fifthLine +="��``��";
    			break;
			
			case ('L'):
			case ('l'):
				firstLine +="��````" ;
    			secondLine += "��````";
    			thirdLine +="��````";
    			fourthLine +="��````";
    			fifthLine +="������";
    			break;
			
			case ('M'):
			case ('m'):
				firstLine +="��```�";
    			secondLine +=  "���`��" ;
    			thirdLine +="��`�`�";
    			fourthLine += "��```�";
    			fifthLine +="��```�";
    			break;
			
			case ('N'):
			case ('n'):
				firstLine +="��``��";
    			secondLine += "���`��";
    			thirdLine +="��`���";
    			fourthLine +="��``��";
    			fifthLine +="��``��";
    			break;
			
			case ('O'):
			case ('o'):
				firstLine +="`����`";
    			secondLine += "��``��" ;
    			thirdLine += "��``��";
    			fourthLine += "��``��";
    			fifthLine +="`����`";
    			break;
			
			case ('P'):
			case ('p'):
				firstLine +="�����`";
    			secondLine += "��``��";
    			thirdLine +="�����`";
    			fourthLine +="��````";
    			fifthLine +="��````";
    			break;
			
			case ('Q'):
			case ('q'):
				firstLine +="`����`";
    			secondLine += "��``��";
    			thirdLine +="��`���";
    			fourthLine +="��``��";
    			fifthLine +="`�����";;
    			break;
			
			case ('R'):
			case ('r'):
				firstLine +="�����`";
    			secondLine += "��``��" ;
    			thirdLine += "�����`";
    			fourthLine += "��``��" ;
    			fifthLine +="��``��";
    			break;
    			
			case ('S'):
			case ('s'):
				firstLine +="`����`";
    			secondLine += "��````" ;
    			thirdLine +="`����`";
    			fourthLine +="````��";
    			fifthLine +="`����`";
    			break;
    			
			case ('T'):
			case ('t'):
				firstLine +="������";
    			secondLine +=  "``��``";
    			thirdLine += "``��``";
    			fourthLine +="``��``";
    			fifthLine +="``��``";
    			break;
    			
			case ('U'):
			case ('u'):
				firstLine +="��``��";
    			secondLine +="��``��" ;
    			thirdLine +="��``��";
    			fourthLine += "��``��";
    			fifthLine += "`����`";
    			break;
    			
			case ('V'):
			case ('v'):
				firstLine +="��``��";
    			secondLine += "��``��";
    			thirdLine +="��``��" ;
    			fourthLine += "`����`";
    			fifthLine +="``��``";
    			break;
    			
			case ('W'):
			case ('w'):
				firstLine +="��```�";
    			secondLine += "��```�";
    			thirdLine += "��`�`�";
    			fourthLine +="������" ;
    			fifthLine +="`��`��";
    			break;
			
				case ('X'):
				case ('x'):
				firstLine +="��``��";
				secondLine +=  "`����`" ;
				thirdLine += "``��``" ;
				fourthLine += "`����`" ;
				fifthLine +="��``��";
				break;
			
			case ('Y'):
			case ('y'):
				firstLine +="��``��";
    			secondLine += "`����`";
    			thirdLine += "``��``";
    			fourthLine += "``��``" ;
    			fifthLine +="``��``";
    			break;
    			
			case ('Z'):
			case ('z'):
				firstLine +="������";
    			secondLine += "```��`" ;
    			thirdLine +="``��``";
    			fourthLine +=	"`��```";
    			fifthLine +="������";
    			break;
    			
    			
			case ('�'):
			case('�'):
				firstLine +="`����`";
			    secondLine += "��``��";
			    thirdLine += "������" ;
			    fourthLine += "��``��";
			    fifthLine +=  "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="�����`";
			    secondLine += "��````" ;
			    thirdLine +=   "�����`";
			    fourthLine += "��``��";
			    fifthLine +=  "�����`";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="�����`";
			    secondLine +="��``��" ;
			    thirdLine +=  "�����`";
			    fourthLine += "��``��";
			    fifthLine +=  "�����`";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="������";
			    secondLine += "��````";
			    thirdLine += "��````" ;
			    fourthLine += "��````";
			    fifthLine += "��````" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="``���``" ;
			    secondLine +=  "`��`��`";
			    thirdLine +=   "`��`��`";
			    fourthLine += "�������";
			    fifthLine +=  "�`````�";
				break;
				
			case ('�'):
			case('�'):
			case ('�'):
			case('�'):
				firstLine +="������";
			    secondLine += "��````";
			    thirdLine +=  "����``" ;
			    fourthLine +="��````" ;
			    fifthLine += "������" ;
				break;
						
			case ('�'):
			case('�'):
				firstLine +="��`�`��";
			    secondLine +="`�����`" ;
			    thirdLine +=  "``���``" ;
			    fourthLine += "`�����`";
			    fifthLine += "��`�`��" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="�����`";
			    secondLine += "````��";
			    thirdLine +=  "``���`";
			    fourthLine +=  "````��";
			    fifthLine +=  "�����`";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +="��``��" ;
			    thirdLine +=   "��`���";
			    fourthLine += "���`��";
			    fifthLine += "��``��" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="``��``";
			    secondLine += "��``��";
			    thirdLine +=   "��`���" ;
			    fourthLine += "���`��" ;
			    fifthLine += "��``��" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +="��`��`"  ;
			    thirdLine += "����``" ;
			    fourthLine += "��`��`";
			    fifthLine +=  "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="```���";
			    secondLine += "``�`��" ;
			    thirdLine +=  "`�``��";
			    fourthLine +="��``��" ;
			    fifthLine +=  "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��```��" ;
			    secondLine += "���`���" ;
			    thirdLine +=    "��`�`��" ;
			    fourthLine +=  "��```��";
			    fifthLine +=  "��```��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +=  "��``��";
			    thirdLine +=  "������";
			    fourthLine += "��``��";
			    fifthLine +=  "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="`����`" ;
			    secondLine += "��``��";
			    thirdLine +=   "��``��" ;
			    fourthLine += "��``��" ;
			    fifthLine += "`����`" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="������";
			    secondLine +=  "��``��";
			    thirdLine += "��``��" ;
			    fourthLine += "��``��";
			    fifthLine +=  "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="�����`";
			    secondLine += "��``��";
			    thirdLine += "������"  ;
			    fourthLine += "��````";
			    fifthLine +=  "��````";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="`����`";
			    secondLine +="��``��" ;
			    thirdLine +=  "��````";
			    fourthLine += "��``��";
			    fifthLine +=  "`����`";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="������" ;
			    secondLine += "``��``";
			    thirdLine +=  "``��``" ;
			    fourthLine += "``��``" ;
			    fifthLine +=  "``��``";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +=  "`��`��";
			    thirdLine +=  "``����";
			    fourthLine += 	"````��" ;
			    fifthLine += "``���`" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="`������`";
			    secondLine += "�``��``�" ;
			    thirdLine += "�``��``�" ;
			    fourthLine +="`������`" ;
			    fifthLine += "```��```" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��" ;
			    secondLine += "`����`" ;
			    thirdLine +=  "``��``";
			    fourthLine += "`����`";
			    fifthLine +=  "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +="��``��" ;
			    thirdLine += "��``��" ;
			    fourthLine += "��``��";
			    fifthLine +=  "`���`�";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +=  "��``��" ;
			    thirdLine += "`�����" ;
			    fourthLine += "````��" ;
			    fifthLine += "````��" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��```�";
			    secondLine += "��```�";
			    thirdLine +=  "��`�`�";
			    fourthLine += "��`�`�";
			    fifthLine += "������" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��```��";
			    secondLine += "��```��" ;
			    thirdLine += "��`�`��" ;
			    fourthLine += "��`�`��";
			    fifthLine +=  "�����`�";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="���```" ;
			    secondLine += "`��```" ;
			    thirdLine += "`�����" ;
			    fourthLine +="`��``�`"  ;
			    fifthLine += "`�����`" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��````";
			    secondLine += "��````" ;
			    thirdLine += "����``" ;
			    fourthLine += "��``��" ;
			    fifthLine +=  "�����";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="`����`";
			    secondLine += "��``��" ;
			    thirdLine +=  "```���";
			    fourthLine += 	"��``��";
			    fifthLine += "`����`" ;
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��`";
			    secondLine +="��`�``�" ;
			    thirdLine += "�����`�" ;
			    fourthLine += "��`�``�" ;
			    fifthLine +=  "��``��`";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="`�����";
		    	secondLine += "��``��" ;
		    	thirdLine +=  "`�����";
		    	fourthLine += "��``��" ;
		    	fifthLine +=  "��``��";
				break;
				
						
			case (','):
				firstLine +="```";
    			secondLine +=  "```" ;
    			thirdLine +="```";
    			fourthLine +="��`";
    			fifthLine +="`�`";
    			break;
    			
			case ('.'):
				firstLine +="```";
    			secondLine += "```" ;
    			thirdLine +="```" ;
    			fourthLine +="```" ;
    			fifthLine += "��`";
    			break;
    			
			case ('!'):
				firstLine +="``���`";
    			secondLine += "``���`";
    			thirdLine += "``���`" ;
    			fourthLine += "``````" ;
    			fifthLine +="``���`";
    			break;
    			
			case ('?'):
				firstLine +="`����`";
    			secondLine +="�```��";
    			thirdLine +="``���`";
    			fourthLine +="``````";
    			fifthLine +="``��``";
    			break;
			
			case (':'):
				firstLine +="```";
    			secondLine +="��`" ;
    			thirdLine += "```";
    			fourthLine += "��`";
    			fifthLine += "```";
    			break;
    			
			case ('-'):
				firstLine +="``````";
    			secondLine += "``````";
    			thirdLine +="�����`";
    			fourthLine += "``````" ;
    			fifthLine +="``````";
    			break;
    			
			case ('+'):
				firstLine +="``��``";
    			secondLine += "``��``";
    			thirdLine += "������";
    			fourthLine +="``��``" ;
    			fifthLine +="``��``";
    			break;
    			
			case ('='):
				firstLine +="``````";
    			secondLine += "������";
    			thirdLine +="``````";
    			fourthLine +="������";
    			fifthLine += "``````";
    			break;
    			
			case ('('):
				firstLine +="`��" ;
    			secondLine += "��`";
    			thirdLine += "�``" ;
    			fourthLine += "��`";
    			fifthLine += "`��";
				break;
			
			case (')'):
				firstLine +="��`";
    			secondLine += "`��";
    			thirdLine +="``�";
    			fourthLine += "`��";
    			fifthLine +="��`";
    			break;
    			
			case ('*'):
				firstLine +="``````";
    			secondLine +="`�``�`";
    			thirdLine +="������" ;
    			fourthLine +="`�``�`";
    			fifthLine += "``````";
    			break;
    			
			case ('/'):
				firstLine +="`````�" ;
    			secondLine += "````�`" ;
    			thirdLine +="```�``";
    			fourthLine +="``�```" ;
    			fifthLine +="�`````";
				break;
    			
			case (' '):
				firstLine +="````";
    			secondLine += "````";
    			thirdLine +="````";
    			fourthLine +="````";
    			fifthLine +="````";
    			break;
    			
			case ('1'):
				firstLine +="```��`";
    			secondLine += "`����`";
    			thirdLine +="```��`" ;
    			fourthLine += "```��`";
    			fifthLine +="```��`";
    			break;
    			
			case ('2'):
				firstLine +="`����`";
	    		secondLine += "��``��";
	    		thirdLine +="```��'";
	    		fourthLine +="`��'''";
	    		fifthLine +="������";
	    		break;
			
			case ('3'):
				firstLine +="`����`";
	    		secondLine += "�```��" ;
	    		thirdLine += "``���`";
	    		fourthLine += "�```��";
	    		fifthLine +="`����`";
	    		break;
			
			case ('4'):
				firstLine +="��````";
	    		secondLine +=  "��``��";
	    		thirdLine +="������";
	    		fourthLine +="````��";
	    		fifthLine +="````��";
	    		break;
				
			case ('5'):
				firstLine +="�����`";
	    		secondLine += "��````";
	    		thirdLine +="�����`";
	    		fourthLine +="````��";
	    		fifthLine +="�����`";
	    		break;
				
			case ('6'):
				firstLine +="`����`";
	    		secondLine += "��````";
	    		thirdLine += "�����`";
	    		fourthLine += "��``��";
	    		fifthLine +="`����`";
	    		break;
				
			case ('7'):
				firstLine +="������";
	    		secondLine += "��``��" ;
	    		thirdLine += "```��`";
	    		fourthLine += "``��``";
	    		fifthLine += "`��```";
	    		break;
				
			case ('8'):
				firstLine +="`����`" ;
	    		secondLine += "��``��" ;
	    		thirdLine +="`����`" ;
	    		fourthLine += "��``��" ;
	    		fifthLine +="`����`";
	    		break;
			
			case ('9'):
				firstLine +="`����`" ;
    			secondLine += "��``��" ;
    			thirdLine +="`�����";
    			fourthLine +="````��" ;
    			fifthLine +="`����`";
				break;
				
			case ('0'):
				firstLine +="`����`";
    			secondLine += "��``��" ;
    			thirdLine += "��``��";
    			fourthLine += "��``��";
    			fifthLine +="`����`";
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
