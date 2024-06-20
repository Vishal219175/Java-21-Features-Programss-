package java_21_F;


public class PatternMatchingSwitchExample {
	
    public static void main(String[] args) {
    	
        Object[] objects = {123, "Hello", 3.14, 42L, null};

        for (Object obj : objects) {
        	
            String result = 
            		
              switch (obj) {
                case Integer i -> "Integer with value: " + i;
                
                case String s -> "String with value: " + s;
                
                case Double d -> "Double with value: " + d;
                
                case Long l -> "Long with value: " + l;
                
                case null -> "Null value";
                
                default -> "Unknown type";
                
            };
            System.out.println(result);
        }
    }
}
