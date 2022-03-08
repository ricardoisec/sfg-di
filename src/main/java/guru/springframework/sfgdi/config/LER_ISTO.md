Há várias maneiras de configura uma aplicação em Spring.

A mais típica é usando ``@ComponentScan`` e anotações como ``@Service``, ``@Component``, ``@Controller``, etc.

Apesar de funcionar sem problemas, o scan de anotações é feito com recurso a Reflection o que pode atrasar o arranque da aplicação (e apenas o arranque) numa aplicação muito grande.

A configuração sem anotações também é útil para classes provenientes de terceiros, como a package das piadas do Chuck Norris.
