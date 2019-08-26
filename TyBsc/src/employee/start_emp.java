package employee;
import java.util.Scanner;

public class start_emp {

	public static void main(String[] args) {
		empsalary.setediction();
		Scanner input = new Scanner(System.in);
		System.out.println("enter d name of emp");
		String name = input.next();
		System.out.println("enter d basic salary of emp");
		float basic=Float.parseFloat(input.next());
		
		empsalary e = new empsalary(name,basic); 
		e.setdeduction();
		e.gross();
		e.netvalue();
		
	}

}
