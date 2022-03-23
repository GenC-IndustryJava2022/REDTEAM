import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages ={"com.cognizant"})
public class CogniClothApplication {


	public static void main(String[] args) 
	{
		 SpringApplication.run(CogniClothApplication.class,args);
				
	}

}
