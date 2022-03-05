package guru.springframework.sfgdi.services.injectiontypes;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter injected service";
    }
}
