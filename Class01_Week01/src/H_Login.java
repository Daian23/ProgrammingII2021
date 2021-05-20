import java.util.Scanner;

public class H_Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userPr = "Enzo";
        String passwordPr = "4321";
        String user;
        String password;
        int changeP;
        String passwordNew;

        System.out.println("Ingresar usuario");
        user = input.nextLine();
        System.out.println("Ingresar contraseña");
        password = input.nextLine();

        if (user.equals(userPr) && password.equals(passwordPr)) {
            System.out.println("**************************************");
            System.out.println("Bienvenido " + user + "!");
            System.out.println("Desea cambiar su contraseña?");
            System.out.println("1-Si!");
            System.out.println("2- No!");
            System.out.println("**************************************");
            changeP = input.nextInt();
            input.nextLine();

            if (changeP == 1) {
                System.out.println("Ingresar contraseña nueva!");
                passwordNew = input.nextLine();
                passwordPr = passwordNew;
                System.out.println("Contraseña nueva: " + passwordPr);
                System.out.println("Proceso exitoso!");
            } else {
                System.out.println("En otro momento será!");
            }
        } else {
            System.out.println("***************************************");
            System.out.println("ERROR! Usuario o Contraseña Incorrectos");
            System.out.println("***************************************");
        }
    }
}
