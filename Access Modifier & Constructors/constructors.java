class MyEmployee {
    private int id;
    private String name;

    public MyEmployee() {
        id = 0;
        name = "Enter name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
}

public class constructors {
    public static void main(String[] args) {
        MyEmployee D = new MyEmployee();
        D.setID(1);
        D.setName("Debanjan Dutta");
        System.out.println(D.getID() + " : " + D.getName());
    }
}
