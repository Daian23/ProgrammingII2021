public class Main {

    public static void main(String args[]){

        Citizen citizen1 = new Citizen("Taylor", "Lotner", "Mendoza", 23589645);
        Person person1 = new Person ("Taylor", "Lotner");

        System.out.println("Nombre: " + citizen1.getName());
        System.out.println("Apellido: " + citizen1.getSurname());
        System.out.println("D.N.I: " + citizen1.getDocument());
        System.out.println("Provincia: " + citizen1.getProvince());

        System.out.println("--------------------------------------------------------------------------");
        System.out.println(person1+" | "+citizen1);
        System.out.println("--------------------------------------------------------------------------");

    }
}
