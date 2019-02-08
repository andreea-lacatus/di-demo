package guru.springframework.didemo.controllers;

import guru.springframework.didemo.controllers.SetterInjectedController;
import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUP() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() throws Exception {
        assertEquals(GreetingServiceImpl.HALLO_GURUS, setterInjectedController.sayHallo());
    }
}
