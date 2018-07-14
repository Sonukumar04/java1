public class Null{

    static void print(){
        System.out.println("Null");
    }

    static void print(int a){
               System.out.println("Integer-"+a);
    }

    static void print(float a){
               System.out.println("Float-"+a);
    }

    public static void main(String args[]){

        int a=1;
        float b=1;

        Null.print();
        Null.print(b);
        Null.print(a);

    }



}