import java.util.Scanner;
import java.text.DecimalFormat;
class Cal {
    static double add(double a, double b){
        return a+b;
    }
    static double subtraction(double a, double b){
        return a-b;
    }
    static double multiplication(double a, double b){
        return a*b;
    }
    static double division(double a, double b){
        return a/b;
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        DecimalFormat f= new DecimalFormat("#.##");

        System.out.println("Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division\n");
        
        int c;
        while(true){
            System.out.print("Enter choice: ");
            c= sc.nextInt();
            if(c>=1 && c<=4){
                break;
            }
            System.out.println("\nPlease enter a valid choice!\n");

        }
        System.out.print("Enter first number: ");
        double a=sc.nextDouble();
        System.out.print("Enter second number: ");
        double b= sc.nextDouble();
        switch (c) {
            case 1 -> System.out.println("Addition = " + f.format(add(a,b)));
            case 2 -> System.out.println("Subtraction = " + f.format(subtraction(a,b)));
            case 3 -> System.out.println("Multiplication = " + f.format(multiplication(a,b)));
            case 4 -> {
                if(b==0){
            System.out.print("cannot be divided by zero");
            }else{
            System.out.println("Division = " + f.format(division(a,b)));
            }
        }
    }

     sc.close();
    }
    
}
