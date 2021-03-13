package app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class Kids_2010 {
    public static void main(String[] args) {
   //     ApplicationContext context=new AnnotationConfigApplicationContext(Context.class);
     //   https://stackoverflow.com/questions/32650536/using-thymeleaf-variable-in-onclick-attribute
        //@Temporal(TemporalType.DATE)

        //https://www.thymeleaf.org/doc/articles/springmvcaccessdata.html
        Locale.setDefault(new Locale("ru"));
        SpringApplication.run(Kids_2010.class,args);
    }
}
