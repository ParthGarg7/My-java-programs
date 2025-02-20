public class inheritance{
    public static void main(String[] args) {
       C obj = new C();
       System.out.println("a = " + obj.a + " b = " + obj.b);
       obj.C_display();
    }
}



class A {
    int a = 1, b = 2;

    A(){
        System.out.println("Class A"); 
    }

}

class B extends A{
    int a = 3 , b = 4;

    B(){
      System.out.println("Class B"); 
    }

    void B_display(){
     System.out.println("a = " + super.a + " b = " + super.b);
    }      
}

class C extends B{
    int a = 5 , b = 6;

    C(){
      System.out.println("Class C"); 
    }

    void C_display(){
     System.out.println("a = " + super.a + " b = " + super.b);
     super.B_display();
    }      

    void B_display(){
     System.out.println("a = " + super.a + " b = " + super.b);
    }    

}



