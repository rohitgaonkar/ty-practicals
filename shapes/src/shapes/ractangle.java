package shapes;

import java.util.Scanner;

public class ractangle {
	private double lenght,breath,area,para;

	public ractangle() {
		carea();
	}
	public double carea() {
		System.out.println("enter lenght and breath of rectangle ");
		Scanner input = new Scanner(System.in);
		float l=Float.parseFloat(input.next());
		float b=Float.parseFloat(input.next());
		lenght=l;
		breath=b;
		area=lenght*breath;
		Circumference();
		print();
		return area;
		
		
	}
	
	public double Circumference() {
		para =2*(lenght+breath);
		return para;
		
	}
	
	public void print() {
		System.out.println("area of rectangle =" + area);
		System.out.println("parameter of rectangle =" + para);
	}

}
