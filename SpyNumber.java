import java.util.*;
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        int product=1;
        while(t>0){
            int digit=t%10;
            t/=10;
            sum+=digit;
            product*=digit;
        }
        if(sum==product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
        sc.close();
    }
}
