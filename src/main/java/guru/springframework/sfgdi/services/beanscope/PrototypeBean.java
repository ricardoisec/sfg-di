package guru.springframework.sfgdi.services.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype") // Estas duas anotações são equivalentes, usa-se a que se gostar mais
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Creating a Prototype Bean");
    }

    public String getMyScope() {
        return "I'm a Prototype Bean";
    }
}
