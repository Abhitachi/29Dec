package javatap;

import java.util.Scanner;

public class AvgRec {

	public static int Avg(int arr[],int n)
    {
        if(n<=0)
        {
            return 0;
        }
        return Avg(arr,n-1)+arr[n-1];

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int avg=Avg(arr,n);
		System.out.println(avg/n);
	}

}
