/*
 * Primitive data type in java are
 * 1 int     - used for storing integers value        ex - 6 , 77 ,4567.
 * 2 char    - used for storing single characters     ex - 'a','b','&' .
 * 3 float   - used for storing small decimal values  ex - 6.78,4.5 .
 * 4 double  - used for storing large decimal values  ex - 3.456784567 .  
 * 5 boolean - it can store only 2 values true or false
 * 6 long    - used to store large integers values
 * 7 short   - used to store small integers values
 * 8 byte    - can store from -128 to 127 
 */

public class Datatype {
    public static void main(String[] args) {
        int v1 = 10;
        System.out.println(v1);
        // 1 int variable take 4 byte data in memory
        // range -2147483648 to 2147483647
        char v2 = 'a'; // char var = 'ab' will be an error and "a" will also be an error
        System.out.println(v2);
        // 1 char variable take 2 byte data in memory

        float v3 = 4.5f; // f or F must be added in the last of the float values
        System.out.println(v3);
        // 1 float variable take 4 byte data in memory
        // range 1.40239846e-45f to 3.40282347e+38f
        double v4 = 6.567;
        System.out.println(v4);
        // 1 double variable take 8 byte data in memory
        // range 4.94065645841246544e-324 to 1.79769313486231570e+308
        boolean v5 = true;
        System.out.println(v5);
        // 1 boolean variable take 1 byte data in memory
        // range either true or false
        byte v6 = 127;
        System.out.println(v6);
        // 1 byte variable take 1 byte data in memory
        // range -128 to 127
        short v7 = 56;
        System.out.println(v7);
        // 1 short variable take 2 byte data in memory
        // -32768 to 32767
        long v8 = 5678;
        System.out.println(v8);
        // 1 long variable take 8 byte data in memory
        // range -9223372036854775808 to 9223372036854775807
    }
}

/*
 * Non primitive data type in java are
 * 1 Array
 * 2 String
 * 3 Object
 * 4 Class
 * 5 Interface
 */