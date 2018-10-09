package qw.springframework.sfpetclinic.services;

public class PrimaryGreetingServiceGerman implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimaryGreetingServiceGerman(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
