package java_21_F;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class ForeignFunctionMemoryExample {
	
    public static void main(String[] args) {
    	
        try (Arena arena = Arena.ofConfined()) {
        	
            // Allocate native memory for an int
            MemorySegment segment = arena.allocate(ValueLayout.JAVA_INT);
            
            // Write a value to the allocated memory
            segment.set(ValueLayout.JAVA_INT, 0, 777);
            
            // Read the value from the allocated memory
            int value = segment.get(ValueLayout.JAVA_INT, 0);
            System.out.println("Value from native memory: " + value);
        }
    }
}











