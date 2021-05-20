
public class Citizen extends Person{

    private String province;
    private long document;

    public Citizen (String name, String surn, String pro, long doc){
        super(name, surn);
        setDocument(doc);
        setProvince(pro);
    }

    public String toString()
    {
        String message ="Provincia: "+ province +" | "+" D.N.I: "+document ;
        return message;
    }

    public void setProvince (String province)
    {
        this.province = province;
    }

    public void setDocument(long doc)
    {
        this.document= doc;
    }

    public String getProvince()
    {
        return province;
    }

    public long getDocument()
    {
        return document;
    }
}
