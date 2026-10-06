package awsyoo.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("main-task")
public class Task {

    private final String name;
    private final Long duration;

    public Task(
            @Value("${task.name}") String name,
            @Value("${task.duration}") Long duration
    ) {
        System.out.println("constructor");
        this.name = name;
        this.duration = duration;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("pre destroy");
    }

    public Long getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "{Task: " + name + ". Duration: " + duration + "}";
    }
}
