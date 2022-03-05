package guru.springframework.sfgdi.services.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Demonstração dos vários hooks e eventos do ciclo de vida de um Bean
 * Normalmente não é necessário mexer em nada disto
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## LifeCycleDemoBean's constructor has been called");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleDemoBean has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## LifeCycleDemoBean bean factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## LifeCycleDemoBean name is now set as: " + name);
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## LifeCycleDemoBean is now set in Application Context");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## LifeCycleDemoBean's @PostConstruct annotated method has been called");
    }

    @PreDestroy
    public void preDestoy() {
        System.out.println("## LifeCycleDemoBean's @PreDestroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("## Before Init - called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## After Init - called by Bean Post Processor");
    }
}
