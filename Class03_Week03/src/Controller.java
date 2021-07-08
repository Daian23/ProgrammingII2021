public class Controller {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------");
        DomesticDuck duck1 = new DomesticDuck();
        duck1.setNameBird("Reggie");
        duck1.getNameBird();
        duck1.show();

        Bird duck2 = new DomesticDuck();
        duck2.setNameBird("Jake");
        duck2.getNameBird();
        duck2.show();

        System.out.println("----------------------------------------------------------------");
        Guacamayo guacamayo1 = new Guacamayo ();
        guacamayo1.setNameBird("Blu");
        guacamayo1.getNameBird();
        guacamayo1.show();

        Bird guacamayo2 = new Guacamayo ();
        guacamayo2.setNameBird("Perla");
        guacamayo2.getNameBird();
        guacamayo2.show();
        System.out.println("---------------------------------------------------------------");
    }
}
