Estes serviços estão aqui, numa package fora da package default, para ilustrar a forma como Spring detecta packages.

Para que estes serviços sejam encontrados é necessário definir, na main class:

```@ComponentScan(basePackages = {"guru.springframework.sfgdi", "com.outsideofmainpackage"})```

Na função .main() é necessário usar @ComponentScan para fazer faz override ao scan default de Spring e permite especificar todas as packages onde procurar Beans

Se esta anotação não existir Spring só procura Beans na package (e subpackages) onde estiver esta função .main() e estes serviços não seriam encontrados.