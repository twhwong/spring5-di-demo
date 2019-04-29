package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 25-04-19
 *
 * @author Tom
 */
public class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @Before
    public void setUp() {
        this.propertyInjectionController = new PropertyInjectionController();
        this.propertyInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
//        System.out.println(GreetingServiceImpl.HELLO_GURUS);
//        System.out.println(propertyInjectionController.sayHello());
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectionController.sayHello());
    }
}