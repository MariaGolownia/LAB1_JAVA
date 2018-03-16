package Cake;

public class Main {
public static void main(String[] args) {
	System.out.println("Program-simulator pies with surprise.\n");
	System.out.println("Take your pie: ");
	System.out.print(Pie.draw());
	System.out.println("\nYour surprise in pie is: " + Logic.solve());
	}
}
