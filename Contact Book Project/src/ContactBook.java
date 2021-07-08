import java.util.ArrayList;
public class ContactBook {

    private String name;
    public ArrayList<Contact> contactx ;

    public ContactBook() {
        contactx = new ArrayList<>();
    }

    public void addContact(Contact contact){
        contactx.add(contact);
    }

    public void setName(String nameCB) {
        this.name= nameCB;
    }

    public String getName() {
        return name;
    }

    public void delContact(){

    }

    /*public boolean isTheContact(Contact contact){
       boolean existingContact = false;
       for (int i=0; i<contactx.size(); i++) {
            if (contact.equals(contactx.get(i))) {
                existingContact = true;
            }
        }
        return existingContact;
    }/*
    /*public boolean isTheContact(Contact contact){
        System.out.println(contactx.contains(contact));
         boolean existingContact = contactx.contains(contact);
        return existingContact;
    }*/
    public String toString(){
        String tmp="";
        for (int i=0; i<contactx.size(); i++){
            tmp = tmp + contactx.get(i).toString();
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
