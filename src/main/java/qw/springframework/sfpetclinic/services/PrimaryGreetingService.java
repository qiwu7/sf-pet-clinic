package qw.springframework.sfpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en", "default"})
@Primary
public class PrimaryGreetingService implements GreetingService {
    public static final String HELLO_WORLD= "Hello - Primary Greeting service";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
