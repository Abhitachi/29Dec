package Recursion;

public class UnderstandRec {
	
	static void firstMethod() {
		secondMethod();
		System.out.println("I am the First Method");
	}
	
	static void secondMethod() {
		ThirdMethod();
		System.out.println("I am the Second Method");
	}
	
	static void ThirdMethod()  {
		fourthMethod();
		System.out.println("I am the Third Method");
	}
	
	static void fourthMethod()  {
		System.out.println("I am the last Method");
	}
	
	
	static void recur(int n) {
		if(n<1) {
			System.out.println(n+"is less than "+n+1);
		}
		else {
			recur(n-1);
			System.out.println(n-1+"Stack frame is popped out");
			System.out.println("control came back to "+n+" th stack frame.");
			System.out.println(n);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMethod();
		recur(5);
		
		
	}

}
