package cf.devops.soulaiman;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoulaimanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoulaimanApplication.class, args);
    }

    @Bean
    CommandLineRunner run(){
        return args -> {
            System.out.println("**********************************************");
            System.out.println("bonjour et bon courage dans vote examen en devops");
            System.out.println("**********************************************");

            System.out.println("adding something to dev branch");
        } ;
    }


}
