abstract class AbstractProduct {
    int productId;

    AbstractProduct(int id) {
        productId = id;
    }

    abstract void display();
}

class TravelGuide extends AbstractProduct {
    String title;

    TravelGuide(int id, String t) {
        super(id);
        title = t;
    }

    void display() {
        System.out.println("Travel Guide: " + productId + " " + title);
    }
}

class CD extends AbstractProduct {
    String artist;

    CD(int id, String a) {
        super(id);
        artist = a;
    }

    void display() {
        System.out.println("CD: " + productId + " " + artist);
    }
}

public class AP {
    public static void main(String[] args) {
        AbstractProduct p;

        p = new TravelGuide(1,"India Tour");
        p.display();

        p = new CD(2,"Arijit Singh");
        p.display();
    }
}