package guru.springframework.sfgdi.services.qualifiersandprofiles;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;



// Esta anotação foi desligada para permitir que este serviço fosse configurado via Java na package 'config'
// Quando não se pretende fazer configurações manuais via Java deve usar-se a anotação
//@Service
// A anotação @Primary também pode ser removida porque está presente na configuração via Java
//@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean";
    }
}
