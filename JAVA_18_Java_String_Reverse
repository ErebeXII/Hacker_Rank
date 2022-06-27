import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        
        StringBuilder new_st = new StringBuilder();
        
        A = A.toLowerCase(); // not neccessary although it will avoid any Case sensitive checks
        
        for(int i = 0; i < A.length(); i++)
            new_st.append(A.charAt(A.length() - i - 1));
        
        
        if(A.equals(new_st.toString()))
            System.out.println("Yes");
        else
            System.out.println("No");        
    }
    

}



