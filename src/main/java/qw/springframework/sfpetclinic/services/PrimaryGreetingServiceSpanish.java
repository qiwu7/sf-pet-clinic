package qw.springframework.sfpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimaryGreetingServiceSpanish implements GreetingService {
    public static final String HELLO_WORLD= "Hola - Servicio de saludo primario";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
