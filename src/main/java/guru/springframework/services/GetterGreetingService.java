package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * 25-04-19
 *
 * @author Tom
 */
@Service
public class GetterGreetingService implements GreetingService {

    // Note: it should be setter injection and not getter injection!
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
