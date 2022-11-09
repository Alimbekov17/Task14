public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation) {
        super(name, designation);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    void dancing(){
        System.out.println(super.getName() + " is dancing with group " + getGroupName());
    }

    @Override
    public String toString() {
        return super.toString() + "Dancer{" +
                "groupName: '" + groupName + '\'' +
                '}';
    }
}
