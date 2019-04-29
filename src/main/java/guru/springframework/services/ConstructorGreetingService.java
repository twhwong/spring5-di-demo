package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * 29-04-19
 *
 * @author Tom
 */
@Service
public class ConstructorGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the constructor";
    }

}
