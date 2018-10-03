package qw.springframework.sfpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGreetingServiceGerman implements GreetingService {
    public static final String HELLO_WORLD= "Hallo - Erster Grußdienst";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
