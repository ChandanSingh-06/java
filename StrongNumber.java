import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        while(t>0){
            int digit=t%10;
            t/=10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
         }
        if(sum==n){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
        sc.close();
    }
}
