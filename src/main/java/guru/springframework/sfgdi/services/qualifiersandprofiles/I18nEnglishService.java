package guru.springframework.sfgdi.services.qualifiersandprofiles;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService") // é possível especificar o nome com que o Bean será acrescentado no ApplicationContext
public class I18nEnglishService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
