import java.util.Scanner;
class Fibonacci {
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number to calculate Fibonacci: ");
    int num= sc.nextInt();
    System.out.print("Fibonacci("+ num +") = "+ fib(num));
    sc.close();
}    
    
}
