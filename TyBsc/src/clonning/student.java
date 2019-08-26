package clonning;

public class student implements Cloneable{
	int rollno;
	String name;
	static int count=0; 
	public student(int r, String n) {
		rollno=r;
		name=n;
		count++;
		System.out.println("count=" + count);
	}
	
	@Override
	protected void finalize()
	{
		count--;
		System.out.println("finalize coun");
		System.out.println("count="+ count);
		
	}
	
	protected Object Clone () throws CloneNotSupportedException{
		return super.clone();
	}
	public void display()
	{
		System.out.println("rollno="+ rollno + "\n" + "name=" + name);
		
	}
}
