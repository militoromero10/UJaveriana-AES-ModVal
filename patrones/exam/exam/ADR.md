# Adopción de un Marco de Trabajo para Microservicios

- **Fecha**: 3 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El equipo está desarrollando un sistema grande y complejo que requiere alta escalabilidad y flexibilidad. Se consideraron diferentes arquitecturas, pero se determinó que una arquitectura de microservicios sería la mejor opción para cumplir con los requisitos del proyecto, que incluyen escalabilidad, flexibilidad y facilidad de implementación continua (CI/CD).

## Decisión
Adoptaremos un marco de trabajo para microservicios para implementar el sistema. El marco elegido es Spring Boot, que ofrece soporte robusto para microservicios, integración con otras tecnologías (como Kafka y Redis), y una comunidad activa. El marco también permite la integración con herramientas de desarrollo y despliegue que utilizamos actualmente.

## Consecuencias
- **Positivas**:
    - Escalabilidad: Los microservicios permiten escalar partes del sistema de forma independiente.
    - Flexibilidad: Permiten la implementación y actualización de servicios individuales sin afectar al resto del sistema.
    - Uso de tecnologías conocidas: Spring Boot es familiar para el equipo y facilita la adopción de microservicios.

- **Negativas**:
    - Complejidad de gestión: Los microservicios requieren mayor gestión y coordinación entre servicios.
    - Costes de infraestructura: Puede aumentar el costo de infraestructura debido a la necesidad de más recursos y herramientas de orquestación.
    - Latencia: La comunicación entre servicios puede introducir latencia adicional.

## Alternativas Consideradas
1. **Monolito Modular**: Se consideró una arquitectura monolítica modular, pero se desechó debido a la falta de flexibilidad para escalar componentes específicos.
2. **Arquitectura de N-capas**: También se evaluó una arquitectura de N-capas, pero no cumplía con los requisitos de escalabilidad y flexibilidad del proyecto.

## Justificación
La adopción de un marco para microservicios se justifica por las siguientes razones:
- El proyecto requiere alta escalabilidad y flexibilidad, lo que se logra con microservicios.
- El equipo tiene experiencia con Spring Boot, facilitando la implementación.
- El marco proporciona integración con otras herramientas y tecnologías utilizadas en el proyecto.

## Notas Adicionales
- La decisión fue discutida y aprobada por el equipo de arquitectura en la reunión del 29 de abril de 2024.
- Se requerirá capacitación adicional para el equipo en el uso y gestión de microservicios.
- Se planea una revisión de la arquitectura cada 6 meses para evaluar el rendimiento y realizar ajustes si es necesario.

## Referencias
- [Documentación de Spring Boot](https://spring.io/projects/spring-boot)
- Artículo: "Microservices: A Practical Guide" (2023)