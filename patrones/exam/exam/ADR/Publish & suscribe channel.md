# Uso del Patrón Publish & Subscribe Channel para el Proyecto del Banco ABC

- **Fecha**: 7 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está construyendo un sistema para gestionar pagos de servicios públicos y otras operaciones financieras. El sistema necesita ser escalable y flexible, y debe permitir que múltiples componentes reaccionen a eventos sin un acoplamiento estrecho. El patrón "Publish & Subscribe Channel" se ha considerado para lograr una arquitectura orientada a eventos que permita la comunicación asíncrona entre componentes.

## Decisión
Se ha decidido utilizar el patrón "Publish & Subscribe Channel" para el sistema del Banco ABC. Este patrón permitirá que los eventos se publiquen en un canal y múltiples suscriptores puedan recibirlos y reaccionar, facilitando el desacoplamiento y la escalabilidad del sistema.

## Consecuencias
- **Positivas**:
    - **Desacoplamiento entre Emisores y Receptores**: Los emisores de eventos (publicadores) y los receptores (suscriptores) no necesitan conocerse, permitiendo una arquitectura más flexible y modular.
    - **Escalabilidad y Flexibilidad**: El patrón permite agregar o eliminar suscriptores sin afectar a los emisores, facilitando la escalabilidad del sistema.
    - **Procesamiento Asíncrono**: Los suscriptores pueden procesar eventos de forma asíncrona, mejorando la resiliencia y la capacidad de manejar picos de carga.
- **Negativas**:
    - **Complejidad Adicional**: El uso de canales de publicación y suscripción puede añadir complejidad al sistema, especialmente para gestionar la consistencia y la entrega de mensajes.
    - **Dificultad para Rastrear Eventos**: El flujo de eventos puede ser menos predecible, lo que dificulta el seguimiento y la depuración.
    - **Riesgo de Mensajes Perdidos**: Se necesita un mecanismo para garantizar la entrega confiable de mensajes y manejar errores.

## Alternativas Consideradas
1. **Comunicación Directa entre Componentes**: Se consideró la comunicación directa entre componentes, pero se descartó debido al acoplamiento y la falta de flexibilidad para agregar nuevos suscriptores.
2. **Event-Driven Architecture con Buses de Mensajería**: Aunque similar, se descartó porque se necesita un patrón que permita múltiples suscriptores por evento, lo cual es más fácilmente logrado con el patrón Publish & Subscribe Channel.
3. **Pipes & Filters**: Se consideró usar un patrón secuencial, pero se descartó porque no permite la comunicación asíncrona ni la flexibilidad para manejar eventos de múltiples fuentes.

## Justificación
El patrón "Publish & Subscribe Channel" fue elegido porque proporciona desacoplamiento y flexibilidad para una arquitectura orientada a eventos. Permite la comunicación asíncrona entre componentes, facilitando la escalabilidad y la resiliencia del sistema. Aunque añade cierta complejidad, los beneficios de un sistema más flexible y escalable justifican esta elección.

## Notas Adicionales
- El equipo deberá implementar mecanismos para asegurar la entrega confiable de mensajes y manejar posibles errores en la suscripción.
- Se recomienda el uso de herramientas de monitoreo para rastrear la entrega de mensajes y asegurar la consistencia del sistema.
- Se requerirán pruebas adicionales para garantizar que el patrón funcione según lo esperado bajo diferentes escenarios de carga y eventos.

## Referencias
- [Publish & Subscribe Pattern - Martin Fowler](https://martinfowler.com/articles/pattern-pubsub.html)
- [Understanding Publish/Subscribe Architecture](https://en.wikipedia.org/wiki/Publish%E2%80%93subscribe_pattern)