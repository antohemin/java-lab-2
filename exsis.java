package lab2;
import java.util.Scanner;

public class exsis {
public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	System.out.println("~~~~~MULTIPLICATION TABLE~~~~~");
	System.out.println(" Enter the number to be multiplied   ");
	int a = s.nextInt();
	int i,m=1;
	for(i=1; i<=10;i++)
	{
		m=a*i;
		System.out.println(a + " * "+i+" = " +m );
	
	}
	
}
}
