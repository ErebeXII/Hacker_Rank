import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j = 1; j <= n; j++)
                System.out.print(calcul(a, b, j) + " ");
            System.out.println();
        }
        in.close();
    }
    

    
    private static String calcul(int a, int b, int n){
        int sum = a;
            
        for( int  i = 0; i < n; i++)
            sum += b * Math.pow(2, i);    
            
        return String.valueOf(sum);
    }
}
