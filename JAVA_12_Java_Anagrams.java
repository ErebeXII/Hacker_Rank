import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        if(a.length() == b.length()){
            String first = a.toLowerCase();
            String second = b.toLowerCase();
            
            
            int[][] frequencies = new int[26][3];

            for(int i = 0; i < 26; i++){
                frequencies[i][0] =  97 + i; // 97 == a
                frequencies[i][1] = 0;
                frequencies[i][2] = 0;
            }
            
            for(int i = 0; i < a.length(); i++){
                for(int j = 0; j < 26; j++){
                    if((char)(frequencies[j][0]) == first.charAt(i))
                        frequencies[j][1] += 1;
                    if((char)(frequencies[j][0]) == second.charAt(i))
                        frequencies[j][2] += 1;
                }    
            }
            
            for(int i = 0; i < 26; i++)
                if(frequencies[i][1] != frequencies[i][2])
                    return false;
            
            return true;
            
            
        }
        
        return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
