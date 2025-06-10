package it.firstproject.firstproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.firstproject.firstproject.models.Arm;
import it.firstproject.firstproject.models.Jeeg;
import it.firstproject.firstproject.models.Leg;

/* ANNOTAZIONE X FILE DI CONFIGURAZIONE */
@Configuration
/*  */
@ComponentScan("it.firstproject.firstproject")
public class AppConfig {

    @Bean(name = "jeeg")
    public Jeeg getJeeg() {
        /** Richiamo ai metodi dei bean che restituiscono gli oggetti */
        System.out.println("Sto creando jeeg...");
        return new Jeeg(getArmSx(), getArmDx(), getLegSx(), getLegDx());

    }

    @Bean(name = "armSx")
    @Scope("prototype")
    public Arm getArmSx() {
        System.out.println("Attacco braccio sinistro...");
        return new Arm(Side.Sx);
    }

    @Bean(name = "armDx")
    public Arm getArmDx() {
        System.out.println("Monto braccio destro...");
        return new Arm(Side.Dx);
    }

    @Bean(name = "legSx")
    public Leg getLegSx() {
        System.out.println("Avvito gamba sinistra...");
        return new Leg(Side.Sx);
    }

    @Bean(name = "legDx")
    public Leg getLegDx() {
        System.out.println("Infine la gamba destra...");
        return new Leg(Side.Dx);
    }
}
