dataType Name;  //declare
dataType Nameme1=10;  //declare and initialize



class Demo{
	public static void main(String args[]){
	byte b=100;
	byte b1=127; //implicit
	byte b=(byte)130;  //explicit
	System.out.println(b);
	
	int a=10;
	byte b2=a; //error
	System.out.println (b2);// error
	
	/* 1 bit
		1 byte= 8 bit
		1 kb=  1024 byte
		1mb= 1024 kb
		1 gb= 1024 mb */
		
	char c= "A";
	System.out.println((int)c);
	System.out.println((char)66);
	
	}
} 