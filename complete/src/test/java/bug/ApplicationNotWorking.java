package bug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("bug")
@ComponentScan("bug")
public class ApplicationNotWorking {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationNotWorking.class, args);
    }
}
