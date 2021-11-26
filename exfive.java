package lab2;
import java.util.Scanner;

public class exfive {
public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a number greater than 0 ");
	int a = s.nextInt();
	int i,f=1;
	if(a>0)
	{
		for(i=1;i<=a;i++)
			f=f*i;
		System.out.println("Factorial of "+a+" is "+f);
	}
	else
		System.out.println("The number should be greater than 0");
}
}
