package javaCode;
import java.util.Scanner;
public class topic2 {
    static void main() {
        System.out.println("This tell which digit is Largest among 3 ");
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter your first digit : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second digit : ");
        int num2 = sc.nextInt();
        System.out.print("Enter your first digit : ");
        int num3 = sc.nextInt();

        int largest = biggestOfThree(num1 , num2 , num3);

        System.out.println(largest + "  it is largest number.");
    }

    static int biggestOfThree(int x , int y , int z){
        if (x > y && x > z) return x ;
        else if (y > x && y > z) {
          return y ;
        }
        else
            return z ;
    }
}
