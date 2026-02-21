import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int sq=n*n;
        int t=sq;
        while(t>0){
            int digit=t%10;
            t/=10;
            sum+=digit;
        }
        if(n==sum){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
    
}
