
public class Citizen extends Person{

    private String province;
    private long document;

    public Citizen (String name, String surn, String pro, long doc){
        super(name, surn);
        setDocument(doc);
        setProvince(pro);
    }

    public String getProvince()
    {
        return province;
    }

    public void setProvince (String province)
    {
        this.province = province;
    }

    public long getDocument()
    {
        return document;
    }

    public void setDocument(long doc)
    {
        this.document= doc;
    }

    public String toString()
    {
        return "Name: " + super.getNamePerson() + " | Surname: " + super.getSurnamePerson() + " | Province: "+ province + " | D.N.I: " + document ;
    }
}
