package awsyoo.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("awsyoo.dev");
        
        TaskManager taskManager = context.getBean(TaskManager.class);
        
        taskManager.printTask();
        
        context.close();
    }
}
