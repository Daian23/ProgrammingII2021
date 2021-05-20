
public class Person {

    private String name;
    private String surname;

    public Person (String name, String surn) {
        setName(name);
        setSurname(surn);
    }

    public String toString()
    {
        String message = "Nombre: "+name+" | "+" Apellido: "+surname;
        return message;
    }


    public String getName ()
    {
        return name;
    }

    public void setName (String nam)
    {
        this.name = nam;
    }

    public String getSurname ()
    {
        return surname;
    }

    public void setSurname (String surn)
    {
        this.surname = surn;
    }
}
