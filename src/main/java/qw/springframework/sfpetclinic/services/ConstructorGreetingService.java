package qw.springframework.sfpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    public static final String HELLO_WORLD= "Hello - I was injected by the constructor";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
