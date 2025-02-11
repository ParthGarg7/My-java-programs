public class lab3_4_1
{
    public static void main(String[] args)
    {
        int count = 0;
        for(int i = 2 ;i <= 1000 ; i++)
        {
            if(isNumPrime(i))
            {
                System.out.print(i + " ");
                count += 1;
            }
        }
        System.out.printf("\nThe total number of prime numbers found between 1 to 1000 is %d\n",count);
    }

    static boolean isNumPrime(int num)
    {
         if (num < 2) return false;
         for (int i = 2; i <= Math.sqrt(num); i++)
         {
            if(num % i == 0)
            return false;
         }
         return true;
    }
}