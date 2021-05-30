public class MainSchGrad {

    public static void main(String args[]){

        School school1 = new School ("I.E.S 9-024 Lavalle", "Terciario");
        School school2 = new School ("I.E.S 9-024 Lavalle", "Terciario");

        boolean compare = school1.equals(school2);
        System.out.println(compare);
    }
}
