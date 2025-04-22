class cellphone {
    void ring() {
        System.out.println("Ringing...");

    }

    void vibrate() {
        System.out.println("Vibrating...");

    }
}

public class Q2 {

    public static void main(String[] args) {
        cellphone c = new cellphone();
        c.ring();
        c.vibrate();

    }
}
