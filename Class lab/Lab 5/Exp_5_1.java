public class Exp_5_1{
    public static void main(String[] args) {

       B obj = new B();
       obj.display1();
       //obj.display2();
       obj.display3();
    }
}


class A {
 private int a = 1, b = 2;

    A(){
        System.out.println("Class A"); 
    }

    void displayA(){
     System.out.println("Variables of Class A");
     System.out.println("a = " + a + " b = " + b);
    }      
}





class B extends A{
    int a = 3 , b = 4;

    B(){
      System.out.println("Class B"); 
    }
 
    // This will print the variables of the class B
    void display1(){
     System.out.println("Variables of Class B");
     System.out.println("a = " + a + " b = " + b);
    }   

    void display2(){
     System.out.println("a = " + super.a + " b = " + super.b);
    }    

    void display3(){
       displayA();
    } 

}