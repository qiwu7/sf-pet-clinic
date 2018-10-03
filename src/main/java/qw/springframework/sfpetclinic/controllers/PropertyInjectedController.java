package qw.springframework.sfpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import qw.springframework.sfpetclinic.services.GreetingService;

/**
 * This is bad example. Do NOT follow this pattern
 */
@Controller
public class PropertyInjectedController {

    // Use reflection to allow Spring to find the bean with property name
    // But there might be unintended side effects. So be explicit and NOT
    // use this trick.
    @Autowired
    // @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
