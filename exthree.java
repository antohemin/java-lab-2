package lab2;
import java.util.Scanner;

public class exthree {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the character to be checked ");
		char a = s.next().charAt(0);
		int b = (char)a;
		if(((b>=65)&&(b<=90))||((b>=97)&&(b<=122)))
			System.out.println(a + " is an alphabet ");
		else
			System.out.println(a + " is not an alphabet");
	}

}
