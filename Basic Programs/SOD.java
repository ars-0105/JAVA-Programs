import java.util.Scanner;
class SOD {
    int sum(int n){
        int sum=0;
        for (int i=n; i>0; i=i/10){
            sum=sum+(i%10);
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();
        SOD s1= new SOD();
        System.out.print("Sum of digits "+num+" = "+s1.sum(num));
        sc.close();
    }
    
}
