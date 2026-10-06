package awsyoo.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {

    private final Task task;

    public TaskManager(Task task) {
        this.task = task;
    }

    public void printTask() {
        System.out.println("Current task: " + task.toString());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct:" + this.getClass());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("pre destroy:" + this.getClass());
    }
}
