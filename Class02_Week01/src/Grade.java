
public class Grade extends School{

    private  String nameGrade;
    private  int numStudents;

    public Grade (String nameS,String levelS, String nameG, int numStud) {
        super(nameS,levelS);
        this.nameGrade = nameG;
        this.numStudents = numStud;
    }

    public void setNameGrade(String nameG){

        this.nameGrade= nameG;
    }

    public String getNameGrade(){

        return nameGrade;
    }

    public void setNumStudents(int numStud) {

        this.numStudents = numStud;
    }

    public int getNumStudents(){

        return numStudents;
    }

    public String toString(){
        return "Name School: " + super.getNameSchool() + " | Level: " + super.getLevel() + " | Grade Name: " + nameGrade + " | Number of students: " + numStudents ;
    }
}
