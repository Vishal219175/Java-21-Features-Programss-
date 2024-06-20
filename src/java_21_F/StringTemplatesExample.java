package java_21_F;

// this is the preview feature and it is the feature of java 22 not 21.
public class StringTemplatesExample {
	
    public static void main(String[] args) {
    	
        String name = "Vishal";
        int age = 24;

        // Using a string template
        String greeting = STR."Hello, my name is \{name} and I am \{age} years old.";
        System.out.println(greeting);
    }
}
