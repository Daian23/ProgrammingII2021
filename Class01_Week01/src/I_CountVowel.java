import java.util.Scanner;

public class I_CountVowel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = "";
        int accountant=0;

        System.out.println();
        System.out.println("Ingrese una frase para el conteo vocal");
        System.out.println("Sin tilde por favor :)");
        sentence = input.nextLine();

        for(int i = 0; i < sentence.length(); ++i) {
            if ((sentence.charAt(i)=='a') || (sentence.charAt(i)=='e') || (sentence.charAt(i)=='i') ||
                    (sentence.charAt(i)=='o') || (sentence.charAt(i)=='u'))
            {
                accountant++;
            }
        }

        if (accountant<= 1) {
            System.out.println("***************************************");
            System.out.println("La frase ingresada tiene " + accountant + " vocal");
            System.out.println("***************************************");
        } else {
            System.out.println("*****************************************");
            System.out.println("La frase ingresada tiene " + accountant + " vocales");
            System.out.println("*****************************************");
        }

    }
}
