package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    // Como aqui não é especificado o Bean a injectar com @Qualifier, é injectado o @Primary bean
    // Na injecção por construtor o uso da anotação @Autowired é opcional e não costuma usar-se
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayhello() {

        return greetingService.sayGreeting();
    }
}
