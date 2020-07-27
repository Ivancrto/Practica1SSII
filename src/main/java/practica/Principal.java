package practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



/**
 *
 * Clase principal
 * @author Lara Camila Sánchez Correa
 * @author Iván Conde Carretero
 *
 */
@SpringBootApplication
public class Principal {
    public static void main( String[] args )
    {
        SpringApplication.run(Principal.class, args);

    }
}
