import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        sc.nextLine();
        String[] list = sc.nextLine().split(" ");
        sc.close();
        
        int[] arr = new int[list.length];
        
        for(int i = 0; i < list.length; i++)
            arr[i] = Integer.valueOf(list[i]);
        
        int negative_subs = 0;
        int size = 1;
        int index = 0;
        
        while(size <= arr.length){
            if(index + size <= arr.length){
                if(sumSubs(arr, index, size) < 0)
                    negative_subs++;
                index++;
            }
            else{
                size++;
                index = 0;
            }
        }
        
        
        System.out.println(negative_subs);
    }
    
    public static int sumSubs(int[] arr,int start, int size){
        int sum = 0;
        
        for(int i = start; i < start + size; i++)
            if(i < arr.length)
                sum += arr[i];
        return sum;   
    }
    
}
