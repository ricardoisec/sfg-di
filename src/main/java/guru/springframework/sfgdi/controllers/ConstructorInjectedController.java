package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    // @Autowired socilita a injecção de um Bean

    // @Qualifier especifica qual é o Bean que queremos que seja injectado quando há mais do que um possível
    // @Autowired // Na injecção por construtor o uso da anotação @Autowired é opcional e não costuma usar-se
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
