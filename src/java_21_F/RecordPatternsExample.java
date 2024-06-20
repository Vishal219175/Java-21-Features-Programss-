package java_21_F;


public class RecordPatternsExample {
	
    // Define a record named Point with two fields: x and y
    record Point(int x, int y) {}

    public static void main(String[] args) {
    	
        // Create an instance of Point and assign it to an Object reference
        Object obj = new Point(3, 4);

        // Use pattern matching to check if obj is an instance of Point and extract its fields
        if (obj instanceof Point(int x, int y)) {
            // If obj is a Point, x and y are automatically extracted and can be used
            System.out.println("Point coordinates: " + x + ", " + y);
        } 
        else {
            // If obj is not a Point, this block will be executed
            System.out.println("Not a Point instance");
        }
    }
}


