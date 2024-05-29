# Adopción de un Enfoque RESTful para la Implementación del Sistema 

- **Fecha**: 6 de mayo de 2024
- **Estado**: Aprobado

## Contexto 

El equipo está desarrollando un sistema grande y complejo que requiere alta escalabilidad y flexibilidad. Se consideraron diferentes enfoques arquitectónicos, y se determinó que un enfoque RESTful sería la mejor opción para cumplir con los requisitos del proyecto, que incluyen escalabilidad, flexibilidad y facilidad de implementación continua (CI/CD). 

## Decisión 

Adoptaremos un enfoque RESTful para implementar el sistema. Este enfoque permitirá la construcción de servicios web que sigan los principios REST, lo que facilitará la escalabilidad, la interoperabilidad y el mantenimiento del sistema. Además, aprovecharemos frameworks para la implementación de servicios RESTful, dado su soporte robusto, integración con otras tecnologías y una comunidad activa. 

## Consecuencias 

- **Positivas**:

- **Escalabilidad**: El enfoque RESTful permite escalar partes del sistema de forma independiente. 

- **Flexibilidad**: Permite la implementación y actualización de servicios individuales sin afectar al resto del sistema. 

- **Uso de tecnologías conocidas**: El framework de desarrollo es familiar para el equipo y facilita la adopción de servicios RESTful.  

- **Negativas**:

- **Complejidad de gestión**: La gestión y coordinación entre servicios puede ser más compleja en un entorno RESTful. 

- **Costes de infraestructura**: Puede haber un aumento en los costos de infraestructura debido a la necesidad de más recursos para manejar las solicitudes REST.

- **Latencia**: La comunicación a través de servicios REST puede introducir latencia adicional en comparación con arquitecturas monolíticas. 

## Alternativas Consideradas 

Arquitectura Monolítica: Se consideró una arquitectura monolítica, pero se descartó debido a su falta de flexibilidad para escalar y mantener el sistema. 

Arquitectura de Microservicios: Se evaluó la arquitectura de microservicios, pero se decidió que un enfoque RESTful era más adecuado para cumplir con los requisitos del proyecto. 

## Justificación

La adopción de un enfoque RESTful se justifica por las siguientes razones: 

El proyecto requiere alta escalabilidad y flexibilidad, lo que se logra con un enfoque RESTful. 

El equipo tiene experiencia con tecnologías como Spring Boot, lo que facilitará la implementación de servicios RESTful. 

El enfoque RESTful permite la integración con otras herramientas y tecnologías utilizadas en el proyecto. 

## Notas Adicionales

Se requerirá capacitación adicional para el equipo en el diseño y desarrollo de servicios RESTful. 