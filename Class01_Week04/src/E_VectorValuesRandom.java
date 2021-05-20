
public class E_VectorValuesRandom {

    public static void main(String args[]) {

        int [] vectorInt = new int [10];
        int random = 0;

        System.out.println("**************************");
        System.out.println("Programa: Valores Random!");
        System.out.println("**************************");

        for (int i=0;i<vectorInt.length;i++){

            random = (int)(Math.random() * 100);
            vectorInt[i] = random;

            if(random%7!=0) {
                vectorInt[i]=random;
                int cont=0;

                for (int j=0;j<vectorInt.length;j++) {
                    if(random==vectorInt[j]){
                        cont=cont+1;
                    }
                }
                if(cont>1){
                    i=i-1;
                }
            }else{
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

        System.out.println("-------------------------------");

        for (int i=0;i<vectorInt.length;i++){
            System.out.println("["+i+"] = "+vectorInt[i]);
        }
    }
}
