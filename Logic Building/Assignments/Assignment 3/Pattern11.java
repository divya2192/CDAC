/*
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
*/
public class Pattern11{
    public static void main(String[] args){
        int n = 9;
		for(int i = n; i >= 1; i-=2){ 
            for (int j = n; j >= i; j--){ 
                System.out.print(" "); 
            } 
            for (int j = 1; j <= i; j++){ 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
		
		for (int i = 3; i <= n; i+=2){ 
            for (int j = n; j >= i; j--){ 
                System.out.print(" "); 
            } 
            for (int j = 1; j <= i; j++){ 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
    }
}