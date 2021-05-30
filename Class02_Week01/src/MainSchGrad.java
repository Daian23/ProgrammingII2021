public class MainSchGrad {

    public static void main(String args[]){

        Grade grade1 = new Grade("I.E.S 9-024 Lavalle ", "Terciario", "Segundo", 8);
        System.out.println(grade1);

        System.out.println("----------------------------------------------------------------------------------------------------");

        School school1 = (School) grade1;
        System.out.println(school1);

        System.out.println("----------------------------------------------------------------------------------------------------");

        School school2 = new School ("Tomás L. Appugliese", "Secundaria");
        System.out.println(school2);

        System.out.println("----------------------------------------------------------------------------------------------------");

        Grade grade2 = (Grade) school2;
        System.out.println(grade2);


    }
}
