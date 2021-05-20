import java.util.Scanner;

public class D_NotMultiples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int numA;
        System.out.println("Ingrese un número");
        num1 = input.nextInt();
        System.out.println("Ingrese otro número");
        num2 = input.nextInt();

        if (num1 > num2) {
            numA = num1;
            num1 = num2;
            num2 = numA;
        }

        System.out.println("Imprimiendo...");

        for(int i = num1; i <= num2; ++i) {
            if (i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
