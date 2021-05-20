import java.util.Scanner;

public class A_VectorStSent {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String [] vectorString = new String [4];

        System.out.println("***************************************");
        System.out.println("Programa: Amacenando String al vector!");
        System.out.println("***************************************");

        System.out.println("Ingrese una oración para almacenar al vector");

        for(int i=0; i<vectorString.length;i++){

            System.out.print("["+i+"] = ");
            vectorString[i]=input.nextLine();
        }

        System.out.println("Imprimiendo..");

        for(int i=0; i<vectorString.length;i++){
            System.out.println("["+i+"] = "+vectorString[i]);
        }
    }
}
