package labthirteen;

import java.util.*;

public class HashSetDemo {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println("set contents: " + set);
        
        set.remove(2);
        System.out.println("set contents: " + set);
        
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(9);
        set1.add(8);
        
        set.addAll(set1);
        set1.removeAll(set1);
        
        System.out.println("set1 contents: " + set1);
        
        set.removeIf(integer->integer==3);
        System.out.println("set contents: " + set);
        
        set.clear();
        System.out.println("set contents: " + set);
    }
}
