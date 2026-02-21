import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int rev=0;
        while(t>0){
            int digit=t%10;
            t/=10;
            rev=rev*10+digit;
        }
        if(n==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrom Number");
        }
        sc.close(); 
    }
}
