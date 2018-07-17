interface Animals{
void speak();
void eat();
}
class Dog implements Animals{
public void speak() {
System.out.println("dogs - bark- bark.");
}
public void eat() {
System.out.println(" dogs eat pedigree");
}
 }
class Cat implements Animals{
public void speak() {
System.out.println("cats- meow meow");
	}
public void eat() {
System.out.println(" cats eat fish.");
}
 } 
public class animals1 {
public static void main(String args[]) {
    Dog d=new Dog();
     d.speak();
      d.eat();
      Cat c=new Cat();
      c.speak();
      c.eat();
}
}