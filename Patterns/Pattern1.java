public class Pattern1 {
    public static void main(String[] args) {
        int num = 5;
        pattern(num);
    }

    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
