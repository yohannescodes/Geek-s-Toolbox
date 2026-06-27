import java.util.Scanner;
import java.util.InputMismatchException;

public class GeeksToolbox{
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        int menu = 0;

        System.out.println("Welcome to Geek's Toolbox");

        do {
            System.out.println("\nMenu");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Decimal to Octal");
            System.out.println("3. Decimal to Hexadecimal");
            System.out.println("4. Binary to Decimal");
            System.out.println("5. Octal to Decimal");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");

            try {
                menu = myObj.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                myObj.next(); // clear the invalid input
                continue;
            }

            if (menu >= 1 && menu <= 3) {
                System.out.print("Enter the decimal number: ");
                int num = 0;
                try {
                    num = myObj.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    myObj.next(); // clear the invalid input
                    continue;
                }
                System.out.print(num + " = ");
                switch(menu){
                    case 1:
                        d2b(num);
                        break;
                    case 2:
                        d2o(num);
                        break;
                    case 3:
                        d2h(num);
                        break;
                }
            } else if (menu == 4) {
                System.out.print("Enter the binary number: ");
                String bin = myObj.next();
                try {
                    int dec = Integer.parseInt(bin, 2);
                    System.out.println(bin + " = " + dec);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid binary number.");
                }
            } else if (menu == 5) {
                System.out.print("Enter the octal number: ");
                String oct = myObj.next();
                try {
                    int dec = Integer.parseInt(oct, 8);
                    System.out.println(oct + " = " + dec);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid octal number.");
                }
            } else if (menu != 6) {
                System.out.println("Invalid option. Please try again.");
            }

        } while (menu != 6);

        System.out.println("Thank you for using Geek's Toolbox!");
    }

    public static void d2b(int dec){
        System.out.print(Integer.toBinaryString(dec));
        System.out.print("\n");
    }
    public static void d2o(int dec){
        System.out.print(Integer.toOctalString(dec));
        System.out.print("\n");
    }
    public static void d2h(int dec){
        System.out.print(Integer.toHexString(dec));
        System.out.print("\n");
    }
}
