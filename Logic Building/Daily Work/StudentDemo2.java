class Student{
int id;
String name;
String address;
float marks;
static String iName="CDAC Mumbai";

Student(){}
Student (int id){
this.id=id;
}

Student(int a, String b, String c, float d){
id=a;
name=b;
address=c;
marks= d;
}


void display(){
System.out.println("Student Details"+ id);
System.out.println("Student Details"+ iName);
}

static void print(){
System.out.println("Student Details"+ id);
System.out.println("Student Details"+ iName);
}

}
class StudentDemo2{
public static void main(String[] srgs){
Student obj1 = new Student();
Student obj2 = new Student(1);
obj1.display();
obj2.display();
}
}