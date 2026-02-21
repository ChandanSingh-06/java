import java.util.*;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int degree=0;
        while(t>0){
            int digit=t%10;
            t/=10;
            degree++;
        }
        int sum=0;
        int t2=n;
        while(t2>0){
            int digit=t2%10;
            t2/=10;
            sum+=Math.pow(digit,degree);
        }
        if(sum==n){
            System.out.println("ArmStrong Number");
        }
        else{
            System.out.println("Not ArmStrong Number");
        }
        sc.close();
    }
    
}
