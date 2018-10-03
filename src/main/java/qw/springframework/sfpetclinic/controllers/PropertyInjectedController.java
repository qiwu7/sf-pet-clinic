package qw.springframework.sfpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import qw.springframework.sfpetclinic.services.GreetingServiceImpl;

/**
 * This is bad example. Do NOT follow this pattern
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
