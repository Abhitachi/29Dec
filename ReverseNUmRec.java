package javatap;
import java.util.Scanner;
public class ReverseNUmRec {
	static int revs=0;
	public static int Reverse(int n)
	{
		if(n==0)
		{
			
			return revs;
			
		}
		if(n>0)
		{
			int temp=n%10;
			revs=revs*10+temp;
			Reverse(n/10);
		}
		return revs;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(Reverse(a));
	}

}
