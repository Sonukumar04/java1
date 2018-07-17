abstract class animals {
	                     String breed,colour,name;
	                      abstract void eat();
	                      void speak() {
		              System.out.println("let's talk!!!");
	  }
        }
class dog extends animals{
dog(String breed,String colour,String name){
this.breed=breed;
this.colour=colour;
this.name=name;
}
void intro() {
System.out.println("Name is: "+name);
System.out.println("Breed is: "+breed);
System.out.println("Colour is: "+colour);
}

 void eat(){
System.out.println("I eat kibbles.");
}
}

public class animals2 {

public static void main(String args[]) {
                              animals x=new dog("Bulldog","red-white","Duke");
	             dog y=new dog("Bulldog","red-white","Duke");
     y.intro();
     x.eat();
     x.speak();
	}

}