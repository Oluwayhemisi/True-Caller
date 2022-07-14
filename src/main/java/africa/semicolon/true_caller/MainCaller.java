package africa.semicolon.true_caller;


import africa.semicolon.true_caller.controllers.ContactController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainCaller {
    private static  final ContactController contactcontroller = new ContactController();
    public static void main(String... args){
        SpringApplication.run(MainCaller.class, args);
    }

}
