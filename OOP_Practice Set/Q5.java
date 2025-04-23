class character {
    String name;

    character(String name) {
        this.name = name;
    }

    void running() {
        System.out.println(name + " is running");
    }

    void jumping() {
        System.out.println(name + " is jumping");
    }

    void sleeping() {
        System.out.println(name + " is sleeping");
    }

    void shooting() {
        System.out.println(name + " is shooting");
    }

}

public class Q5 {

    public static void main(String[] args) {
        character c1 = new character("Debanjan");
        c1.running();
        c1.jumping();
        c1.sleeping();
        c1.shooting();
    }
}