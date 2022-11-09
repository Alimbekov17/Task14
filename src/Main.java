public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Zuckerberg", "Programming");
        programmer.setCompanyName("Meta");
        Dancer dancer = new Dancer("Jabbawockeez", "dancer");
        dancer.setGroupName("USA");
        Singer singer = new Singer("Eminem", "singer");
        singer.setBandName("Beatles");

        System.out.println(programmer);
        programmer.coding();
        System.out.println(dancer);
        dancer.dancing();
        System.out.println(singer);
        singer.singing();
        singer.playGuitar();
    }
}