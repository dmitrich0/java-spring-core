package awsyoo.dev;

import awsyoo.dev.aop.Loggable;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {

    private final Task task;

    public TaskManager(Task task) {
        this.task = task;
    }

    @Loggable(value = "ERROR", count = 3)
    public Long printTask() {
        System.out.println("Current task: " + task.toString());
        
        return task.getDuration();
    }

    @PostConstruct
    public void postConstruct() {
//        System.out.println("post construct:" + this.getClass());
    }

    @PreDestroy
    public void preDestroy() {
//        System.out.println("pre destroy:" + this.getClass());
    }
}
