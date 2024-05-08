# Uso de Event Sourcing con Snapshots Periódicos para el Proyecto del Banco ABC

- **Fecha**: 6 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está implementando un sistema para pagos de servicios públicos a través de múltiples canales. 
El sistema debe mantener un registro completo de los eventos que afectan su estado para facilitar la 
auditoría y la consistencia. Sin embargo, la reconstrucción del estado puede ser costosa si hay un gran 
volumen de eventos (transacciones). Para mitigar esto, se ha considerado la combinación de Event Sourcing con snapshots 
periódicos.

Se resalta que el proyecto de pago de servicios de convenios permite al Banco ABS
tener fidelidad de clientes y aumentar su portafolio de servicios. Esto,
es aquello que diferencia al banco de sus competidores.

## Decisión
Se ha decidido utilizar Event Sourcing con snapshots periódicos para el sistema. 
Los eventos se registrarán de forma continua, permitiendo la trazabilidad y la reconstrucción del estado, 
pero también se crearán snapshots a intervalos regulares para reducir el tiempo de recuperación y 
mejorar la eficiencia.




## Consecuencias
- **Positivas**:
    - **Trazabilidad Completa**: Event Sourcing permite rastrear el historial completo del sistema, facilitando la auditoría y el análisis de eventos.
    - **Recuperación Rápida del Estado**: Los snapshots periódicos reducen el tiempo de reconstrucción del estado, permitiendo una recuperación más rápida en caso de fallo.
    - **Consistencia Eventual**: Al tener snapshots, la consistencia eventual se puede mantener con menos sobrecarga en la reconstrucción.
- **Negativas**:
    - **Consumo de Almacenamiento**: Almacenar eventos y snapshots requiere más espacio de almacenamiento.
    - **Complejidad de Implementación**: La combinación de Event Sourcing y snapshots añade complejidad, ya que requiere una lógica para gestionar la creación y el uso de snapshots.
    - **Gestión de Snapshots**: Se necesita un mecanismo para determinar la frecuencia de los snapshots y cómo usarlos para reconstruir el estado.

## Alternativas Consideradas
1. **Solo Event Sourcing**: Se consideró usar únicamente Event Sourcing, pero se descartó debido a la sobrecarga de reconstrucción del estado a partir de una gran cantidad de eventos.
2. **Estado Directo con Logs**: Se evaluó mantener solo el estado actual y usar logs para transacciones, pero se descartó porque no proporciona la trazabilidad necesaria para el proyecto.

## Justificación
La combinación de Event Sourcing y snapshots periódicos permite tener lo mejor de ambos mundos: trazabilidad completa y recuperación rápida del estado. El uso de snapshots reduce el tiempo de reconstrucción y mejora la eficiencia, mientras que Event Sourcing proporciona la capacidad de rastrear y auditar eventos. Aunque añade cierta complejidad, el beneficio de tener un sistema más robusto y eficiente justifica esta decisión.

## Notas Adicionales
- El equipo debe desarrollar un plan para la creación y almacenamiento de snapshots, considerando la frecuencia y el mecanismo para su uso.
- Se recomienda implementar herramientas de monitoreo para rastrear la creación de snapshots y detectar posibles problemas en el manejo de eventos.
- Se necesitarán pruebas adicionales para garantizar que los snapshots se utilizan correctamente y que el sistema mantiene la consistencia eventual.

## Referencias
- [Event Sourcing - Martin Fowler](https://martinfowler.com/eaaDev/EventSourcing.html)
- [Event Sourcing with Snapshots](https://docs.microsoft.com/en-us/azure/architecture/patterns/event-sourcing-snapshots)
- [Preguntas al profesor](https://github.com/militoromero10/UJaveriana-AES-ModVal/tree/master/patrones/exam/exam/ADR/ref/preguntas.pdf)