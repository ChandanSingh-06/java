import java.util.*;
public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        String str=sc.nextLine();
        boolean isDuck=true;
        if(str.charAt(0)=='0'){
            isDuck=false;
        }else{
            for(int i=1;i<=str.length();i++){
                if(str.charAt(i)=='0'){
                    isDuck=true;
                    break;
                }
            }
        }
        if(isDuck){
            System.out.println("Yes its Duck Number");
        }else{
            System.out.println("Not Duck Number");
        }
        sc.close();

    }
    
}
