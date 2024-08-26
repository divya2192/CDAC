//Write a program to calculate the sum of the digits of the number 9876.
class SumOfDigitsOfNumber{
	public static void main(String args[]){
		int num=9876;
		int sum=0;
		
		while(num>0){
			int digit= num%10;  //9876%10=6
			sum+=digit;			//0+6= 6  13  21  30
			num/=10;			//9876/10=987
		}
		 System.out.println(sum);
	}
}

//Output:30