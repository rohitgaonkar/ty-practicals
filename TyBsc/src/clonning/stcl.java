package clonning;

public class stcl {

	public static void main(String[] args) {
		try{student s1=new student(1,"rohit");
		student s2=new student(2,"robert downey jr");
		student s3=(student)s1.Clone();
		s2.display();
		s1.display();
		s3.display();
		student s4;
		s4=s1;
		System.gc();
		s4.display();
		s1=null;
		s4=null;
		System.gc();
		
		
		}
		catch(CloneNotSupportedException c)
		{
			System.out.println("are error yeylo");
		}
	}

}
