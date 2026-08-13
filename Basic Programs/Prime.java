import java.util.Scanner;
class Prime{
    static void check(int n){
        boolean isprime=true;
        if(n<=1){
            System.out.print(n +" is not a prime number");
        }else{
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    isprime=false;
                    break;
            }
            }    
        if(isprime==false){
            System.out.print(n +" is not a prime number");
            }else{
            System.out.print(n +" is prime number");
            }
    }
}
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int num= sc.nextInt();
        check(num);
        sc.close();
    }

}
