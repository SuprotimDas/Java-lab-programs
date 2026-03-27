import java.util.*;

class Tender {
    int cost;
    String cname;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tender t[] = new Tender[5];

        for(int i=0;i<5;i++){
            t[i] = new Tender();

            System.out.print("Enter company name: ");
            t[i].cname = sc.next();

            System.out.print("Enter cost: ");
            t[i].cost = sc.nextInt();
        }

        int pos = 0;

        for(int i=1;i<5;i++){
            if(t[i].cost < t[pos].cost){
                pos = i;
            }
        }

        System.out.println("Lowest cost company: " + t[pos].cname);
    }
}