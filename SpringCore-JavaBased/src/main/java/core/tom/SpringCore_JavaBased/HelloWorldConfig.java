package core.tom.SpringCore_JavaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import core.tom.model.HelloWorld;

@Configuration
@ComponentScan("core.tom.model")
public class HelloWorldConfig {

	   @Bean 
	   public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }
}
