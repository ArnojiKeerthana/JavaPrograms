class Animal {
void eat() {
System.out.println(" animal is eating");
}
}
class Dog extends Animal {
void bark() {
System.out.println(" dog is barking");
}
}
class Puppy extends Dog {
void weep() {
System.out.println(" puppy is weeping");
}
}
class Cat extends Animal {
void meow() {
System.out.println(" cat says meow");
}
}
class InheritanceDemo {
public static void main(String args[]) {
System.out.println(" single inheritance:");
Dog d = new Dog();
d.eat();
d.bark();
System.out.println("\n multiple inheritance:");
Puppy p = new Puppy();
p.eat();
p.bark();
p.weep();
System.out.println("\n Hierarchical inheritance:");
Cat c = new Cat();
c.eat();
c.meow();
}
}