package test.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Autor Shapkin Eduard Vladimirovich
 * @see <a href="snd009@mail.ru</a>
 * */
@SpringBootApplication
@EntityScan(basePackages = "test.service")
@ComponentScan(basePackages = "test.service")
public class ServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

}
