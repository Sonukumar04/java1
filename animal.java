public class Animal {
   String breed;
   String color;

   void Speak(){
       System.out.println("Animal Speak !!");
   }


   public static void main(String args[])
   {
       Animal obj1=new Animal();
       Dog obj2=new Dog();
       Cat obj3=new Cat();

       obj1.Speak();
       obj2.Speak();
       obj3.Speak();
   }

}

     class Dog extends Animal{
                 String breed;
                 String color;

                 void Speak(){
                     System.out.println("Bark !!");
                 }
              }

     class Cat extends Animal{
                 String breed;
                 String color;

                 void Speak(){
                     System.out.println("Meow !!");
                 }
              }