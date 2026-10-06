package awsyoo.dev;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("main-task")
@Scope("prototype")
public class Task {

    private final String name;
    private final Long duration;

    public Task() {
        this.name = "test" + ThreadLocalRandom.current().nextInt();
        this.duration = 60L;
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
