import java.util.*;
class palindromeChecker{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to check if it is a palindrome:");
        String original = sc.nextLine();
        String cleaned = original.replaceAll("[^a-zA-Z]","").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if(cleaned.equals(reversed))
        {
            System.out.println("The String is Palindrome");
        }
        else
        {
            System.out.println("The String is not a Palindrome");
        }
        sc.close();
    } 
}