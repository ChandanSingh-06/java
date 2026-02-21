import java.util.*;
public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int next=n+1;
        int sqrt=(int)Math.sqrt(next);
    
    if(sqrt*sqrt==next){
        System.out.println("Sunny Number");
    }
    else{
        System.out.println("Not Sunny Number");
    }
    sc.close();
    }
}

