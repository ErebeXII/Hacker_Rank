import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        
        return next(0, leap, game);
        
    }
    
    private static boolean next(int i, int leap, int[] game){
        if(i >= game.length)
            return true;
            
        while(i + 1 < game.length && game[i + 1] == 0){
            i++;
        }
        
        if(i + 1 >= game.length){
            return true;
        } 
        
        while(i >= 0 && game[i] == 0){
            if(canJump(i, leap, game)){
                if(next(i + leap, leap, game)){
                    return true;
                    }
            }
            i--;
        }
        
        return false;    
    }

    private static boolean canJump(int i, int leap, int[] game){
        if(i + leap >= game.length )
            return true;
        if(game[i + leap] == 0){
            for(int j = i; j < i + leap; j++){
                if(game[j] != 0)
                    return true;
            }
            return false;
            }
        return false;
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
