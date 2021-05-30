
public class Person {

    private String name;
    private String surname;

    public Person (String name, String surn) {
        setNamePerson(name);
        setSurnamePerson(surn);
    }

    public String getNamePerson ()
    {
        return name;
    }

    public void setNamePerson (String nam)
    {
        this.name = nam;
    }

    public String getSurnamePerson ()
    {
        return surname;
    }

    public void setSurnamePerson (String surn)
    {
        this.surname = surn;
    }

    public String toString()
    {
        return "Name: " + name + " | " + "Surname: " + surname;
    }
}
