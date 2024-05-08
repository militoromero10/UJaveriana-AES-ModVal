# Elección de Micronaut para la Construcción de Funciones Serverless

- **Fecha**: 6 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El proyecto requiere construir funciones serverless para la arquitectura de backend, permitiendo una implementación eficiente y rápida en plataformas como AWS Lambda. El equipo busca un framework que ofrezca bajo tiempo de arranque, baja utilización de memoria y fácil integración con servicios de la nube. Se evaluaron diferentes opciones para encontrar el framework que mejor se adapte a estos requisitos.

## Decisión
Se ha decidido utilizar Micronaut para la construcción de funciones serverless (lambdas). Micronaut es un framework diseñado para aplicaciones de microservicios y serverless que ofrece tiempos de arranque rápidos, bajo consumo de memoria y un conjunto robusto de herramientas para el desarrollo y despliegue de funciones serverless.

## Consecuencias
- **Positivas**:
    - **Tiempo de Arranque Rápido**: Micronaut está optimizado para tiempos de arranque rápidos, lo que es esencial para funciones serverless. Particularmente permite la inyección de dependencias en tiempo de compilación y no de ejecución.
    - **Bajo Consumo de Memoria**: El framework está diseñado para ser eficiente en el uso de memoria, reduciendo los costos de ejecución en plataformas serverless.
    - **Integración con Servicios de la Nube**: Micronaut ofrece herramientas para la integración con servicios de la nube como AWS Lambda, Azure Functions, y Google Cloud Functions.
    - **Desarrollo Basado en Anotaciones**: El uso de anotaciones simplifica el desarrollo y la configuración.
- **Negativas**:
    - **Curva de Aprendizaje**: Micronaut tiene una curva de aprendizaje para desarrolladores que no están familiarizados con el framework.
    - **Menos Soporte Comunitario que Spring Boot**: Aunque tiene una comunidad activa, Micronaut es menos conocido que otros frameworks como Spring Boot.

## Alternativas Consideradas
1. **Spring Boot**: Se descartó debido a su tiempo de arranque más lento y mayor consumo de memoria, lo que puede afectar el rendimiento de funciones serverless.
2. **Quarkus**: Se consideró, pero se descartó por menor madurez y menos herramientas integradas para la creación de funciones serverless.

## Justificación
Se eligió Micronaut porque ofrece un tiempo de arranque rápido, bajo consumo de memoria y herramientas integradas para el desarrollo de funciones serverless. Estas características son esenciales para el éxito del proyecto, ya que las funciones serverless deben ser eficientes y escalables.

## Notas Adicionales
- El equipo necesitará capacitación para familiarizarse con el framework y sus mejores prácticas.
- Se planearán pruebas de rendimiento para validar que las funciones serverless cumplen con los requisitos de eficiencia y escalabilidad.
- El uso de Micronaut también permitirá una fácil integración con otras herramientas y servicios de la nube.

## Referencias
- [Micronaut Documentation](https://micronaut.io/documentation/)
- [Micronaut Serverless Examples](https://micronaut.io/examples/)