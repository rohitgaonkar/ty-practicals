package employee;
import java.util.Scanner;

public class empsalary {
	private float basic,grosssalary,nets,net;
	private static float a,b,c;
	private float hra,ba,ta,lic,pf,hloan,bloan;
	private String name;

	public empsalary(String n,float b) {
		name=n;
		basic=b;
		
	}
	
	public static void setediction()
	{
		System.out.println("enter d name of deduction values as hra,ba,ta");
		Scanner input = new Scanner(System.in);
		float w=Float.parseFloat(input.next());
		float e=Float.parseFloat(input.next());
		float r=Float.parseFloat(input.next());
		a=w;
		b=e;
		c=r;
	}
	
	public void setdeduction() 
	{
		System.out.println("enter d name of deduction values as lic,pf,hloan,bloan");
		Scanner input = new Scanner(System.in);
		float l=Float.parseFloat(input.next());
		float p=Float.parseFloat(input.next());
		float hl=Float.parseFloat(input.next());
		float bl=Float.parseFloat(input.next());
		lic=l;pf=p;hloan=hl;bloan=bl;
	}
	
	public String getname() {
		return name;
	}
	
	public  float gethra() {
		hra=basic*a/100;
		return hra;
	}
	
	public  float getba() {
		ba=basic*b/100;
		return ba;
	}
	
	public  float getta() {
		ta=basic*c/100;
		return ta;
	}
	public float gross() {
		grosssalary=basic+gethra()+getba()+getta();
		System.out.println("grosslalary is =" + grosssalary);
		return grosssalary;
		
	}
	

	public float netvalue() {
		net=lic+pf+hloan+bloan;
	nets=grosssalary-net;
	System.out.println("overall net salary is =" + nets);
	return nets;
	}
	
	
		
}
