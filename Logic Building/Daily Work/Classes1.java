class Laptop{
	int memory;
	String modelName;
	String Processor;
	String os;
	float price;  //instance variable
	
	void clickPhoto(){
		System.out.println("inside ClickPhoto");
	}
	
	String typeNotepad(){
		retrun "Return from typeNotepad()";
	}
	
	void sound(){
		System.out.println("inside sound()");
	}
}

public class DemoClass{
	public static void main(String args[]){
		int a=10;  //primitive dt   //local variable
		//user defined
		Laptop laptopObjobj= new Laptop();
		//classN
		//laptopObj= ref of obj
		//new = keyword used to allocate memory
		//laptop();
		
		
		LaptopObj.sound();
		String s = laptopObj.typeNotepad();
		System.out.println(laptopObj.typeNotepad());
	}
}