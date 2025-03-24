

   public class finalcode{
    public static void main(String[] args){
       Circle c1 = new Circle();
       c1.calculateArea(5.0);
    }
   }


    class MathConstants{

       final  double PI_value = 3.14159;

       public MathConstants(){
       }

       final public void displayPI(){
        System.out.println("The value of pi in this program is " + PI_value);
       }
         
    }

    class Circle extends MathConstants{

       public void calculateArea(double radius){
        double area = PI_value * radius * radius;
         System.out.println("The area of the circle of the radius " + radius + " is " + area );   
       }

    }

    class A {
        final int x = 10;  // Must be initialized, cannot change later
        
        final int y;  // Can be assigned in constructor
        A() {
            y = 20;
        }
        
        void changeValue() {
            // x = 50;  //  ERROR: Cannot modify a final variable
            // y = 30;  // ERROR: Cannot modify a final variable
        }

        final void show() {
            System.out.println("Final method in A");
        }
    }

    /* 
    class B extends A {
        // ERROR: Cannot override final method
        void show() {  // Compilation error!
            System.out.println("Trying to override");
        }
    }

    */