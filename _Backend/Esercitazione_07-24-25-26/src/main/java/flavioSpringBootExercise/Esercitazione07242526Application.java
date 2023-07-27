package flavioSpringBootExercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import godFather_s_Pizza.PizzaHawaiana;
import godFather_s_Pizza.PizzaMargherita;
import godFather_s_Pizza.PizzaSalame;
import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
public class Esercitazione07242526Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercitazione07242526Application.class, args);
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Esercitazione07242526Application.class);
		
		System.out.println(ctx.getBean("HelloW"));
		
		System.out.println();
		
		System.out.println(ctx.getBean("printMenu"));
		
	}

}
