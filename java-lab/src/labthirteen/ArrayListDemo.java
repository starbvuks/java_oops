package labthirteen;

import java.util.*;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("al size: " + al.size());
        
        
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add(2, "G");
        
        System.out.println("al size now: " + al.size());
        System.out.println("al contents: " + al);
        
        al.remove(2);
        al.remove("A");
        
        System.out.println("al size again: " + al.size());
        System.out.println("al contents: " + al);
        
    }
}
