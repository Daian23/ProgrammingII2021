
public class Controller {

    public static void main(String args[]) {
        ContactBook contactB = new ContactBook();

        do {
            int option = View.menu();
            if (option == 1) {

                contactB = View.createContactBook(new ContactBook());

            } else if (option == 2) {

                ContactBook contactBk = View.addingContact(contactB);
                DataModel.saveCB(contactBk);

            } else if(option == 3){
                String nameCB= "ListUnica";
                ContactBook contactBook = DataModel.loadCB(nameCB);
                View.ListCB(contactBook);
                GestorArchivos.exists();
            }
        } while (true);
    }
}

