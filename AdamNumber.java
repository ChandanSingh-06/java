import java.util.Scanner;
public class AdamNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int sq=n*n;
        int t=n;
        int revSq=0;
        while(t>0){
            int digit=t%10;
            t/=10;
            rev=rev*10+digit;
             revSq=rev*rev;
        }
        int t2=sq;
        int Sqrev=0;
        while(t2>0){
            int digit2=t2%10;
            t2/=10;
            Sqrev=Sqrev*10+digit2;
        }
        if(revSq==Sqrev){
            System.out.println("Yes Adam Number");
        }
        else{
            System.out.println("Not Adam Number");
        }
        sc.close();
    }
    
}
