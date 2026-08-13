import java.util.Scanner;

class Table {
    public static void main(String []args){
        System.out.println("Enter number to print the table for:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=10;i++){
        System.out.println(a+" X "+ i +" = "+ i*a );    
        }
        sc.close();
    }
    
}
