package eCommerce.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"eCommerce.*"})
@EnableJpaRepositories(basePackages="eCommerce.*")
public class ZFashionDesignProjectFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZFashionDesignProjectFinalApplication.class, args);
	}

}
