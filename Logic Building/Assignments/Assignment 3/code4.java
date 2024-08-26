//Write a program to reverse the digits of the number 1234. The output should be 4321.
class ReverseNumber{
	public static void main(String args[]){
		int n=1234;
		int reverse=0;
		while(n>0){  					//1234			 123		12			1
		int remainder= n%10; 			//1234%10 = 4    123%10=3	12%10=2		1%10=1
		reverse= reverse* 10+ remainder;// 4			 0*10+3=3	0*10+2=2	0*10+1=1
		n/=10;							//123			 12			1			0
		
		}
		System.out.println(reverse);
	}
}

Output: 4321