class Student3{

int id;
String name;
String address;
float marks;
static String iName;

{
	id =1;
	System.out.println("Inside INIT"); //executed for every obj
}

static{
	System.out.println("Inside static");  //only executed once
}
Student3(){
	id =2;
	System.out.println("Inside constructor"); //executed for every obj
}

}
class StudentDemo3{
	public static void main(String args[]){
		Student3 obj1= new Student 3();
		Student3 obj2= new Student 3();
		Student3 obj3= new Student 3();
	}
}