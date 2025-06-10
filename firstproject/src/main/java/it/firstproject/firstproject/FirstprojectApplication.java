package it.firstproject.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.firstproject.firstproject.services.JeegService;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		/** APPLICATION CONTEXT */
		/** Chiama la classe di configurazione degli oggetti */
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		/** Ottiene il bean di jeeg dalla classe dichiarata nel contesto */
		/*
		 * Lo ottiene tramite la stringa nome e richiede come tipo di oggetto la classe.
		 */
		/*
		 * Jeeg jeeg = context.getBean("jeeg", Jeeg.class);
		 * System.out.println(jeeg);
		 */

		/** ESEMPIO DI PROTOTYPE E SINGLETON */
		/* Arm armSx = context.getBean("armSx", Arm.class); */
		/*
		 * Se non si usa il prototype, va a richiamare l'oggetto già costruito.
		 */
		/*
		 * System.out.println(jeeg.getArmSx());
		 * System.out.println(armSx);
		 */
		/*
		 * Output caso SINGLETON:
		 * Arm@1cf0cacc
		 * Arm@1cf0cacc
		 * Output caso PROTOTYPE:
		 * Arm@4f5b08d
		 * Arm@529c2a9a
		 */

		JeegService services = context.getBean("jeegService", JeegService.class);
		services.attack();
		services.move();
	}

}
