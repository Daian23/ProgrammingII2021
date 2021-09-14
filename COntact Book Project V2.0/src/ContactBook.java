import java.util.ArrayList;

public class ContactBook {

    private String name;
    public ArrayList<Contact> contactx ;

    public ContactBook() {
        contactx = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String nameCB) {
        this.name= nameCB;
    }

    public void addContact(Contact contact){
        contactx.add(contact);
    }

    public void delContact(int i){
        contactx.remove(i);
    }

    public Contact getContact(int i) {
        return contactx.get(i);
    }

    public int getLength() {
        return contactx.size();
    }

    public String toString(){
        String tmp="";
        for (int i=0; i<contactx.size(); i++){
            tmp = tmp+i+" - "+contactx.get(i).toString();
        }
        System.out.println("Contact Book: "+name);
        return tmp;
    }

    public String toString(String sep){
        String st_CB = "";
        for (int i=0;i<contactx.size();i++){
            if(i == this.contactx.size()-1){
                st_CB = st_CB + this.contactx.get(i).toString("#");
            }else {
                st_CB = st_CB + this.contactx.get(i).toString("#")+sep;
            }
        }
        return st_CB;
    }
}
