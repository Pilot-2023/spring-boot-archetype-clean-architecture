# The Clean Architecture archetype using Spring Boot :telescope:
Maven archetype providing base code and modules following The Clean Architecture for Spring Boot microservices built by Pilot 2023.


## Libs :books:

This archetype uses the following libraries:

* [Lombok](https://projectlombok.org/features/) to auto-generate common and repetitive code (constructors, getters, setters, ...) 
* [MapStruct](https://mapstruct.org/) to auto-generate or facilitate mapping from class A to class B. Particularly useful while implementing DTO pattern.

All dependencies are specified at the [parent BOM](https://github.com/Pilot-2023/spring-boot-starter-parent).


## TODO :pencil2:

### Modules :pushpin:

The following list contains the modules to be developed, sorted by priority:

- [x] core (business logic)
- [x] entry point REST (to expose the API)
- [x] data provider No SQL (to store and fetch documents)
- [ ] data provider REST (to communicate with other services)
- [ ] entry point broker (to consume events/messages)
- [ ] data provider broker (to produce events/messages)
- [ ] data provider SQL (to store and fetch entities)

### Technical capabilities :triangular_ruler:

The following list contains technical capabilities to be developed, sorted by priority:

- [ ] enable HTTPS using a certificate
- [ ] logging
- [ ] authentication and authorization using an IdP
- [ ] enable SAGA