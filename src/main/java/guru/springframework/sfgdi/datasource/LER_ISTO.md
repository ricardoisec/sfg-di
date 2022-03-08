Há várias maneiras de passar variáveis a uma aplicação Spring
1) Argumentos de linha de comandos
2) SPRING_APPLICATION_JSON
3) JNDI - Java Naming and Directory Interface, um serviço externo que está em desuso
4) Variáveis de ambiente (particularmente indicadas para passwords / tokens)
5) Ficheiros de propriedades (ficheiros .property ou YAML)

As várias fontes de propriedades têm hierarquia, por ex:
Argumentos de linha de comandos > variáveis de ambiente > ficheiros de propriedades

Boas práticas:
Propriedades normais devem estar em application.properties ou application.yaml no JAR ou WAR
Propriedades que mudam com o perfil devem estar em ficheiros .properties ou .yaml de cada perfil
Em deployments deve ser feito override das propriedades relevantes com variáveis de ambiente