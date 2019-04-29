package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * 28-03-19
 *
 * @author Tom
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    public static  final String HELLO_GURUS = "Hello Gurus !!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
