package shapes;

import java.util.Scanner;

public class square {
	public float area,para,value;
	public square() {
		qarea();
		
	}
	public float qarea() {
		System.out.println("enter radius of square ");
		Scanner input = new Scanner(System.in);
		float l=Float.parseFloat(input.next());
		value=l;
		area=value*value;
		parameter();
		print();
		return area;
		
	}
	
	public float parameter() {
		para=4*value;
		return para;
		
	}
	
	public void print() {
		System.out.println("area of quare =" + area);
		System.out.println("parameter of square =" + para);
	}
	
}
