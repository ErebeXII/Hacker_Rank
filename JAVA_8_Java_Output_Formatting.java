import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1 = sc.next();
                int x = sc.nextInt();
                //Complete this line
                String s;
                s = s1 + spaces(15 - s1.length());
                String si = String.valueOf(x);
                if (x < 100)
                    si = "0" + x;
                if(x < 10)
                    si = "00" + x;
                
                System.out.println(s + si);
            }
            System.out.println("================================");

    }
    
    static String spaces(int spaces){
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < spaces; i ++)
            sb.append(" ");
        return sb.toString();
        
    }
        
}



