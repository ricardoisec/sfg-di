package guru.springframework.sfgdi.services.qualifiersandprofiles;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"}) // este será o bean a injectar no profile ES e no profile default
@Service("i18nService") // é possível especificar o nome com que o Bean será acrescentado no ApplicationContext
public class I18nSpanishService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
