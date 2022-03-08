O scope dos Beans é configurável e pode definir-se de 3 maneiras:

1) Com anotações ``@Scope``
2) Nos ficheiros de configuração Java com a anotação ``@Scope``
3) Nos ficheiros de configuração XML com o atributo ``scope`` nas tags ``bean``

Os vários tipos de scope são:

``@Singleton (default)``
Apenas uma instância de um Bean é criada no contentor IoC e essa instância será usada sempre que alguma classe a requisitar
Por ser a default não é necessário anotar as classes com esta anotação.

``@Prototype``
Uma nova instância é criada sempre que o Bean for requisitado

``@Request``
É criada uma nova instância do Bean por cada request HTTP

``@Session``
É criada uma nova instância do Bean por cada sessão HTTP

``@Global-Session``
É criada uma nova instância do Bean por cada sessão global (o que quer que isso seja)

``@Application``
É criada uma nova instância do Bean por cada ciclo de vida da ServletContext

``@Websocket``
É criada uma nova instância do Bean por cada ciclo de vida do WebSocket

``@Custom``
O scope é definível de forma granular e extensível através da interface Scope