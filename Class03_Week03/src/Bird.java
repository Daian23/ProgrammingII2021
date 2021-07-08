public abstract class Bird {
    private String nameBird;

    public void setNameBird(String nameBird) {
        this.nameBird = nameBird;
    }

    public String getNameBird() {
        return nameBird;
    }

    public abstract String behavior();

    public void show(){
        System.out.println("I'm " + this.nameBird +"... "+ behavior());
    }
}
