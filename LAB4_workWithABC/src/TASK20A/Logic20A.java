package TASK20A;

//20) Разработайте программу, которая проверяет, что точка с координатами (x, y)
//лежит внутри прямоугольника, левая верхняя вершина которого имеет коор-
//динаты (x1, y1), правая нижняя – (x2, y2), а стороны параллельны координат-
//ным осям.

public class Logic20A {

	public static Boolean belongsToTheRectangle (double x1, double y1, double x2, double y2, double xPoint, double yPoint) {
		if(xPoint <= x2 && xPoint >= x1 && xPoint <= y1 && xPoint >= y2) {
			return true;
		}
		else return false;
		
	}
}
