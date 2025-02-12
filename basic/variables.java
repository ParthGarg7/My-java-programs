// variables are memory containers which are used to store and use data
// variables can be of different type 
// variable type tell how much memory it will take and which type of data can be stored in that variable

public class variables {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        String name = "Vir hanuman"; // S must be in uppercase

        System.out.println("a"); // this will not print the value of the variable
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        a = b; // values of the variable can be changed
        System.out.println(a);
    }
}

/*
 * output -
 * a
 * 10
 * 50
 * Vir hanuman
 * 50
 */