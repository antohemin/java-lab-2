package lab2;
import java.util.Scanner;
public class exnine {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" To find the number of digits in an integer");
		int a= s.nextInt();
		int i=0;
		while(a>0)
		{
			a=a/10;
			i++;
		}
		System.out.println( "The number of digits = " + i);
	}

}
