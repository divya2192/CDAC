class PreIncrementPostDecrement{
    public static void main(String args[]) {
        int x = 3;
        int y = 7;

        int exp = y-- + ++x * x--;

        System.out.println("Result: " + exp);
        System.out.println("Value of x after expression: " + x);
        System.out.println("Value of y after expression: " + y);
    }
}
/*Output: Result: 23
Value of x after expression: 3
Value of y after expression: 6
*/
