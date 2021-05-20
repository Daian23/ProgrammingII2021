import java.util.Scanner;

public class B_ChoseVectorValues {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int [] vectorInt = new int [5];
        int valueI;

        System.out.println("*****************************************************");
        System.out.println("Programa: No almacena en el vector múltiplos de 7!");
        System.out.println("*****************************************************");
        System.out.println("Almacene 5 valores enteros al vector");

        for (int i=0;i<vectorInt.length;i++){

            System.out.print("["+i+"] = ");
            valueI=input.nextInt();

            if(valueI%7!=0) {
                vectorInt[i] = valueI;
            }else{
                System.out.println("¡No permitido! Valor múltiplo de 7. Ingrese otro valor");
                i=i-1;
            }
        }

        System.out.println("------------------------------");

        for (int i=0;i<vectorInt.length;i++){
            System.out.println("["+i+"] = "+vectorInt[i]);
        }
    }
}
