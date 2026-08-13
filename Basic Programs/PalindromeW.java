import java.util.Scanner;
class PalindromeW {
    static String check(String a){
        //to reverse the string 
        String rev="";
        for(int i=a.length()-1; i>=0; i--){
            rev= rev + a.charAt(i);
        }
        return rev;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the word to check: ");
        String word=sc.next();
        if(word.equals(check(word))){
            System.out.print(word +" is a Palindrome");
        }else{
            System.out.print(word + " is not a Palindrome");
        }
        sc.close();
    }
    
}
