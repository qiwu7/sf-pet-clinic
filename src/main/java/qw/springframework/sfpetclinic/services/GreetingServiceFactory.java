package qw.springframework.sfpetclinic.services;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGreetingServiceGerman(greetingRepository);
            case "es":
                return new PrimaryGreetingServiceSpanish(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
