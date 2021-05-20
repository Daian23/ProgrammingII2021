import java.util.Scanner;

public class B_VectorUserPass {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        //Array literal
        String [] vectorUser = new String [] {"Daiana","Facundo","Osvaldo","Melina"};
        String [] vectorPass = new String [] {"1234","4321","1122","3344"};
        String user;
        String password;
        String passwordNew;
        int changeP;
        boolean flag=false;


        System.out.println("***************************************");
        System.out.println("LOGUIN"                        );
        System.out.print("Usuario:");
        user = input.nextLine();
        System.out.print("Contraseña:");
        password  = input.nextLine();
        System.out.println("***************************************");

        for(int i=0;i<=3;i++){
            if(user.equals(vectorUser[i]) && password.equals(vectorPass[i]))
            {
                flag=true;
            }
        }

        if(flag==false) {
            System.out.println("Acceso Denegado!");
            System.out.println("Contraseña y/o Usuario incorrecto");
        }

        if(flag)
        {
            System.out.println("Bienvenido/a " + user + "!");
            System.out.println("Desea cambiar su contraseña?");
            System.out.println("1-Si!");
            System.out.println("2- No!");
            System.out.println("**************************************");

            changeP = input.nextInt();
            input.nextLine();

            if (changeP == 1)
            {
                System.out.println("Ingresar contraseña nueva!");
                passwordNew = input.nextLine();

                password = passwordNew;

                System.out.println("Contraseña nueva: " + password);
                System.out.println("Proceso exitoso!");
            }
            else if (changeP == 2)
            {
                System.out.println("En otro momento será! ;)");
            }
            else {
                System.out.println("Opción no valida. Ingrese nuevamente");
            }
        }
    }
}
