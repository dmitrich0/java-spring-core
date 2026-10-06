package awsyoo.dev;

import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {

    private final Task task;

    public TaskExecutor(Task task) {
        this.task = task;
    }

    public void executeTask() {
        System.out.printf("Working on task: %s, duration: %d%n", this.task.getName(), this.task.getDuration());
    }
}
