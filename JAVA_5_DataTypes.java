import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if( x>= -Math.pow(2, 16)/2 && x <= Math.pow(2, 16)/2 - 1) // divide by 2 because it's signed binary
                    System.out.println("* short");
                if( x>= -Math.pow(2, 32)/2 && x <= Math.pow(2, 32)/2 - 1)
                    System.out.println("* int");
                if( x>= -Math.pow(2, 64)/2 && x <= Math.pow(2, 64)/2 - 1)
                    System.out.println("* long");
                    
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



