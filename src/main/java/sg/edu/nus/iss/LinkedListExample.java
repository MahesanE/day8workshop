package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkedListExample {

    public void example() {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");

        // print out the linked list
        // ll.forEach(itm -> System.out.println(itm));
        System.out.println(ll);

        ll.remove("C");
        // ll.forEach(itm -> System.out.println(itm));
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        // ll.forEach(itm -> System.out.println(itm));

        System.out.println(ll);
    }
}