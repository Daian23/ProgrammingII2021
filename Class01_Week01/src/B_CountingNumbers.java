import java.util.Scanner;

public class B_CountingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese un número");
        num1 = input.nextInt();

        System.out.println("Ingrese otro número mayor al anterior");
        num2 = input.nextInt();

        System.out.println("Imprimiendo...");

        for(int i = num1; i <= num2; ++i) {
            System.out.println(i);
        }
    }
}
