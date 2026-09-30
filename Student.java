class Student {
int rollno;
String name;
void display() {
System.out.println("Roll Number:" +rollno);
System.out.println("Name:" +name);
}
}
class ClassObjectDemo {
public static void main(String[] args) {
Student s1 = new Student();
s1.rollno = 101;
s1.name = "Shannu";
s1.display();
}
}