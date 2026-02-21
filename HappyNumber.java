import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        int digit;
        // boolean HappyNumber=true;
        // boolean UnHappyNumber=false;
        while(n!=1 && n==4){
        int sum=0;
        while(n!=0){
            digit=n%10;
            int sq=digit*digit;
            n/=10;
            sum+=sq;
        }
        n=sum;
        }
        if(n==1){
           System.out.println("Happy Number");
        }
        else{
            System.out.println("Unhappy Number");
        }
    }
}
