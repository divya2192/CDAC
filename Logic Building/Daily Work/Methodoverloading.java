class PersonOverloading
{
	String name;
	String address;
	
	PersonOverloading(){}
		PersonOverloading(String a, String b){
			name=a;
			address=b;
		}
	
	// should have diff parameters for overloading
	void showDate()
	{
		System.out.println("Name of Person :" + name);
		System.out.println("Address of Person :" + address);
	}
	
	String showData(String a){
		System.out.println("Parameter value :" + a);
		System.out.println("Name of PErson :" + name);
		
		return a;  // return only 1 value
		
	}
	
	/*String showData(String a){
		System.out.println("Parameter value :" + a);
		System.out.println("Name of PErson :" + name);
		
		return a;
		
	}*/