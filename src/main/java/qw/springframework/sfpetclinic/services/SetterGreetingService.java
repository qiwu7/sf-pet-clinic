package qw.springframework.sfpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    public static final String HELLO_WORLD= "Hello - I was injected by the setter";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
