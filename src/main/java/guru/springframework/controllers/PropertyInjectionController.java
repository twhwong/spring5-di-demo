package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * 28-03-19
 *
 * @author Tom
 * Just an example. You should not use property injection
 * Example of DI without the Spring Framework
 */
@Controller
public class PropertyInjectionController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;
//    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

//    public GreetingServiceImpl getGreetingService() {
//        return greetingService;
//    }

}
