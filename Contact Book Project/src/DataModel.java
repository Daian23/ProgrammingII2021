public class DataModel {

    public static void saveCB(ContactBook contactB) {
        String nameCB = contactB.getName();
        String st_ContactB = contactB.toString("&%&");
        GestorArchivos.guardar(nameCB,st_ContactB);

    }
    public static ContactBook loadCB(String nameCB){
        String recover_CB = GestorArchivos.cargar(nameCB);

        String [] contact = recover_CB.split("&%&");
        //System.out.println(contact);
        ContactBook contactBook = new ContactBook();
        for (int i =0;i<contact.length;i++){
            System.out.println(i+" -> "+contact[i]+" <- " +i);
            String [] aC = contact[i].split("#");
            Contact contactN = new Contact(aC[0],aC[1],aC[2],Boolean.parseBoolean(aC[3]));
            contactBook.addContact(contactN);
        }
        return contactBook;
    }


}
