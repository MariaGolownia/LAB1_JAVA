package Mood;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

//2) �������� ��������� �Mood Sensor� (����������� ������� ����������), ����-
//��� �������� � ���� ������������ � ���������� ��� ���������� � �������
//������ �������. ���������� ����� ������������ ��������� �����, � ����-
//������� �� �������� �������� �� ����� ��������� ���� �� �����������������
//�����, ������� � ����� ���������� ���������� ������������.

public class Logic {
	
	public static void generate ( ) {
		String strLine = "";
		int numberOfRandom = 0;
		
		 ArrayList<String> list = new ArrayList<String>(); 
		 //ArrayList ������������ ������� ������, ����������� �������, �� ��� �����������, ��� ���������� ��������� � ��� �� �����������.
		
		 try{
			   FileInputStream fstream = new FileInputStream("G:/���/java/JAVA_PRACTICE/LAB5(TASK1)/text.txt");
			   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			    while ((strLine = br.readLine()) != null) // ����� readLine(), ������� ��������� ��������� �� ������ ���������.
			   	{   
			    	list.add(strLine);
				}
			}
		catch (IOException e){
			   System.out.println("������");
			}
		 
			Random random = new Random ();
			numberOfRandom = random.nextInt(list.size());
			
				System.out.println("Congratulations! Your mood is: " + list.get(numberOfRandom));
			}

}
