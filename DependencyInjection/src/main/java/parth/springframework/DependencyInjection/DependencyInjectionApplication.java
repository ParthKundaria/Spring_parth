package parth.springframework.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import parth.springframework.DependencyInjection.controller.GreetingController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(DependencyInjectionApplication.class, args);
        GreetingController greetingController=(GreetingController) applicationContext.getBean("greetingController");
        greetingController.sayHello();

	}
}
