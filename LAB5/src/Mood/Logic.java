package Mood;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

//2) Напишите программу «Mood Sensor» (эмулировать датчика настроения), кото-
//рая «залазит» в душу пользователя и определяет его настроение в текущий
//момент времени. Приложение будет генерировать случайное число, в зави-
//симости от значения которого на экран выводится одно из псевдографических
//«лиц», которое и будет отображать настроение пользователя.

public class Logic {
	
	public static void generate ( ) {
		String strLine = "";
		int numberOfRandom = 0;
		
		 ArrayList<String> list = new ArrayList<String>(); 
		 //ArrayList представляет простой список, аналогичный массиву, за тем исключением, что количество элементов в нем не фиксировано.
		
		 try{
			   FileInputStream fstream = new FileInputStream("G:/БГУ/java/JAVA_PRACTICE/LAB5(TASK1)/text.txt");
			   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			    while ((strLine = br.readLine()) != null) // метод readLine(), который позволяет считывать из потока построчно.
			   	{   
			    	list.add(strLine);
				}
			}
		catch (IOException e){
			   System.out.println("Ошибка");
			}
		 
			Random random = new Random ();
			numberOfRandom = random.nextInt(list.size());
			
				System.out.println("Congratulations! Your mood is: " + list.get(numberOfRandom));
			}

}
