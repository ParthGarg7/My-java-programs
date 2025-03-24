package q;

import p.A;

 public class B{
    public static void main(String[] args) {
        
        A obj1 = new A();
        obj1.M1(); // public method can be accessed anywhere       
        child1 obj2 = new child1();
        obj2.M3(); // only trusted class can access protected method

        obj1.M5(); // default methods can be only accessed in the same package
        obj1.M6(); // private method can be only accesses in same class
        
    }
 }

 class child1 extends A{
      @Override
      public void M3(){ // needs to be public or protected to be over ridden 
        super.M3();
      }
 }

