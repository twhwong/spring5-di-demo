package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 29-04-19
 *
 * @author Tom
 */
public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setup() {
        getterInjectedController = new GetterInjectedController();
        getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }

}