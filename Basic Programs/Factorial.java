import java.util.Scanner;

class Factorial{
    static int fact(int n){
        int result=1;
        for (int i=2; i<=n; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String [] args){
        System.out.print("Enter number to calculate Factorial: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.print("Factorial = "+ fact(num));
        sc.close();
    }
}