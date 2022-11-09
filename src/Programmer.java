public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    void coding(){
        System.out.println(super.getName() + " is coding in " + getCompanyName());
    }

    @Override
    public String toString() {
        return super.toString() + "Programmer{" +
                "companyName: '" + companyName + '\'' +
                '}';
    }
}
