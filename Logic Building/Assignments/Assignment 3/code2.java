//Write a program to compute the factorial of the number 10. 

class Factorial{
	public static void main(String args[]){
		int n=10;
		int fact=1;
		for(int i=n; i>0;i--){
			fact*=i;
		}
		System.out.println(fact);
	}
	
}

//Output: 3628800