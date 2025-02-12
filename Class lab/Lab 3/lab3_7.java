public class lab3_7
{
    public static void main(String[] args)
    {
         for(int i = 1 ; i < 6 ; i++)
         {
            for(int j = 0 ; j < 2*i - 1 ; j++)
            {
               if(i % 2 == 1)
               System.out.print("?");
               else
                System.out.print("#");
            }
            System.out.println();
         }
    }
}