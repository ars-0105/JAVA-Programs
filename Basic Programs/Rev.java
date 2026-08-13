import java.util.Scanner;

class Rev {
    static int reverse(int n){
       int r=0;
       int digit=0;
       for (int i=n; i>0; i=i/10){
        digit =i%10;
        r = r*10 + digit;
       } 
       return r;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to reverse: ");
        int num = sc.nextInt();
        System.out.print("Reversed Number: "+ reverse(num));
        sc.close();
    }
    
}
