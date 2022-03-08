package guru.springframework.sfgdi.services.beanscope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Creating a Singleton Bean");
    }

    public String getMyScope() {
        return "I'm a Singleton Bean";
    }
}
