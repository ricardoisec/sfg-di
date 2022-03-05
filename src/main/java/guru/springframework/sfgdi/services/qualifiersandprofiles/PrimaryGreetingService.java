package guru.springframework.sfgdi.services.qualifiersandprofiles;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean";
    }
}
