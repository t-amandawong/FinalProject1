import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PrimitiveIterator;
import java.util.concurrent.TimeUnit;

class Peen {
    String identifier;
    int number;


    public Peen(String id, int num) {
        this.identifier = id;
        this.number = num;
    }

    public String toString() {
        String s = "[" + identifier + " " + number + "]";
        return s;
    }
}

class PeenNumberComparator implements Comparator<Peen> {
    public int compare(Peen peen1, Peen peen2) {
        return peen1.number - peen2.number;
    }
}

public class HeapTest {
    public static void main(String args[]) {
        PeenNumberComparator c = new PeenNumberComparator();

        /*ArrayList<Peen> A = new ArrayList<Peen>();
        A.add(null);
        A.add(new Peen("1", 1));
        A.add(new Peen("3", 3));
        A.add(new Peen("5", 5));
        A.add(new Peen("7", 7));
        A.add(new Peen("9", 9));
        A.add(new Peen("12", 12));
        A.add(new Peen("14", 14));
        A.add(new Peen("16", 16));
        PeenNumberComparator c = new PeenNumberComparator();
        Heap<Peen> h = new Heap<Peen>(A, c);
        System.out.println(h.toString());
        h.insert(new Peen("10", 10));
        System.out.println(h.toString());
        h.insert(new Peen("0", 0));
        System.out.println(h.toString());
        h.insert(new Peen("1", 1));
        System.out.println(h.toString());
        h.insert(new Peen("3", 3));
        System.out.println(h.toString());

        System.out.println(h.sort());*/
/*        ArrayList<Peen> B = new ArrayList<Peen>();
        B.add(new Peen("1", 1));
        B.add(new Peen("3", 3));
        B.add(new Peen("5", 5));
        B.add(new Peen("7", 7));
        B.add(new Peen("9", 9));
        B.add(new Peen("12", 12));
        B.add(new Peen("14", 14));
        B.add(new Peen("16", 16));
        System.out.println(B.get(0));
        Heap<Peen> h2 = new Heap<Peen>(B, c);

        System.out.println(h2.toString());
        h2.remove(3);
        System.out.println(h2.toString());
        h2.remove(1);
        System.out.println(h2.toString());
        h2.remove(2);
        System.out.println(h2.toString());
        System.out.println(h2.getHeapSize());
        System.out.println(h2.sort());*/
         //String username, String firstName, String lastName, String email, String password,
        //			String address, String city, String state, int zip
        Customer tempC = new Customer("Vich1944", "Courtney", "Reinhardt",
                "CourtneyRReinhardt@gmail.com", "Tie7Chae2r",
                "7203 W. Rosewood Ave", "Chardon", "Ohio", 44024);
        ArrayList<Order> orderArrayList = new ArrayList<>();
        List<VideoGame> tempVG = new List<>();
        tempVG.addLast(new VideoGame("Halo", "Bungie", 20081023, 5.00, "Shooter", "M", 86, "Xbox"));

        List<VideoGame> tempVG2 = new List<>();
        tempVG2.addLast(new VideoGame("Halo 3", "Bungie", 20081026, 7.00, "Shooter", "M", 86, "Xbox"));
        tempVG2.addLast(new VideoGame("Halo 2", "Bungie", 20081003, 5.00, "Shooter", "M", 86, "Xbox"));

        List<VideoGame> tempVG3 = new List<>();
        tempVG3.addLast(new VideoGame("Halo CE", "Bungie", 2008107, 5.00, "Shooter", "M", 86, "Xbox"));

        Order tempOrder1 = new Order(tempC, 20210616, tempVG3, 2, false);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        Order tempOrder2 = new Order(tempC, 20210616, tempVG2, 2, true);

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        Order tempOrder3 = new Order(tempC, 20210616, tempVG, 2, false);
        orderArrayList.add(null);
        orderArrayList.add(tempOrder2);
        orderArrayList.add(tempOrder1);
        orderArrayList.add(tempOrder3);

        OrderComparator oc = new OrderComparator();
        Heap<Order> orderHeap = new Heap<>(orderArrayList, oc);

/*        System.out.println(oc.compare(tempOrder1, tempOrder3));
        System.out.println(oc.compare(tempOrder2, tempOrder3));
        System.out.println(oc.compare(tempOrder3, tempOrder2));
        System.out.println(oc.compare(tempOrder2, tempOrder1));*/


        System.out.println(orderHeap);

        // tempC.placeUnshippedOrder();
    }
}
