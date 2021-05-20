import java.util.Scanner;

public class G_Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userPr = "Enzo";
        String passwordPr = "4321";
        String user;
        String password;
        System.out.println("Ingresar Usuario(con Mayús)");
        user = input.nextLine();
        System.out.println("Ingresar Contraseña");
        password = input.nextLine();

        if (user.equals(userPr) && password.equals(passwordPr)) {
            System.out.println("******************************");
            System.out.println("Usuario y Contraseña Correctos");
            System.out.println("******************************");
        } else {
            System.out.println("********************************");
            System.out.println("ERROR! Usuario o Contraseña Incorrectos");
            System.out.println("********************************");
        }

    }
}
