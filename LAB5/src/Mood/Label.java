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
				firstLine +="`����`";
			    secondLine += "��``��";
			    thirdLine += "������";
			    fourthLine += "��``��";
			    fifthLine += "��``��";
				//processedString+="`����\r\n" + "��``��\r\n" + "������\r\n" + "��``��\r\n" + "��``��";
				break;
				
			case ('B'):
			case ('b'):
				firstLine +="�����`";
		    	secondLine += "��``��";
		    	thirdLine +="�����`";
		    	fourthLine +="��``��";
		    	fifthLine +="�����`";
				//processedString+="�����\r\n" + 	"��``��\r\n" + "�����\r\n" + "��``��\r\n" + "�����";
				break;
				
			case ('C'):
			case ('c'):
				firstLine +="`����`" ;
	    		secondLine += "��``��" ;
	    		thirdLine +="��````" ;
	    		fourthLine +="��``��";
	    		fifthLine +="`����`";
	    		//processedString+="`����\r\n" + "��``��\r\n" + "��\r\n" + "��``��\r\n" + "`����";
			break;
			
			case ('D'):
			case ('d'):
				firstLine +="�����`";
    			secondLine += "��``��";
    			thirdLine +="��``��";
    			fourthLine +="��``��";
    			fifthLine +="�����`";
    			//processedString+="�����\r\n" + "��``��\r\n" +"��``��\r\n" + "��``��\r\n" + "�����";
			break;
			
			case ('E'):
			case ('e'):
				firstLine +="�����`";
    			secondLine += "��````";
    			thirdLine +="����``";
    			fourthLine +="��````";
    			fifthLine +="�����`";
    			//processedString+="�����\r\n" + 	"��\r\n" + 	"����\r\n" + "��\r\n" + "�����";
			break;
			
			case ('F'):
			case ('f'):
				firstLine +="������";
    			secondLine +="��````" ;
    			thirdLine +="����``";
    			fourthLine += "��````";
    			fifthLine +="��````";
    			//processedString+="������\r\n" + "��\r\n" + 	"����\r\n" + "��\r\n" + "��";
    			break;
    			
			case ('G'):
			case ('g'):
				firstLine +="`����`";
    			secondLine += "��````" ;
    			thirdLine +="��`���";
    			fourthLine +="��``��";
    			fifthLine +="`����`";
    			//processedString+="`����\r\n" + 	"��\r\n" + 	"��`���\r\n" + "��``��\r\n" + "`����";
    			break;
			
			case ('H'):
			case ('h'):
				firstLine +="��``��";
    			secondLine += "��``��" ;
    			thirdLine += "������";
    			fourthLine +="��``��";
    			fifthLine += "��``��";
    			//processedString+="��``��\r\n" + "��``��\r\n" + "������\r\n" + "��``��\r\n" + "��``��";
    			break;
			
			case ('I'):
			case ('i'):
				firstLine +="������";
    			secondLine += "``��``";
    			thirdLine +="``��``";
    			fourthLine +="``��``";
    			fifthLine +="������";
    			//processedString+="������\r\n" + "``��\r\n" + "``��\r\n" + "``��\r\n" + "������";
    			break;
			
			case ('J'):
			case ('j'):
				firstLine +="������";
    			secondLine +="````��" ;
    			thirdLine +=	"````��";
    			fourthLine +=	"��``��";
    			fifthLine +="`����`";
    			//processedString+="������\r\n" +	"````��\r\n" + 	"````��\r\n" + 	"��``��\r\n" + 	"`����";
			break;
			
			case ('K'):
			case ('k'):
				firstLine +="��``��";
    			secondLine +=  "��`��`";
    			thirdLine +="����``";
    			fourthLine +="��`��`";
    			fifthLine +="��``��";
    			//processedString+="��``��\r\n" + "��`��\r\n" + "����\r\n" + "��`��\r\n" + "��``��";
			break;
			
			case ('L'):
			case ('l'):
				firstLine +="��````" ;
    			secondLine += "��````";
    			thirdLine +="��````";
    			fourthLine +="��````";
    			fifthLine +="������";
    			//processedString+="��\r\n" + "��\r\n" + "��\r\n" + "��\r\n" + "������";
			break;
			
			case ('M'):
			case ('m'):
				firstLine +="��```�";
    			secondLine +=  "���`��" ;
    			thirdLine +="��`�`�";
    			fourthLine += "��```�";
    			fifthLine +="��```�";
    			//processedString+="��```�\r\n" + "���`��\r\n" + "��`�`�\r\n" + "��```�\r\n" + "��```�";
			break;
			
			case ('N'):
			case ('n'):
				firstLine +="��``��";
    			secondLine += "���`��";
    			thirdLine +="��`���";
    			fourthLine +="��``��";
    			fifthLine +="��``��";
    			//processedString+="��``��\r\n" + "���`��\r\n" +	"��`���\r\n" + "��``��\r\n" + "��``��";
			break;
			
			case ('O'):
			case ('o'):
				firstLine +="`����`";
    			secondLine += "��``��" ;
    			thirdLine += "��``��";
    			fourthLine += "��``��";
    			fifthLine +="`����`";
    			//processedString+="`����\r\n" + "��``��\r\n" + "��``��\r\n" + "��``��\r\n" + "`����";
    			break;
			
			case ('P'):
			case ('p'):
				firstLine +="�����`";
    			secondLine += "��``��";
    			thirdLine +="�����`";
    			fourthLine +="��````";
    			fifthLine +="��````";
    			//processedString+="�����\r\n" + "��``��\r\n" + "�����\r\n" + "��\r\n" + "��";
			break;
			
			case ('Q'):
			case ('q'):
				firstLine +="`����`";
    			secondLine += "��``��";
    			thirdLine +="��`���";
    			fourthLine +="��``��";
    			fifthLine +="`�����";;
    			//processedString+="`����\r\n" + "��``��\r\n" + "��`���\r\n" + "��``��\r\n" + "`�����";
			break;
			
			case ('R'):
			case ('r'):
				firstLine +="�����`";
    			secondLine += "��``��" ;
    			thirdLine += "�����`";
    			fourthLine += "��``��" ;
    			fifthLine +="��``��";
    			//processedString+="�����\r\n" + "��``��\r\n" + "�����\r\n" + "��``��\r\n" + "��``��";
    			break;
    			
			case ('S'):
			case ('s'):
				firstLine +="`����`";
    			secondLine += "��````" ;
    			thirdLine +="`����`";
    			fourthLine +="````��";
    			fifthLine +="`����`";
    			//processedString+="`����\r\n" + "��\r\n" + "`����\r\n" + "````��\r\n" + "`����";
    			break;
    			
			case ('T'):
			case ('t'):
				firstLine +="������";
    			secondLine +=  "``��``";
    			thirdLine += "``��``";
    			fourthLine +="``��``";
    			fifthLine +="``��``";
    			//processedString+="������\r\n" + "``��\r\n" + "``��\r\n" + "``��\r\n" + 	"``��";
    			break;
    			
			case ('U'):
			case ('u'):
				firstLine +="��``��";
    			secondLine +="��``��" ;
    			thirdLine +="��``��";
    			fourthLine += "��``��";
    			fifthLine += "`����`";
    			//processedString+="��``��\r\n" + "��``��\r\n" +"��``��\r\n" + "��``��\r\n" + "`����";
    			break;
    			
			case ('V'):
			case ('v'):
				firstLine +="��``��";
    			secondLine += "��``��";
    			thirdLine +="��``��" ;
    			fourthLine += "`����`";
    			fifthLine +="``��``";
    			//processedString+="��``��\r\n" + "��``��\r\n" + 	"��``��\r\n" + "`����\r\n" + "``��";
    			break;
    			
			case ('W'):
			case ('w'):
				firstLine +="��```�";
    			secondLine += "��```�";
    			thirdLine += "��`�`�";
    			fourthLine +="������" ;
    			fifthLine +="`��`��";
    			//processedString+="��```�\r\n" + "��```�\r\n" + "��`�`�\r\n" + "������\r\n" + "`��`��";
			break;
			
				case ('X'):
				case ('x'):
				firstLine +="��``��";
				secondLine +=  "`����`" ;
				thirdLine += "``��``" ;
				fourthLine += "`����`" ;
				fifthLine +="��``��";
				//processedString+="��``��\r\n" + "`����\r\n" + "``��\r\n" + "`����\r\n" + "��``��";
			break;
			
			case ('Y'):
			case ('y'):
				firstLine +="��``��";
    			secondLine += "`����`";
    			thirdLine += "``��``";
    			fourthLine += "``��``" ;
    			fifthLine +="``��``";
    			//processedString+="��``��\r\n" + "`����\r\n" + "``��\r\n" + "``��\r\n" + "``��";
    			break;
    			
			case ('Z'):
			case ('z'):
				firstLine +="������";
    			secondLine += "```��`" ;
    			thirdLine +="``��``";
    			fourthLine +=	"`��```";
    			fifthLine +="������";
    			//processedString+="������\r\n" + "```��\r\n" + 	"``��\r\n" + "`��\r\n" + "������";
    			break;
    			
    			
			case ('�'):
			case('�'):
				firstLine +="`����`";
			    secondLine += "��``��";
			    thirdLine += "������" ;
			    fourthLine += "��``��";
			    fifthLine +=  "��``��";
				//processedString+="`����\r\n" + "��``��\r\n" + "������\r\n" + "��``��\r\n" + "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="�����`";
			    secondLine += "��````" ;
			    thirdLine +=   "�����`";
			    fourthLine += "��``��";
			    fifthLine +=  "�����`";
				//processedString+="�����\r\n" + "��\r\n" + "�����\r\n" +	"��``��\r\n" + 	"�����";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="�����`";
			    secondLine +="��``��" ;
			    thirdLine +=  "�����`";
			    fourthLine += "��``��";
			    fifthLine +=  "�����`";
				//processedString+="�����\r\n" + "��``��\r\n" + "�����\r\n" + "��``��\r\n" + "�����";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="������";
			    secondLine += "��````";
			    thirdLine += "��````" ;
			    fourthLine += "��````";
			    fifthLine += "��````" ;
				//processedString+="������\r\n" + "��\r\n" + "��\r\n" + "��\r\n" + "��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="``���``" ;
			    secondLine +=  "`��`��`";
			    thirdLine +=   "`��`��`";
			    fourthLine += "�������";
			    fifthLine +=  "�`````�";
				//processedString+="``���\r\n" + "`��`��\r\n" + "`��`��\r\n" + "�������\r\n" +"�`````�";
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
				//processedString+="������\r\n" + "��\r\n" + "����\r\n" + "��\r\n" + "������";
				break;
						
			case ('�'):
			case('�'):
				firstLine +="��`�`��";
			    secondLine +="`�����`" ;
			    thirdLine +=  "``���``" ;
			    fourthLine += "`�����`";
			    fifthLine += "��`�`��" ;
				//processedString+="��`�`��\r\n" + "`�����\r\n" + "``���\r\n" + "`�����\r\n" + "��`�`��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="�����`";
			    secondLine += "````��";
			    thirdLine +=  "``���`";
			    fourthLine +=  "````��";
			    fifthLine +=  "�����`";
				//processedString+="�����\r\n" + "````��\r\n" + "``���\r\n" + "````��\r\n" + 	"�����";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +="��``��" ;
			    thirdLine +=   "��`���";
			    fourthLine += "���`��";
			    fifthLine += "��``��" ;
				//processedString+="��``��\r\n" + "��``��\r\n" + "��`���\r\n" + "���`��\r\n" + "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="``��``";
			    secondLine += "��``��";
			    thirdLine +=   "��`���" ;
			    fourthLine += "���`��" ;
			    fifthLine += "��``��" ;
				//processedString+="``��\r\n" +	"��``��\r\n" + "��`���\r\n" + "���`��\r\n" + "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +="��`��`"  ;
			    thirdLine += "����``" ;
			    fourthLine += "��`��`";
			    fifthLine +=  "��``��";
				//processedString+="��``��\r\n" + "��`��\r\n" + "����\r\n" + "��`��\r\n" + "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="```���";
			    secondLine += "``�`��" ;
			    thirdLine +=  "`�``��";
			    fourthLine +="��``��" ;
			    fifthLine +=  "��``��";
				//processedString+="```���\r\n" + "``�`��\r\n" + "`�``��\r\n" + "��``��\r\n" + "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��```��" ;
			    secondLine += "���`���" ;
			    thirdLine +=    "��`�`��" ;
			    fourthLine +=  "��```��";
			    fifthLine +=  "��```��";
				//processedString+="��```��\r\n" + "���`���\r\n" + "��`�`��\r\n" + "��```��\r\n" + "��```��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +=  "��``��";
			    thirdLine +=  "������";
			    fourthLine += "��``��";
			    fifthLine +=  "��``��";
				//processedString+="��``��\r\n" + "��``��\r\n" + "������\r\n" + "��``��\r\n" + "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="`����`" ;
			    secondLine += "��``��";
			    thirdLine +=   "��``��" ;
			    fourthLine += "��``��" ;
			    fifthLine += "`����`" ;
				//processedString+="`����\r\n" + "��``��\r\n" + "��``��\r\n" + "��``��\r\n" + "`����";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="������";
			    secondLine +=  "��``��";
			    thirdLine += "��``��" ;
			    fourthLine += "��``��";
			    fifthLine +=  "��``��";
				processedString+="������\r\n" + "��``��\r\n" + "��``��\r\n" +"��``��\r\n" + "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="�����`";
			    secondLine += "��``��";
			    thirdLine += "������"  ;
			    fourthLine += "��````";
			    fifthLine +=  "��````";
				//processedString+="�����\r\n" + "��``��\r\n" + 	"������\r\n" + 	"��\r\n" + 	"��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="`����`";
			    secondLine +="��``��" ;
			    thirdLine +=  "��````";
			    fourthLine += "��``��";
			    fifthLine +=  "`����`";
				//processedString+="`����\r\n" + "��``��\r\n" + "��\r\n" + "��``��\r\n" + "`����";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="������" ;
			    secondLine += "``��``";
			    thirdLine +=  "``��``" ;
			    fourthLine += "``��``" ;
			    fifthLine +=  "``��``";
				//processedString+="������\r\n" + "``��\r\n" + "``��\r\n" +	"``��\r\n" + "``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +=  "`��`��";
			    thirdLine +=  "``����";
			    fourthLine += 	"````��" ;
			    fifthLine += "``���`" ;
				//processedString+="��``��\r\n" + "`��`��\r\n" + 	"``����\r\n" + 	"````��\r\n" + 	"``���";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="`������`";
			    secondLine += "�``��``�" ;
			    thirdLine += "�``��``�" ;
			    fourthLine +="`������`" ;
			    fifthLine += "```��```" ;
				//processedString+="`������\r\n" + "�``��``�\r\n" + "�``��``�\r\n" + 	"`������\r\n" + "```��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��" ;
			    secondLine += "`����`" ;
			    thirdLine +=  "``��``";
			    fourthLine += "`����`";
			    fifthLine +=  "��``��";
				//processedString+="��``��\r\n" + "`����\r\n" + "``��\r\n" + "`����\r\n" + "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +="��``��" ;
			    thirdLine += "��``��" ;
			    fourthLine += "��``��";
			    fifthLine +=  "`���`�";
				//processedString+="��``��\r\n" + "��``��\r\n" + "��``��\r\n" + "��``��\r\n" +	"`���`�";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��";
			    secondLine +=  "��``��" ;
			    thirdLine += "`�����" ;
			    fourthLine += "````��" ;
			    fifthLine += "````��" ;
				//processedString+="��``��\r\n" + "��``��\r\n" + 	"`�����\r\n" + 	"````��\r\n" + 	"````��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��```�";
			    secondLine += "��```�";
			    thirdLine +=  "��`�`�";
			    fourthLine += "��`�`�";
			    fifthLine += "������" ;
				//processedString+="��```�\r\n" + "��```�\r\n" + 	"��`�`�\r\n" + 	"��`�`�\r\n" + 	"������";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��```��";
			    secondLine += "��```��" ;
			    thirdLine += "��`�`��" ;
			    fourthLine += "��`�`��";
			    fifthLine +=  "�����`�";
				//processedString+="��```��\r\n" + "��```��\r\n" + "��`�`��\r\n" + "��`�`��\r\n" + "�����`�";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="���```" ;
			    secondLine += "`��```" ;
			    thirdLine += "`�����" ;
			    fourthLine +="`��``�`"  ;
			    fifthLine += "`�����`" ;
				//processedString+="���\r\n" + "`��\r\n" + 	"`�����\r\n" + 	"`��``�\r\n" + 	"`�����";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��````";
			    secondLine += "��````" ;
			    thirdLine += "����``" ;
			    fourthLine += "��``��" ;
			    fifthLine +=  "�����";
				//processedString+="��\r\n" + "��\r\n" + 	"����\r\n" + "��``��\r\n" + "�����";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="`����`";
			    secondLine += "��``��" ;
			    thirdLine +=  "```���";
			    fourthLine += 	"��``��";
			    fifthLine += "`����`" ;
				//processedString+="`����\r\n" + 	"��``��\r\n" + 	"```���\r\n" + 	"��``��\r\n" + 	"`����";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="��``��`";
			    secondLine +="��`�``�" ;
			    thirdLine += "�����`�" ;
			    fourthLine += "��`�``�" ;
			    fifthLine +=  "��``��`";
				//processedString+="��``��\r\n" + "��`�``�\r\n" + "�����`�\r\n" + "��`�``�\r\n" + "��``��";
				break;
				
			case ('�'):
			case('�'):
				firstLine +="`�����";
		    	secondLine += "��``��" ;
		    	thirdLine +=  "`�����";
		    	fourthLine += "��``��" ;
		    	fifthLine +=  "��``��";
				//processedString+="`�����\r\n" + "��``��\r\n" + 	"`�����\r\n" + 	"��``��\r\n" + 	"��``��";
				break;
				
			
				
			case (','):
				firstLine +="```";
    			secondLine +=  "```" ;
    			thirdLine +="```";
    			fourthLine +="��`";
    			fifthLine +="`�`";
    			//processedString+="\r\n" + "\r\n" +"\r\n" +"��\r\n" +"`�";
    			break;
    			
			case ('.'):
				firstLine +="```";
    			secondLine += "```" ;
    			thirdLine +="```" ;
    			fourthLine +="```" ;
    			fifthLine += "��`";
    			//processedString+="\r\n" + "\r\n" + "\r\n" 	+"\r\n" + "��";
    			break;
    			
			case ('!'):
				firstLine +="``���`";
    			secondLine += "``���`";
    			thirdLine += "``���`" ;
    			fourthLine += "``````" ;
    			fifthLine +="``���`";
    			//processedString+="``���\r\n" + 	"``���\r\n" + "``���\r\n" + "\r\n" + "``���";
    			break;
    			
			case ('?'):
				firstLine +="`����`";
    			secondLine +="�```��";
    			thirdLine +="``���`";
    			fourthLine +="``````";
    			fifthLine +="``��``";
    			//processedString+="`����\r\n" + 	"�```��\r\n" + 	"``���\r\n" + "\r\n" +"``��";
			break;
			
			case (':'):
				firstLine +="```";
    			secondLine +="��`" ;
    			thirdLine += "```";
    			fourthLine += "��`";
    			fifthLine += "```";
    			//processedString+="\r\n" + "��\r\n" + "\r\n" + "��\r\n" + "";
    			break;
    			
			case ('-'):
				firstLine +="``````";
    			secondLine += "``````";
    			thirdLine +="�����`";
    			fourthLine += "``````" ;
    			fifthLine +="``````";
    			//processedString+="\r\n" + "\r\n" + 	"�����\r\n" + "\r\n" + "";
    			break;
    			
			case ('+'):
				firstLine +="``��``";
    			secondLine += "``��``";
    			thirdLine += "������";
    			fourthLine +="``��``" ;
    			fifthLine +="``��``";
    			//processedString+="\r\n" + 	"``��\r\n" + "������\r\n" + "``��";
    			break;
    			
			case ('='):
				firstLine +="``````";
    			secondLine += "������";
    			thirdLine +="``````";
    			fourthLine +="������";
    			fifthLine += "``````";
    			//processedString+="\r\n" + "������\r\n" + "\r\n" + "������\r\n" + "";
    			break;
    			
			case ('('):
				firstLine +="`��" ;
    			secondLine += "��`";
    			thirdLine += "�``" ;
    			fourthLine += "��`";
    			fifthLine += "`��";
				//processedString+=	"`��\r\n" + "��\r\n" + "�\r\n" + "��\r\n" + "`��";
			break;
			
			case (')'):
				firstLine +="��`";
    			secondLine += "`��";
    			thirdLine +="``�";
    			fourthLine += "`��";
    			fifthLine +="��`";
    			//processedString+="��\r\n" + "`��\r\n" + "``�\r\n" + "`��\r\n" + "��";
    			break;
    			
			case ('*'):
				firstLine +="``````";
    			secondLine +="`�``�`";
    			thirdLine +="������" ;
    			fourthLine +="`�``�`";
    			fifthLine += "``````";
    			//processedString+="��``��\r\n" + "`����\r\n" + "``��\r\n" + 	"`����\r\n" + "��``��";
    			break;
    			
			case ('/'):
				firstLine +="`````�" ;
    			secondLine += "````�`" ;
    			thirdLine +="```�``";
    			fourthLine +="``�```" ;
    			fifthLine +="�`````";
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
				firstLine +="```��`";
    			secondLine += "`����`";
    			thirdLine +="```��`" ;
    			fourthLine += "```��`";
    			fifthLine +="```��`";
    			//processedString+="```��\r\n" + "`����\r\n" + "```��\r\n" + "```��\r\n" + "```��";
    			break;
    			
			case ('2'):
				firstLine +="`����`";
	    		secondLine += "��``��";
	    		thirdLine +="```��'";
	    		fourthLine +="`��'''";
	    		fifthLine +="������";
	    		//processedString+="`����\r\n" + 	"��``��\r\n" + 	"```��\r\n" + "`��\r\n" + "������";
			break;
			
			case ('3'):
				firstLine +="`����`";
	    		secondLine += "�```��" ;
	    		thirdLine += "``���`";
	    		fourthLine += "�```��";
	    		fifthLine +="`����`";
	    		//processedString+="`����\r\n" + "�```��\r\n" + "``���\r\n" + "�```��\r\n" +"`����";
			break;
			
			case ('4'):
				firstLine +="��````";
	    		secondLine +=  "��``��";
	    		thirdLine +="������";
	    		fourthLine +="````��";
	    		fifthLine +="````��";
	    		//processedString+="��\r\n" + "��``��\r\n" + 	"������\r\n" + 	"````��\r\n" + 	"````��";
				break;
				
			case ('5'):
				firstLine +="�����`";
	    		secondLine += "��````";
	    		thirdLine +="�����`";
	    		fourthLine +="````��";
	    		fifthLine +="�����`";
	    		//processedString+="�����\r\n" + 	"��\r\n" + 	"�����\r\n" +"````��\r\n" + "�����";
				break;
				
			case ('6'):
				firstLine +="`����`";
	    		secondLine += "��````";
	    		thirdLine += "�����`";
	    		fourthLine += "��``��";
	    		fifthLine +="`����`";
	    		//processedString+="`����\r\n" + "��\r\n" + "�����\r\n" + "��``��\r\n" + 	"`����";
				break;
				
			case ('7'):
				firstLine +="������";
	    		secondLine += "��``��" ;
	    		thirdLine += "```��`";
	    		fourthLine += "``��``";
	    		fifthLine += "`��```";
	    		//processedString+="������\r\n" + "��``��\r\n" + "```��\r\n" + "``��\r\n" + "`��";
				break;
				
			case ('8'):
				firstLine +="`����`" ;
	    		secondLine += "��``��" ;
	    		thirdLine +="`����`" ;
	    		fourthLine += "��``��" ;
	    		fifthLine +="`����`";
	    		//processedString+="`����\r\n" + "��``��\r\n" + "`����\r\n" + "��``��\r\n" + 	"`����";
				break;
			
			case ('9'):
				firstLine +="`����`" ;
    			secondLine += "��``��" ;
    			thirdLine +="`�����";
    			fourthLine +="````��" ;
    			fifthLine +="`����`";
				//processedString+="`����\r\n" +"��``��\r\n" + "`�����\r\n" + "````��\r\n" + 	"`����";
				break;
				
			case ('0'):
				firstLine +="`����`";
    			secondLine += "��``��" ;
    			thirdLine += "��``��";
    			fourthLine += "��``��";
    			fifthLine +="`����`";
    			//processedString+="`����\r\n" + "��``��\r\n" + "��``��\r\n" + "��``��\r\n" + "`����";
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


