class Laptop{
	int memory=;
	String modelName;
	String Processor;
	String os;
	float price;  //instance variable
	
	Laptop{    //zero parameter
	int memory=8;
	String modelName="HP";
	String Processor="i5";
	String os="windows";
	float price=60000.0f;
	
	Laptop(int a, String b){
		memory = a;
		modelName = b;
	}
	
	Laptop(int a, String b, String c, String d, float e){
		memory = a;
		modelName = b;
		Processor = c;
		os= d;
		price = e;
	}
}

public class Demo3{
	public static void main(String args[]){
		int a =10;
		
		Laptop laptopObj1 =new Laptop();
		Laptop laptopObj2 =new Laptop(4,"Dell","17","Win",50000.0f);
		Laptop laptopObj3 =new Laptop(16,"Asus");
		
	}
}