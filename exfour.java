package lab2;
import java.util.Scanner;

public class exfour {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the First Natural Number");
		int a =s.nextInt();
		System.out.println(" Enter the Second Natural number");
		int b = s.nextInt();
		if((a>0)&&(b>0))
		{
			int r = a+b;
			System.out.println(" The sum of the given natural number is "+ r);
		}
		else if((a>0)&&(b<=0))
			System.out.println(b + " is not a natural number, RETRY!");
		else if((a<=0)&&(b>0))
			System.out.println(a + " is not a natural number, RETRY!");
		else
			System.out.println("Both A and B are not natural number, RETRY!");
	}

}
