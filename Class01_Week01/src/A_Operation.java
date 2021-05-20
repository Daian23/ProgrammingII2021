import java.util.Scanner;

public class A_Operation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int result;
        System.out.println("Ingrese el primer número");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = input.nextInt();
        result = num1 + num2;
        System.out.println("La suma de los números es: " + result);
    }
}
