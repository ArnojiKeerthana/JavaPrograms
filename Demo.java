class Demo {
int a, b;
Demo() {
a = 10;
b = 20;
System.out.println("Default Constructor");
}
Demo (int x, int y) {
a = x;
b = y;
System.out.println("Parameterized Constructor");
}
void add() {
System.out.println("Sum=" +(a+b));
}
void add(int x, int y) {
System.out.println("sum=" +(x+y));
}
}
class OverloadingDemo {
public static void main(String args[]) {
Demo d1 = new Demo();
d1.add();
Demo d2 = new Demo(30, 40);
d2.add();
d2.add(50, 60);
}
}