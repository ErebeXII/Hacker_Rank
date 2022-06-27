import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] s_split = s.split("[ !,?._'@]"); //split will split the string for any character in []
        
        
        int nb_empty = 0;
        
        for(String ss: s_split)
            if(ss.length() == 0)
                nb_empty++;
        
        System.out.println(s_split.length - nb_empty);
        
        for(String ss: s_split)
            if(ss.length() != 0)
                System.out.println(ss);
        
        scan.close();
    }
}

