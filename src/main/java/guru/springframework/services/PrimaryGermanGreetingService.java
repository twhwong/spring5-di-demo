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
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo - Hauptgrußdienst";
    }

}
