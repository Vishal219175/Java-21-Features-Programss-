package java_21_F;

import java.util.SequencedSet;
import java.util.LinkedHashSet;

public class SequencedCollectionsExample {
    public static void main(String[] args) {
    	
        // Using a SequencedSet
        SequencedSet<String> sequencedSet = new LinkedHashSet<>();
        sequencedSet.add("first");
        sequencedSet.add("second");
        sequencedSet.add("third");

        // Iterating in insertion order
        System.out.println("Insertion order:");
        for (String item : sequencedSet) {
            System.out.println(item);
        }

        // Iterating in reverse order
        System.out.println("Reverse order:");
        for (String item : sequencedSet.reversed()) {
            System.out.println(item);
        }
    }
}
