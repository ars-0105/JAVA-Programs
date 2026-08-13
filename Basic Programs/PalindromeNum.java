import java.util.Scanner;
class PalindromeNum{
    static int check(int n){
        int r=0;
        int digit;
        for(int i=n; i>0; i=i/10){
            digit= i%10;
            r= r*10 +digit;
        }
        return r;
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int a= sc.nextInt();
        if(a==check(a)){
            System.out.print(a+" is a Palindrome");
        }else{
            System.out.print(a+ " is not a Palindrome");
        }
        sc.close();
    }

}