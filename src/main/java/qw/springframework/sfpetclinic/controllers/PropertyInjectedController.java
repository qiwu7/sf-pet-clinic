package qw.springframework.sfpetclinic.controllers;

import qw.springframework.sfpetclinic.services.GreetingServiceImpl;

/**
 * This is bad example. Do NOT follow this pattern
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
