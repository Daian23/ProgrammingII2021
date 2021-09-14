import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorArchivos {

    static BufferedReader entradaArchivo = null;
    static BufferedWriter salidaArchivo = null;

    public static void guardar(String nombre, String data){

        try {
            salidaArchivo = new BufferedWriter(new FileWriter(
                    "/home/daiana/Documentos/MisFicheros/"+nombre+".txt"));

            salidaArchivo.write(data);

        } catch (IOException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(
                    Level.SEVERE, null, ex);
        }finally{
            if(salidaArchivo!=null){
                try {
                    salidaArchivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(GestorArchivos.class.getName()).log(
                            Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static String cargar(String nombre) {

        String linRetorno = "";
        try {
            entradaArchivo = new BufferedReader(new FileReader(
                    "/home/daiana/Documentos/MisFicheros/"+nombre+".txt"));
            linRetorno = entradaArchivo.readLine();
        } catch(FileNotFoundException e){
            System.out.println("No hay lista para listar!");
        } catch (IOException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally{
            if(entradaArchivo != null)
                try {
                    entradaArchivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(GestorArchivos.class.getName()).log(
                            Level.SEVERE, null, ex);
                }
        }
        return linRetorno;
    }

    static String empaquetador(ArrayList<String> empa, String separador){

        String paquete = "";
        for(int i = 0 ; i<empa.size()-1;i++){
            paquete = paquete+empa.get(i)+separador;
        }
        paquete = paquete+empa.get(empa.size()-1);
        return paquete;
    }

    static ArrayList<String> desempaquetador(
            String paquete, String separador){

        ArrayList<String> miAList2 = new ArrayList<>();
        String [] mivector = paquete.split(separador);

        for(int i = 0; i<mivector.length;i++){
            miAList2.add(mivector[i]);

        }
        return miAList2;
    }

    /**
     * Este método guarda un ArrayList en disco.
     * @param miArray: El ArrayList que será guardado.
     * @param nombreArchivo: El nombre de archivo con el que será guardado en C:/MisFicheros. Si la carpeta no está debe crearla.
     */
    public static void guardarArray(ArrayList miArray,String nombreArchivo){
        /**
         * Recibe como argumentos un objeto ArrayList y un String para
         * el nombre del archivo.
         * El archivo será guardado en la ruta: C:MisFicheros
         *  si no tiene esa carpeta debe crearla y darle los atributos adecuados
         */
        String empaquetado = empaquetador(miArray,"#");
        guardar(nombreArchivo, empaquetado);
    }

    /**
     * Este método recupera del disco un ArrayList.
     * @param nombreArchivo:  Es el el nombre del archivo que será leido desde el dicos.  Debe estar almacenado en la ruta C:MisFichechos.
     * @return Devolverá un objeto de la clase ArrayList.
     */
    public static ArrayList cargarArray(String nombreArchivo){
        String leido = cargar(nombreArchivo);
        ArrayList<String> retorno = desempaquetador(leido,"#");
        return retorno;
    }
}
