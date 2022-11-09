public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation) {
        super(name, designation);
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    void singing(){
        System.out.println(super.getName() + " is singing.");
    }
    void playGuitar(){
        System.out.println(super.getName() + " is playing a guitar with a band " + getBandName());
    }

    @Override
    public String toString() {
        return super.toString() + "Singer{" +
                "bandName: '" + bandName + '\'' +
                '}';
    }
}
