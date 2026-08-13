import java.util.Scanner;
class Hello{
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        System.out.println("num 1:");
        Scanner a = new Scanner(System.in);
        double num1 = a.nextDouble();
        System.out.println("num 2:");
        double num2 = a.nextDouble();
        double sum = num1 + num2;
        System.out.println("sum:" + sum);
        a.close();
        
    }
}