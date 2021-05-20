import java.util.Scanner;

public class View {

    public static void showData(Citizen cit){
        System.out.println("");
        System.out.println("   Nombre: " + cit.getName());
        System.out.println(" Apellido: " + cit.getSurname());
        System.out.println("Provincia: " + cit.getProvince());
        System.out.println("    D.N.I: " + cit.getDocument());

    }

    public static Citizen receivingData(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su Nombre");
        String nam = input.nextLine();

        System.out.println("Ingrese su Apellido");
        String surn = input.nextLine();

        System.out.println("Ingrese su provincia de residencia");
        String prov = input.nextLine();

        System.out.println("Ingrese su documento");
        long docu = input.nextLong();
        input.nextLine();


        Citizen citizen1 = new Citizen(nam, surn, prov, docu);

        return citizen1;
    }
}
