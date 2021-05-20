import java.util.Scanner;

public class C_CountingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int numV;

        System.out.println("Ingrese un número");
        num1 = input.nextInt();
        System.out.println("Ingrese otro número");
        num2 = input.nextInt();

        if (num1 > num2) {
            numV = num1;
            num1 = num2;
            num2 = numV;
        }

        System.out.println("Imprimiendo...");

        for (int i = num1; i <= num2; ++i) {
            System.out.println(i);
        }
    }
}
