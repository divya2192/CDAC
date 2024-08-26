//Write a program to find and print the largest digit in the number 4825. 
class LargestFromDigit{
	public static void main(String args[]){
		int num=4825;
		int max=0;
		int reverse=0;
		while(num>0){
			int digit= num%10;//last digit //5     2    8   4
			if(digit>max){              
				max=digit;				  //max=5  5    8	8
			}
			num/=10;//remove last digit   //482    48   4
		}	
		System.out.println(max);
		
	}
}

//Output: 8