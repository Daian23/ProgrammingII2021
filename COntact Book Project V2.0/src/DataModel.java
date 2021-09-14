
public class DataModel {

        //---- Agregado ------
        public static void saveCBContainer(CBContainer cBContainer) {
            String nameCBC = cBContainer.getName();
            String tmp_CBC = cBContainer.toString("%&%");
            GestorArchivos.guardar("ContainerCB",tmp_CBC);
        }

        public static CBContainer loadCBContainer(String name) {

            //Cargo el contenedor desde la unidad local.
            String tmp_CBCont = GestorArchivos.cargar(name);

            //Desempaqueto los CB stringificados
            String [] str_CBook =tmp_CBCont.split("%&%");

            // Instancio el contenedor
            CBContainer miCBContainer = new CBContainer("unicoCBContainer");

            // Recorro el vector de CBook stringuificados
            for(int i=0 ; i<str_CBook.length ; i++) {

                // Tomo de a uno los CBook stringuificados y apilo los contactos
                String[] str_Contactos = str_CBook[i].split("&%&");

                //Instancio una libreta de contactos para cuando los contactos se conviertan nuevamente en objetos.
                ContactBook miContactBook = new ContactBook();

                //Tengo que darle un nombre a cada libreta de contactos para poder diferenciarlas.
                miContactBook.setName(i+"-ContacBook");

                //Recorro CADA libreta de contactos para apilar los atributos.
                for(int j=0 ; j<str_Contactos.length ; j++) {

                    //Apilos los atributos
                    String[] str_Atributos = str_Contactos[j].split("#");

                    //Instancio los atributos y les doy valor desde la pila
                    Contact miContact = new Contact(str_Atributos[0],str_Atributos[1],str_Atributos[2],Boolean.parseBoolean(str_Atributos[3]));

                    // Agrego el contacto a la libreta instanciada más arriba
                    miContactBook.addContact(miContact);
                }

                //Una vez que la libreta est� llena, la agrego al container instanciado mucho m�s arriba.
                miCBContainer.addContactBook(miContactBook);
            }
            //Devuelvo el contenedor como objeto
            return miCBContainer;
        }
        //-- fin agregado ----
}
