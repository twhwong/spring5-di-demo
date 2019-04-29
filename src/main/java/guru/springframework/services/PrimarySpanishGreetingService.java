package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 29-04-19
 *
 * @author Tom
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        // Saludos desde el Servicio Primario
        return "Hola - Servicio de saludo primario";
    }

}
