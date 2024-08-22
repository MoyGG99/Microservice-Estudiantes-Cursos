Proyecto de Microservicios

Descripción

Este proyecto consiste en una arquitectura de microservicios que utiliza Spring Boot y Spring Cloud para construir una aplicación distribuida y escalable.

Microservicios

- msvc-gateway: Gateway de API que actúa como punto de entrada para las solicitudes y enruta las peticiones a los microservicios correspondientes.
- msvc-course: Microservicio que gestiona la lógica de negocio relacionada con los cursos.
- msvc-user: Microservicio que gestiona la lógica de negocio relacionada con los usuarios.
- msvc-eureka: Administración de microservicios en el servidor.
- msvc-config: configuracion general del proyecto, donde se juntan todas las configuraciones de los microservicios.

Tecnologías utilizadas

- Spring Boot
- Spring Cloud
- Netflix Eureka (registro de servicios)
- Spring Cloud Gateway (gateway de API)
- Maven (gestión de dependencias)
- Hibernate
- Mysql
