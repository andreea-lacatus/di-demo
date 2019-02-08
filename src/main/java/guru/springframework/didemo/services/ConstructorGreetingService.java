package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hallo! I was injected by the constructor!";
    }
}
