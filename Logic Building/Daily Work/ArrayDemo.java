import java.util.Scanner;
Scanner sc= new Scanner(System.in);

class ArrayDemo{
	Scanner sc=new Scanner(System.in);
	/*sc.nextInt();
	sc.nextFloat();
	sc.next();
	sc.nextLine();
	sc.nextLong();
	
	char c=sc.next().charAt(2);
	*/
}
public static void main(String args[]){
	
	/*
	int arr[]={1,2,3,};
	System.out.println(arr); //hashcode
	System.out.println(arr[0]); //1
	
	float arr1[]={1.0f, 2.0f, 3.0f};
	System.out.println(arr1); // hashcode
	System.out.println(arr1[0]+ " "+ arr[1]+" " +arr[2]);
	*/
	
	int arr[]= new int[3];
	System.out.println(arr[0]);  //default value 0
	System.out.println(arr[1]); //0
	System.out.println(arr[2]); //0
	
	float arr1[] = new float[3];
	System.out.println(arr[0]);  //default value 0.0
	System.out.println(arr[1]); //0.0
	System.out.println(arr[2]); //0.0
	
	//input
	for(int i=0;i<=6;i++){
		System.out.println("Enter" + (i+1) + "st value");
		arr[i]=sc.nextInt();
	}
	//output
	for(int i=0;i<;i++){
		System.out.println(arr[i]);
	}
}