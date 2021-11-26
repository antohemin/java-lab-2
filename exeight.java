package lab2;
import java.util.Scanner;
public class exeight {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Printing from A to Z ");
		int i;
		for (i=65;i<=90;i++)
		{
			char ch = (char)i;
			System.out.print(ch + " ");
		}
	}

}
