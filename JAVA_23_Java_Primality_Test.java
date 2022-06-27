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

        String n = bufferedReader.readLine();

        bufferedReader.close();
        
        BigInteger nb = new BigInteger(n);
        
        if(nb.isProbablePrime(10)) // 10 is the certainty, it means that we have a probability of nb to be prime of (1 - 1/2^(10)), if 0 it won't work on                                      //big numbers, so the higher the certainty the best probability. Here the probability ~ 0.9990234375
            System.out.println("prime");
        else
            System.out.println("not prime");        
        
    }
    
}
