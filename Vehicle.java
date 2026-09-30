class Vehicle {
void dispaly() {
System.out.println("This is a Vehicle");
}
}
class Car extends Vehicle {
void dispaly() {
System.out.println("This is a car");
}
}
class MethodOverriding {
public static void main(String args[]) {
Car c= new Car();
c.display();
}
}