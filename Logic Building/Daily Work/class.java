class Laptop{
	int memory;
	String modelName;
	String Processor;
	String os;
	float price;
	
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

public class Demo{
	public static void main(String args[]){
		int a=10;
		Laptop laptopObjobj= new Laptop();
		LaptopObj.sound();
		String s = laptopObj.typeNotepad();
		System.out.println(laptopObj.typeNotepad(););
	}
}