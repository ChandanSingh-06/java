import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = sc.next().toUpperCase().charAt(0);

        if(unit == 'F') {
            double f = (temp * 9/5) + 32;
            System.out.println(temp + " C = " + f + " F");
        } else if(unit == 'C') {
            double c = (temp - 32) * 5/9;
            System.out.println(temp + " F = " + c + " C");
        } else {
            System.out.println("Invalid option!");
        }
    }

}
