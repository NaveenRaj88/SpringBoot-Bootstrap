package bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@RestController
@SpringBootApplication
public class SpringBooter {

//    @RequestMapping("/")
//    String home(){
//        return "Hello World";
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBooter.class, args);
    }
}
