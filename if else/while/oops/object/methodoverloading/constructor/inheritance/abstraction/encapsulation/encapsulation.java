public class Main {
    private String name;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public static void main(String[] args) {
        Main var1 = new Main();
        var1.setname("sasikala");
        System.out.println(var1.getname());
    }
}