package guru.springframework.sfgdi.services.qualifiersandprofiles;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Esta anotação foi desligada para permitir que este serviço fosse configurado via Java na package 'config'
// Quando não se pretende fazer configurações manuais via Java deve usar-se a anotação
//@Service("i18nService") // é possível especificar o nome com que o Bean será acrescentado no ApplicationContext
// A anotação @Profile também pode ser removida porque está presente na configuração via Java
//@Profile("EN")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
