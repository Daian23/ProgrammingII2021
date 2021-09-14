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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public boolean getTopList() {
        return topList;
    }

    public void setTopList(boolean topList) {
        this.topList = topList;
    }

    public String toString(){
        String caracter = " Name Contact: " + name + " | Email: " + email + " | Mobil: " + mobil + " | TopList: " + topList + "\n";
        return caracter;
    }
    public String toString(String sep){
        String caracteres = this.name + sep + this.email + sep + this.mobil + sep + this.topList;
        return  caracteres;
    }
}
