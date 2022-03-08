package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PetController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import guru.springframework.sfgdi.services.beanscope.PrototypeBean;
import guru.springframework.sfgdi.services.beanscope.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// @ComponentScan faz override ao scan default de Spring e permite especificar todas as packages onde procurar Beans
// Se esta anotação não existir Spring só procura Beans na package (e subpackages) onde estiver esta função .main()
// Se se usar configuração via Java (cf. package 'config') esta anotação deixa de ser necessária
@ComponentScan(basePackages = {"guru.springframework.sfgdi", "com.outsideofmainpackage"})
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());

        // Apesar do nome do classe ser 'MyController' o bean é inserido no ApplicationContext como 'myController'
        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------ Primary bean injection");
        System.out.println(myController.sayhello());

        System.out.println("------ Property injection");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------ Setter injection");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------ Constructor injection");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("------ I18n controller");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("------ Bean scopes");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println("Singleton bean 1 scope: " + singletonBean1.getMyScope());
        SingletonBean singletonBean2 = ctx.getBean((SingletonBean.class));
        System.out.println("Singleton bean 2 scope: " + singletonBean2.getMyScope());

        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println("Prototype bean 1 scope: " + prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println("Prototype bean 2 scope: " + prototypeBean2.getMyScope());

    }
}
