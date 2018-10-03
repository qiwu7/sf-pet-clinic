package qw.springframework.sfpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    public static final String HELLO_WORLD= "Hello - Primary Greeting service";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
