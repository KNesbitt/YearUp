
public class CalculateArea {

	public static void main(String[] args) {
	
		double circleAreaInMainMethod = CalculateCircleArea(10);
		System.out.println("Area of the circle is " + circleAreaInMainMethod);
		double rectangleAreaInMainMethod = AreaRect (20,3);
		System.out.println("Area of the rectangle is " + rectangleAreaInMainMethod);
		
}
	
		public static double CalculateCircleArea(int radius)
{
		
		//This method calculates the area of a circle
		//Input: interger radius value
		//Output: double are
		
		double area = 3.14 * radius * radius;
		return area; 
}
	public static double AreaRect (int width, int length){
		double area = length * width;
		return area;
		}
}
