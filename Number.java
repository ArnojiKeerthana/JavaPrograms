class Number {
int value;
Number(int v) {
value = v;
}
}
class Test {
void increment(Number n) {
n.value = n.value + 10 ;
}
}
class ObjectPassingDemo {
public static void main (String args[]) {
Number obj = new Number (50);
System.out.println(" Value before method call:" + obj.value);
Test t = new Test();
t.increment(obj);
System.out.println("Value after method call:"+obj.value);
}
}
