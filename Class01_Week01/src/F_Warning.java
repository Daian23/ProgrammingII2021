import java.util.Scanner;

public class F_Warning {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int numA;
        int numMult;
        int oper;

        System.out.println("Ingrese un número");
        num1 = input.nextInt();
        System.out.println("Ingrese otro número");
        num2 = input.nextInt();
        System.out.println("Ingrese un número para saber si se permite su operación");
        numMult = input.nextInt();

        if (num1 > num2) {
            numA = num1;
            num1 = num2;
            num2 = numA;
        }

        oper = num2 - num1;

        if (numMult >= oper) {
            System.out.println("Número no permitido");
            System.out.println("Intentelo de nuevo :)");
        } else {
            System.out.println("Imprimiendo...");

            for(int i = num1; i <= num2; ++i) {
                if (i % numMult != 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
