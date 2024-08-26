/*
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/
public class Pattern10{
    public static void main(String[] args){
        int n = 9;
        for(int i = 1; i <= n; i+=2){
            for(int j = 1; j <= i; j+=2){ 
                System.out.print(j); 
                if(j < i) { 
                    System.out.print("*");
                }
            }
            System.out.println(); 
        }
    }
}