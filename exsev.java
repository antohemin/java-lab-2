package lab2;
import java.util.Scanner;
public class exsev {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int n = s.nextInt();
		int t1=0,t2=1,i,sum;
		for (i=1;i<=n;i++)
		{
			System.out.print(t1 + " ");
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}
	}

}
