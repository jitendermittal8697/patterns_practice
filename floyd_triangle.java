/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
import java.util.*;

class floyd_triangle
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        //int number = input.nextInt();
        int number = 5;        
        int k=1;
        for(int i=1 ; i <= number ; i++) 
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k++ + " ");
            }
            System.out.println();

        }
        input.close();
    }
}