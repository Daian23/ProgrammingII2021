public class TestMain {

    public static void main(String[] args) {


			Contact miContact = new Contact("Enzo","enzo@enzovich.com","757575",false);
			ContactBook miCB = new ContactBook();

			miCB.addContact(miContact);

			CBContainer miCBC = new CBContainer("miPrimerCBC");

			miCBC.addContactBook(miCB);

			Contact otherContact = new Contact("Fito","fito@fitolandia.com","4444",false);
			miCB.addContact(otherContact);

			ContactBook otroContactBook = new ContactBook();
			otroContactBook.addContact(otherContact);
			otroContactBook.addContact(miContact);

			miCBC.addContactBook(otroContactBook);

			System.out.println(miCBC.toString("%&%"));

			DataModel.saveCBContainer(miCBC);

        System.out.println("--------------------------------");
        CBContainer miCBCN = DataModel.loadCBContainer("miPrimerCBC");
        System.out.println("--------------------------------");

        //System.out.println(miCBC.toString("%&%"));
        View.listContainer(miCBCN);
    }
}
