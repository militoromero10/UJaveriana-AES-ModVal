# Adopción de Arquitectura Orientada a Eventos para el Proyecto del Banco ABC

- **Fecha**: 7 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está construyendo un sistema para gestionar pagos de servicios públicos y otras operaciones financieras. El sistema necesita ser escalable, modular y capaz de manejar grandes volúmenes de transacciones en tiempo real. La arquitectura orientada a eventos se considera adecuada para este contexto, permitiendo la comunicación asíncrona entre componentes y el manejo eficiente de eventos.

Se sabe que la rotación de personal es la normal dentro de la industria y que el impacto de la misma ya es conocida y manejada por la PMO. 
También se sabe que el Banco ABC tiene sus partners ya identificados, a trabajado anteriormente en distintos proyectos donde se han tercerizado diferentes accesos a plataformas web, core, siempre siguiendo lo lineamientos del banco. Por lo que estos partners tienes conocimiento del dominio de negocio del banco. En otras palabras, Resumidamente, el banco podría realizar la ejecución de cualquier proyecto mientras este sea viable. Por lo que una alta carga operativa y administrativa que requiera una escalabilidad organizacional no representaría un mayor reto.
## Decisión
Se ha decidido adoptar una arquitectura orientada a eventos para el sistema del Banco ABC. Esto permitirá que los componentes del sistema reaccionen a eventos generados por otros componentes, facilitando el desacoplamiento y la escalabilidad.

## Consecuencias
- **Positivas**:
    - **Escalabilidad y Flexibilidad**: La arquitectura orientada a eventos permite escalabilidad y flexibilidad al permitir que los componentes se comuniquen de forma asíncrona y desacoplada.
    - **Desacoplamiento entre Componentes**: Los componentes no están directamente conectados, sino que se comunican a través de eventos, lo que facilita la evolución y el mantenimiento del sistema.
    - **Resiliencia**: El uso de eventos y mecanismos asíncronos puede mejorar la resiliencia del sistema, permitiendo el manejo de picos de carga y fallos en componentes individuales.
- **Negativas**:
    - **Complejidad Adicional**: La arquitectura orientada a eventos puede ser más compleja de implementar y requiere un mecanismo para gestionar eventos y asegurar la consistencia.
    - **Dificultad para Rastrear Flujos de Datos**: El flujo de datos puede ser menos predecible, lo que dificulta el seguimiento y la depuración.
    - **Riesgo de Overhead Operativo**: La gestión de eventos y la asíncronía pueden generar overhead operativo y requerir monitoreo adicional.

## Alternativas Consideradas
1. **Arquitectura Monolítica**: Se descartó debido a la falta de escalabilidad y desacoplamiento. No sería capaz de manejar grandes volúmenes de transacciones con flexibilidad.
2. **Arquitectura en Capas**: Se consideró pero se descartó porque, aunque proporciona modularidad, no ofrece la misma escalabilidad y flexibilidad que una arquitectura orientada a eventos.
3. **Microservicios Sin Event-Driven**: Se evaluó un enfoque de microservicios sin arquitectura orientada a eventos, pero se descartó por la falta de comunicación asíncrona y flexibilidad para manejar eventos.

## Justificación
La arquitectura orientada a eventos proporciona la flexibilidad y escalabilidad necesarias para el sistema del Banco ABC. Permite la comunicación asíncrona entre componentes, mejora la resiliencia y facilita el desacoplamiento, lo que es crucial para un sistema que maneja operaciones financieras y pagos de servicios públicos. Aunque añade complejidad, el beneficio de tener un sistema escalable y flexible justifica la decisión.

## Notas Adicionales
- El equipo deberá implementar mecanismos para gestionar eventos y asegurar la consistencia entre componentes.
- Se recomienda usar herramientas de monitoreo y rastreo para mantener la observabilidad y facilitar la depuración.
- Se requerirán pruebas adicionales para asegurar que la arquitectura orientada a eventos se comporte según lo esperado bajo cargas elevadas.

## Referencias
- [Event-Driven Architecture - Martin Fowler](https://martinfowler.com/articles/evendDriven.html)
- [Introduction to Event-Driven Architecture](https://en.wikipedia.org/wiki/Event-driven_architecture)