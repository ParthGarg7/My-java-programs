public class lab2_3 {
    public static void main(String[] args) {

        // Parse command-line arguments
        int num1 = Integer.parseInt(args[0]);
        char symbol = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);

        if (symbol == '+') 
            System.out.println(num1 + " + " + num2 + " is " + (num1+num2));
        else if (symbol == '-')
            System.out.println(num1 + " - " + num2 + " is " + (num1-num2));
        else if (symbol == '*')
            System.out.println(num1 + " * " + num2 + " is " + (num1*num2));
        else
            System.out.println("Not a valid operation");
    }
}
