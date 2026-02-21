import java.util.*;
public class NivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        while(t>0){
            int digit=t%10;
            t/=10;
            sum=sum+digit;
        }
        if(n%sum==0){
            System.out.println("Yes Niven Number");
        }else{
            System.out.println("Not Niven Number");
        }
    }
    
}
