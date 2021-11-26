package lab2;
import java.util.Scanner;

public class extwo {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year to be checked");
		int a = s.nextInt();
		if(a%4==0)
			System.out.println(a + " is leap year");
		else 
			System.out.println(a + " is not a leap year");
	}

}
