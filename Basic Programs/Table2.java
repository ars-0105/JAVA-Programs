import java.util.Scanner;
class Table2{
    void print(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num +" x "+ i +" = "+ (i*num));
        }
    }

public static void main(String [] args) {
    System.out.println("Enter number to print the table for:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    Table2 s= new Table2 ();
    s.print(a);
    sc.close();   
 }
}
