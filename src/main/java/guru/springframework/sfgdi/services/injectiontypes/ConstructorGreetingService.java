package guru.springframework.sfgdi.services.injectiontypes;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor service";
    }
}
