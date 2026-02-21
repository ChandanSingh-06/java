import java.util.*;
public class AutomorphicNumber {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int sq=n*n;
         if(sq%(int)Math.pow(10,String.valueOf(n).length())==n){
            System.out.println("Automophic Number");
         }
         else{
            System.out.println("Not Automophic Number");
         }
        sc.close();
        }
    }
    
