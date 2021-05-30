
public class MainPersCit {

    public static void main(String args[]){

        Citizen citizen1 = new Citizen("Jazmín", "Peréz", "Mendoza", 23589645);
        System.out.println(citizen1);

        System.out.println("-------------------------------------------------------------------");

        Person person1 = (Person) citizen1;
        System.out.println(person1);

        System.out.println("-------------------------------------------------------------------");

        Person person2 = new Person ("Bruno", "Mars");
        System.out.println(person2);

        System.out.println("-------------------------------------------------------------------");

        Citizen citizen2 = (Citizen) person2;
        System.out.println(citizen2);

    }
}
