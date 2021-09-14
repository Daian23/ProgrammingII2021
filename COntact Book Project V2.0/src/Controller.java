
public class Controller {

    public static void main(String args[]) {

        ContactBook contactB = new ContactBook();
        int option = 0;
        CBContainer cBContainer = new CBContainer("ContainerCB");

        do {
            option = View.menu();

            try {
                if (option == 1) {
                    // Traemos y Mostramos todas las libretas
                    //var cBCont = DataModel.loadCBContainer("miPrimerCBC");

                   // Le pedimos al usuario la nueva libreta
                   ContactBook newContactB = View.createContactBook(new ContactBook());

                   //Agregamos la nueva libreta al contenedor y guardamos
                  cBContainer.addContactBook(newContactB);
                   DataModel.saveCBContainer(cBContainer);

                }else if (option == 2) {
                    // Traemos y Mostramos todas las libretas
                    var cBCont = DataModel.loadCBContainer("ContainerCB");
                    View.listContainer(cBCont);

                    // Le pedimos al Usuario que seleccione una libreta
                    int opt_cBook = View.messageOption("Select Contact Book number (0 - 1 - ... n )");

                    // Le pedimos al usuario que ingrese un nuevo Contacto
                    Contact contactBk = View.addingContact();

                    // Agregamos el contacto a la libreta seleccionada por el usuario
                    //Obtengo la libreta del contenedor
                    ContactBook extraidoCB = cBCont.getContacBook(opt_cBook);

                    if(View.isTheContact(extraidoCB,contactBk)){
                        System.out.println("Este contacto ya se encuentra registrado!");
                    }else{
                        extraidoCB.addContact(contactBk);

                        //Actualizando ContactBook
                        cBCont.update(opt_cBook, extraidoCB);

                        // Guardamos el contenedor
                        DataModel.saveCBContainer(cBCont);
                    }

                }else if(option == 3){

                    View.searchContact(DataModel.loadCBContainer("ContainerCB"));

                }else if(option == 4){

                    View.listContainer(DataModel.loadCBContainer("ContainerCB"));

                }else if(option == 5) {

                       var cBCont = DataModel.loadCBContainer("ContainerCB");
                       View.listContainer(cBCont);

                       // Le pedimos al Usuario que seleccione una libreta
                       int opt_cBook = View.messageOption("Select Contact Book number (0 - 1 - ... n )");

                       ContactBook extraidoCB = cBCont.getContacBook(opt_cBook);

                       int opt_Contact = View.messageOption("Ingrese el número de contacto a eliminar");

                       extraidoCB.delContact(opt_Contact);

                       cBCont.update(opt_cBook, extraidoCB);
                       DataModel.saveCBContainer(cBCont);
                }
            }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("No hay contactos añadidos!");
            }

        } while (option != 0);
    }
}
