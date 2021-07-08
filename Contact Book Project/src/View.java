import java.util.Scanner;
import java.util.InputMismatchException;

public class View {

    public static int menu(){

        int option=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Check an option");
        System.out.println("1. Create contact book");
        System.out.println("2. Add Contact");
        System.out.println("3. List ContactBook");

        try {
             option = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Ha ingresado un valor incorrecto");
        }
        return option;
    }

    public static ContactBook createContactBook(ContactBook ContactBookN){

            Scanner input = new Scanner(System.in);

            System.out.println("1. Create contact book");
            System.out.println("Contact list name ");
            String nameCB = input.nextLine();

            ContactBookN.setName(nameCB);
            System.out.println("---+---+---+---+---+---+---+---+---+");
            System.out.println("Contact Book created successfully!");
            System.out.println("---+---+---+---+---+---+---+---+---+");
           return ContactBookN;

    }

    public static ContactBook addingContact(ContactBook contactB){

            Scanner input = new Scanner(System.in);

            System.out.println("2. Add contact");
            System.out.println("Contact name");
            String nameC = input.nextLine();

            System.out.println("E-mail ");
            String email = input.nextLine();

            System.out.println("Phone number ");
            String numberP = input.nextLine();

            System.out.println("Favorite contact?");
            System.out.println("Y/N");
            String favoriteCont= input.nextLine();

            String conFavoriteC = favoriteCont.toLowerCase();

            Boolean favoriteC = conversion(conFavoriteC);

            Contact contactN = new Contact(nameC,email,numberP,favoriteC);

            //boolean prueba = contactB.isTheContact(contactN);
            //System.out.println(prueba);

            contactB.addContact(contactN);
            System.out.println("Contact added successfully");
            return contactB;

        }
        public static void ListCB(ContactBook cb){
            System.out.println("List the contacts");
            System.out.println(cb);
        }
        public static boolean conversion (String conF){
            boolean yn = false;
            if (conF.equals("y")){
                yn = true;
            }else if(conF.equals("n")){
                yn = false;
            }
            return yn ;
        }

}



