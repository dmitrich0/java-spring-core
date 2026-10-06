package awsyoo.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("awsyoo.dev");

        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);

        var props = context.getBean(TaskProperties.class);

        System.out.println(props);
        
        context.close();
    }
}
