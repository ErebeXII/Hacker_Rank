import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        int[][] l = new int[6][6];
        for(int i = 0; i < 6; i++)
            for(int j = 0; j < 6; j++)
                l[i][j] = arr.get(i).get(j);
                
        int max = l[0][0] + l[0][1] + l[0][2]
                            +l[1][1]+
                  l[2][0] + l[2][1] + l[2][2] ;
        
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 5; j++){
                if(max < l[i-1][j-1] + l[i-1][j] + l[i-1][j+1] + l[i][j] + l[i+1][j-1] + l[i+1][j] + l[i+1][j+1])
                    max = l[i-1][j-1] + l[i-1][j] + l[i-1][j+1] + l[i][j] + l[i+1][j-1] + l[i+1][j] + l[i+1][j+1];
            }
        }
        System.out.println(max);
    }
    

}
