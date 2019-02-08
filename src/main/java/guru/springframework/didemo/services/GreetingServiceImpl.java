package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HALLO_GURUS = "Hallo Gurus!!!";

    @Override
    public String sayGreetings(){
        return HALLO_GURUS;
    }

}
