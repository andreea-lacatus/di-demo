package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hallo! I was injected by the setter!";
    }
}
