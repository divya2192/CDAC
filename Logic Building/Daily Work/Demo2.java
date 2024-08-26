class Laptop{
	int memory;
	String modelName;
	String Processor;
	String os;
	float price;  //instance variable
	
	void clickPhoto(){
		System.out.println("inside ClickPhoto");
	}
	
	void sound(){
		System.out.println("inside sound()");
	}
}

public class Demo2{
	public static void main(String args[]){
		int a =10;
		
		Laptop laptopObj1 =new Laptop();
		Laptop laptopObj2 =new Laptop();
		Laptop laptopObj3 =new Laptop();
		
		laptopObj1.clickPhoto();
		laptopObj2.clickPhoto();
		laptopObj3.clickPhoto();
		
		System.out.println(laptopObj1.memory + " " + laptopObj2.modelName);
		System.out.println(laptopObj1.modelName);
		System.out.println(laptopObj1.price);
	}
}