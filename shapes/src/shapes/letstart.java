package shapes;
import java.util.Scanner;
public class letstart {

	public static void main(String[] args) {
		String k;
		Scanner input = new Scanner(System.in);

		while( k =="y")
		{
		System.out.println("select 1:circle/n 2:square/n 3:rectangle\n");
		int srt = input.nextInt();
		switch(srt) {
		
		case 1:
			circle c = new circle();
			break;
		case 2:
			square s = new square();
			break;
		case 3:
			ractangle r = new ractangle();
			break;
		}
		System.out.println("do u want to continue ? y/n");
		String k = input.next();
		
	}

	}
}
