// Interface
interface Mango {
    void taste();
}

// Class Winter
class Winter implements Mango {
    public void taste() {
        System.out.println("Mango tastes less sweet in winter");
    }
}

// Class Summer
class Summer implements Mango {
    public void taste() {
        System.out.println("Mango tastes very sweet in summer");
    }
}

// Main class
public class InterfaceMango {
    public static void main(String[] args) {
        Winter w = new Winter();
        Summer s = new Summer();

        w.taste();
        s.taste();
    }
}