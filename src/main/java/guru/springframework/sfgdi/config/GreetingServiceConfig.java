package guru.springframework.sfgdi.config;

import com.outsideofmainpackage.services.PetService;
import com.outsideofmainpackage.services.PetServiceFactory;
import guru.springframework.sfgdi.services.injectiontypes.ConstructorGreetingService;
import guru.springframework.sfgdi.services.injectiontypes.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.injectiontypes.SetterInjectedGreetingService;
import guru.springframework.sfgdi.services.qualifiersandprofiles.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.qualifiersandprofiles.I18nSpanishGreetingService;
import guru.springframework.sfgdi.services.qualifiersandprofiles.PrimaryGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

// A anotação @ImportResource 'activa' a configuração por XML do ficheiro sfgdi-config.xml
// Esta anotação pode estar presente aqui ou no ficheiro da função 'main'
@ImportResource("classpath:sfgdi-config.xml")
@Configuration // marca esta classe como classe de configuração
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile({"cat"})
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    // Esta anotação foi comentada para que este serviço possa ser exemplo de configuração por XML no ficheiro sfgdi-config.xml
    // @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    // @Bean configura o PropertyInjectedGreetingService via código Java um serviço, ao invés de usar a anotação @Service
    // O nome do Bean pode ser especificado na anotação mas, por omissão, é o nome do método
    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Profile("EN")
    @Bean("i18nService") // O nome do Bean pode ser especificado na anotação
    I18nEnglishGreetingService i18nEnglishGreetingService() {
        return new I18nEnglishGreetingService();
    }

    @Profile({"ES", "default"})
    @Bean("i18nService") // O nome do Bean pode ser especificado na anotação
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }
}
