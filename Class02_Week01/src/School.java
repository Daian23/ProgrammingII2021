
public class School {

    private String nameSchool;
    private  String levelSchool;

    public School(String nameS, String levelS) {
        this.nameSchool = nameS;
        this.levelSchool = levelS;
    }

    public void setNameSchool(String nameS) {
        this.nameSchool = nameS;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setLevel(String levelS) {
        this.levelSchool = levelS;
    }

    public String getLevel() {
        return levelSchool;
    }

    public String toString() {
        return "Name School: " + nameSchool + " | Level: " +  levelSchool ;
    }
}
