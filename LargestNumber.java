import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = input.nextInt();

        if (num1 == num2)
        {
            if (num1 == num3)
            {
                System.out.println("All numbers are equal.");
            }
            else if (num1 > num3)
            {
                System.out.println("Largest Number: " + num1);
            }
            else
            {
                System.out.println("Largest Number: " + num3);
            }
        }
        else if (num1 > num2)
        {
            if (num1 > num3)
            {
                System.out.println("Largest Number: " + num1);
            }
            else if (num1 == num3)
            {
                System.out.println("Largest Number: " + num1);
            }
            else
            {
                System.out.println("Largest Number: " + num3);
            }
        }
        else if (num2 > num1)
        {
            if (num2 > num3)
            {
                System.out.println("Largest Number: " + num2);
            }
            else if (num2 == num3)
            {
                System.out.println("Largest Number: " + num2);
            }
            else
            {
                System.out.println("Largest Number: " + num3);
            }
        }
        else
        {
            System.out.println();
        }
    }
}
