package awsyoo.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("awsyoo.dev");

        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);

        TaskManager taskManager = context.getBean(TaskManager.class);

        taskManager.printTask();

        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
        taskExecutor.executeTask();
    }
}
