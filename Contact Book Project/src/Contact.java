public class Contact {

    private String name;
    private String email;
    private String mobil;
    private boolean topList;

    Contact (String nam, String mail, String mob, Boolean topL ){
        this.name = nam;
        this.email = mail;
        this.mobil = mob;
        this.topList = topL;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getMobil() {
        return mobil;
    }

    public void setTopList(boolean topList) {
        this.topList = topList;
    }

    public boolean getTopList() {
        return topList;
    }

    public String toString(){
        String caracter = " Name Contact: " + name + " | Email: " + email + " | Mobil: " + mobil + " | TopList: " + topList + "\n";
        return caracter;
    }
    public String toString(String sep){
        String caracteres = this.name + sep + this.email + sep + this.mobil + sep + this.topList;
        return  caracteres;
    }

    public boolean equals (Object o){
        Contact contactN = (Contact) o;
        return (contactN.name == name) && (contactN.email == email) && (contactN.mobil == mobil) && (contactN.topList == topList);

    }
}
