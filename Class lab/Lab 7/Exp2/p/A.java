package p;

 public class A{

      public void M1(){
        System.out.println("Hi from Public method");
      }
      private void M2(){
        System.out.println("Hello form Private method");
      }
      protected void M3(){
        System.out.println("Hallo from Protected method");
      }

      void M4(){
        System.out.println("Hola from default method");
      }

      public void M5(){  // a public method to call to a default method 
        M4();
      }

      public void M6(){  // a public method to call to a private method 
        M2();
      }
 }

