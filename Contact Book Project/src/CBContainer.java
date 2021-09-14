import java.util.ArrayList;

public class CBContainer {

    String name;
    ArrayList<ContactBook> cbContainer;

    public CBContainer(String name) {
        this.cbContainer = new ArrayList<ContactBook>();
        this.name = name;

    }

    public void addContactBook(ContactBook miCB) {
        cbContainer.add(miCB);

    }

    public String toString() {

        String tmp_str = "";
        System.out.println("running toString()");
        System.out.println("cbContainer.size()"+cbContainer.size());

        for(int i = 0 ; i<cbContainer.size();i++) {
            //System.out.println("i = "+i);

            tmp_str = tmp_str + cbContainer.get(i).toString("&%&");
        }
        return tmp_str;
    }

    public String toString(String sep) {
        String tmp_str = "";
        for(int i=0 ; i<cbContainer.size(); i++) {
            //------------
            if(i == this.cbContainer.size()-1){
                tmp_str = tmp_str + this.cbContainer.get(i).toString("&%&");
            }else {
                tmp_str = tmp_str + this.cbContainer.get(i).toString("&%&")+sep;
            }
            //------------
        }

        return tmp_str;
    }
}
