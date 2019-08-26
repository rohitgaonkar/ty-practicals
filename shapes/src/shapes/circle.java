package shapes;
import java.util.Scanner;

public class circle {
	private double radius,area,circum;
	
	public circle() {
		carea();
		
		
	}
	public double carea() {
		System.out.println("enter radius of circle ");
		Scanner input = new Scanner(System.in);
		float l=Float.parseFloat(input.next());
		radius=l;
		area=3.14*(radius*radius);
		Circumference();
		print();
		return area;
		
		
	}
	
	public double Circumference() {
		circum=2*3.14*radius;
		return circum;
		
	}
	
	public void print() {
		System.out.println("area of circle =" + area);
		System.out.println("area of circumference =" + circum);
	}
}
