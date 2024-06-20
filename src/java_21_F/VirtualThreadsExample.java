package java_21_F;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.List;

public class VirtualThreadsExample {
	
    public static void main(String[] args) {
    	
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        
        try {
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println(Thread.currentThread());
                });
            }
        } finally {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                    System.err.println("Executor did not terminate in the specified time.");
                    List<Runnable> droppedTasks = executor.shutdownNow();
                    System.err.println("Executor was abruptly shut down. " + droppedTasks.size() + " tasks will not be executed.");
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
                // Restore the interrupt status
                Thread.currentThread().interrupt();
            }
        }
    }
}
