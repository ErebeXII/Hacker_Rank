import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n, d, i, j, x, y, q;
        
        ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
    
        n = sc.nextInt();
        
        for(i = 0; i < n; i++){
            d = sc.nextInt();
            table.add(new ArrayList<Integer>());
            
            for(j = 0; j < d; j++){
                table.get(i).add(sc.nextInt());
            }
                
                            
        }
        
        q = sc.nextInt();
        
        for(i = 0; i < q; i++){
            x = sc.nextInt() - 1;

            y = sc.nextInt() - 1;                
             
            if(x < table.size())
                if(y < table.get(x).size())
                    System.out.println(table.get(x).get(y).toString());
                else
                    System.out.println("ERROR!");
            else
                System.out.println("ERROR!");
        }
    }
}
