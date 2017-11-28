package SpringManualComponentScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import parth.springframework.DependencyInjection.controller.GreetingController;

/*This is just copy of another package's DependencyInjectionApplication to demonstrate
Manual ComponentScan in Spring using @ComponentScan.
#Spring has ability to scan packages for components
here you have to specify package as components are in different package than this.
 */
@SpringBootApplication
@ComponentScan("parth.springframework.DependencyInjection")
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(DependencyInjectionApplication.class, args);
        GreetingController greetingController=(GreetingController) applicationContext.getBean("greetingController");
        greetingController.sayHello();

	}
}
