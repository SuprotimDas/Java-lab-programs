interface Mango {
    void taste();
}

class Winter implements Mango {
    public void taste() {
        System.out.println("Less sweet");
    }
}

class Summer implements Mango {
    public void taste() {
        System.out.println("Very sweet");
    }
}

public class Mango1 {
    public static void main(String[] args) {
        Mango m1 = new Winter();
        Mango m2 = new Summer();

        m1.taste();
        m2.taste();
    }
}