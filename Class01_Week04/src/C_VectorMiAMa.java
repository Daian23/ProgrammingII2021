import java.util.Scanner;

public class C_VectorMiAMa {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int [] vectorInt = new int [5];
        int valueI;

        System.out.println("***********************************************");
        System.out.println("Programa: Ordenando el vector de menor a mayor");
        System.out.println("***********************************************");
        System.out.println("Almacene 5 valores enteros al vector");

        for (int i=0;i<vectorInt.length;i++){

            System.out.print("["+i+"] = ");
            valueI=input.nextInt();

            if(valueI%7!=0) {
                vectorInt[i] =valueI;
            }else{
                System.out.println("¡No permitido! Valor múltiplo de 7. Ingrese otro valor");
                i=i-1;
            }
        }

        for (int i=0;i<vectorInt.length-1;i++){
            for(int k=i+1;k<vectorInt.length;k++){
                if(vectorInt[i]>vectorInt[k]){
                    int aux= vectorInt[i];
                    vectorInt[i]=vectorInt[k];
                    vectorInt[k]=aux;
                }
            }
        }

        System.out.println("------------------------");

        for (int i=0;i<vectorInt.length;i++){
            System.out.println("["+i+"] = "+vectorInt[i]);
        }
    }
}
