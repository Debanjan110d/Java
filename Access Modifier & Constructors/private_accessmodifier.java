class MyEmployee {
    int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class private_accessmodifier {

    public static void main(String[] args) {
        MyEmployee e1 = new MyEmployee();
        e1.id = 1;
        e1.setName("Debanjan Dutta");
        System.out.println(e1.id + " : " + e1.getName());

    }
}