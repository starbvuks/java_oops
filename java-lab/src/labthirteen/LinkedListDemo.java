package labthirteen;

import java.util.*;

public class LinkedListDemo {
    public static void main(String args[]) {
        
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.addFirst("F");
        ll.addLast("G");
        ll.add(2, "H");

        System.out.println("ll contents: " + ll);

        ll.remove(2);
        ll.remove("A");

        System.out.println("ll contents: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll contents: " + ll);

        var val = ll.get(2);
        ll.set(2, val + " Changed");

        System.out.println("ll contents: " + ll);
    }
}
