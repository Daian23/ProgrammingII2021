public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CBContainer miCBC = new CBContainer("miPrimerCBC");

        ContactBook miCB = new ContactBook();

        Contact miContact = new Contact("Enzo","enzo@enzovich.com","757575",false);
        Contact otherContact = new Contact("Fito","fito@fitolandia.com","4444",false);

        miCB.addContact(miContact);
        miCB.addContact(otherContact);

        miCBC.addContactBook(miCB);
        ContactBook otroContactBook = new ContactBook();

        otroContactBook.addContact(otherContact);
        otroContactBook.addContact(miContact);

        miCBC.addContactBook(otroContactBook);

        //GestorArchivos.guardarContainer(miCBC,);

        System.out.println(miCBC.toString("||"));
    }
}
