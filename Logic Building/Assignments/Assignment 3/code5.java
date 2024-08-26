//Write a program to print the Fibonacci sequence up to the number 21. 
//0 1 1 2 3 5 8 13 21
class Fibonacci{
	public static void main(String args[]){
		
		int fib;
		int fib1=0;
		int fib2=1;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i=2;i<=21;i++){
			fib= fib1 + fib2;
			fib1=fib2;
			fib2=fib;
			System.out.println(fib);
		}
	}
}

/*Output:
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
987
1597
2584
4181
6765
10946
*/