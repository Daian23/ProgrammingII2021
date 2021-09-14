import java.util.Scanner;

public class View {

    static Scanner textScanner = new Scanner(System.in);
    static Scanner intScanner = new Scanner(System.in);

    public static int menu(){

        System.out.println("----------------------------");
        System.out.println("Check an option");
        System.out.println("1. Create contact book");
        System.out.println("2. Add Contact");
        System.out.println("3. Search Contact");
        System.out.println("4. List ContactBooks");
        System.out.println("5. Delete Contact");
        System.out.println("0. Exit");
        System.out.println("----------------------------");

        int option = intScanner.nextInt();
        return option;
    }

    public static ContactBook createContactBook(ContactBook ContactBookN){

        System.out.println("1. Create contact book");
        System.out.println("Contact list name ");
        String nameCB = textScanner.nextLine();

        ContactBookN.setName(nameCB);
        System.out.println("---+---+---+---+---+---+---+---+---+");
        System.out.println("Contact Book created successfully!");
        System.out.println("---+---+---+---+---+---+---+---+---+");

        Contact miContacto = new Contact(nameCB,"","",true);
        ContactBookN.addContact(miContacto);
        return ContactBookN;
    }

    public static Contact addingContact(){

        System.out.println("Contact name");
        String nameC = textScanner.nextLine();

        System.out.println("E-mail ");
        String email = textScanner.nextLine();

        System.out.println("Phone number ");
        String numberP = textScanner.nextLine();

        System.out.println("Favorite contact?");
        System.out.println("Y/N");
        String favoriteCont= textScanner.nextLine();

        String conFavoriteC = favoriteCont.toLowerCase();

        Boolean favoriteC = conversion(conFavoriteC);

        Contact contactN = new Contact(nameC,email,numberP,favoriteC);

        return contactN;
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

    //--- Agregado---

    public static boolean isTheContact(ContactBook extraidoCB, Contact contactBk ){
        boolean flag = false;
        for(int i=0;i<extraidoCB.getLength();i++){

            if(extraidoCB.contactx.get(i).getMobil().equals(contactBk.getMobil())){
                flag = true;
            }
        }
        return flag;
    }

    public static void listContainer(CBContainer cBC) {
        System.out.println("|<--- Listing Contact Books --->|");
        for(int i=0 ; i<cBC.getLength() ; i++) {
            System.out.println(cBC.getContacBook(i));
        }
    }

    public static void searchContact(CBContainer cBC) {

        System.out.print("Searcher: ");
        String name = textScanner.nextLine();
        String subC = name.substring(0,3);

        System.out.println("------------------------");

        for(int i=0; i<cBC.getLength(); i++) {
            for(int j=0; j<cBC.getContacBook(i).contactx.size(); j++){
                String nameC = cBC.getContacBook(i).contactx.get(j).getName().toLowerCase();
                if(nameC.indexOf(subC.toLowerCase())!=-1){
                    System.out.println("Name: "+cBC.getContacBook(i).contactx.get(j).getName()+" Mobil: "+cBC.getContacBook(i).contactx.get(j).getMobil());
                }
            }
        }
    }

    public static int messageOption(String msg) {

        System.out.println("------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------");
        int option = intScanner.nextInt();

        return option;
    }
    // --- Fin Agregado ---
}
