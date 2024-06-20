package java_21_F;


public class ScopedValuesExample {
	
    // Define a scoped value
    private static final ScopedValue<Integer> CURRENT_USER = ScopedValue.newInstance();

    public static void main(String[] args) {
    	
        // Set and use the scoped value in a scope
        ScopedValue.runWhere(CURRENT_USER, 1, () -> {
        System.out.println("Current user: " + CURRENT_USER.get());
            
        // Nested scope
        ScopedValue.runWhere(CURRENT_USER, 2, () -> {
        System.out.println("Nested current user: " + CURRENT_USER.get());
        });
            
        System.out.println("Back to outer scope user: " + CURRENT_USER.get());
        });
    }
}








