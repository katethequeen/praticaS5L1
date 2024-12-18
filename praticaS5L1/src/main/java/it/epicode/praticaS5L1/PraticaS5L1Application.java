package it.epicode.praticaS5L1;

import it.epicode.praticaS5L1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PraticaS5L1Application {

	public static void main(String[] args) {

		SpringApplication.run(PraticaS5L1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PraticaS5L1Application.class);

		Menu m = (Menu) ctx.getBean("menu");
		m.printMenu();
		ctx.close();
	}

}
