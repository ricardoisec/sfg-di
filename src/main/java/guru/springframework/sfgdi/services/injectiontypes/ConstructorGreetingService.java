package guru.springframework.sfgdi.services.injectiontypes;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

// Esta anotação foi desligada para permitir que este serviço fosse configurado via Java na package 'config'
// Quando não se pretende fazer configurações manuais via Java deve usar-se a anotação
//@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor service";
    }
}
