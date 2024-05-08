# Uso del Estilo de Mensajería Asíncrona para el Proyecto del Banco ABC

- **Fecha**: 7 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está desarrollando un sistema para gestionar pagos de servicios públicos y otras operaciones financieras. El sistema necesita ser escalable y resiliente (se considera la posibilidad de ser antifrágil), y debe permitir la comunicación entre componentes distribuidos. El estilo de mensajería asíncrona se ha considerado para abordar estos requisitos, permitiendo la comunicación entre componentes sin una fuerte dependencia temporal.

## Decisión
Se ha decidido implementar el estilo de mensajería asíncrona para el sistema del Banco ABC. Los componentes se comunicarán mediante mensajes asíncronos a través de colas, permitiendo la interacción sin necesidad de sincronización temporal estricta.

## Consecuencias
- **Positivas**:
    - **Desacoplamiento y Flexibilidad**: La mensajería asíncrona desacopla los componentes, permitiendo que cada uno funcione de forma independiente sin esperar una respuesta inmediata.
    - **Escalabilidad**: El estilo de mensajería asíncrona facilita el escalado, ya que los componentes pueden trabajar de forma asíncrona, reduciendo los cuellos de botella.
    - **Resiliencia**: Los mensajes se almacenan en colas, proporcionando tolerancia a fallos y permitiendo la recuperación ante fallos temporales.
    - **Antifragilidad**: Si se monitorizan y registran los fallos temporales, el uso de Mensjería asíncrona brinda la posibilidad de estudiar las causas de estos fallos y permite al equipo adaptar el sistema para futuros eventos.

- **Negativas**:
    - **Complejidad Adicional**: La mensajería asíncrona puede añadir complejidad al sistema, especialmente para garantizar la consistencia y la gestión de errores.
    - **Dificultad para Rastrear Flujos de Datos**: La naturaleza asíncrona puede dificultar el seguimiento y la depuración del flujo de datos.
    - **Latencia Potencial**: Aunque la comunicación es asíncrona, puede haber latencia adicional debido a la naturaleza de las colas y la espera de procesamiento.

## Alternativas Consideradas
1. **Comunicación Síncrona**: Se consideró la comunicación síncrona entre componentes, pero se descartó debido a la falta de flexibilidad y desacoplamiento.

## Justificación
Se eligió el estilo de mensajería asíncrona porque proporciona desacoplamiento, flexibilidad, escalabilidad y potencial de antigrafilidad para sistemas distribuidos. Esto es esencial para el sistema del Banco ABC, que debe gestionar operaciones financieras y pagos de servicios públicos de forma resiliente y escalable. Aunque añade cierta complejidad, el beneficio de tener un sistema flexible y tolerante a fallos justifica esta elección.

## Notas Adicionales
- Se necesitarán herramientas de monitoreo para rastrear el rendimiento del sistema y detectar posibles cuellos de botella en las colas de mensajes.
- El equipo deberá diseñar mecanismos de gestión de errores para garantizar la consistencia y la recuperación en caso de fallos.
- Se recomienda realizar pruebas de carga para asegurar que la arquitectura asíncrona funcione correctamente bajo diferentes escenarios de carga.

## Referencias
- [Asynchronous Messaging - Martin Fowler](https://martinfowler.com/articles/evendDriven.html#asynchronous)
- [Building Distributed Systems with Asynchronous Messaging](https://docs.microsoft.com/en-us/azure/architecture/patterns/asynchronous-messaging)
- [Preguntas al profesor](https://github.com/militoromero10/UJaveriana-AES-ModVal/tree/master/patrones/exam/exam/ADR/ref/preguntas.pdf)