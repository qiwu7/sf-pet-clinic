package qw.springframework.sfpetclinic.services;

public class PrimaryGreetingServiceSpanish implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimaryGreetingServiceSpanish(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
