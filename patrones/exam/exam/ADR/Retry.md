# Implementación del Patrón Retry con SQS/SNS y AWS Lambda para el Proyecto del Banco ABC

- **Fecha**: 7 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está implementando un sistema para gestionar pagos de servicios públicos y otras operaciones financieras, utilizando arquitectura serverless con AWS Lambda. Debido a la naturaleza distribuida del sistema y las posibles fallas temporales, se necesita un mecanismo para manejar errores transitorios y asegurar la confiabilidad del sistema. El uso de SQS y SNS, junto con AWS Lambda, se ha considerado para implementar el patrón Retry y gestionar automáticamente los reintentos de operaciones fallidas.

El banco tiene las capacidades de ejecución de proyectos, tienen un equipo de arquitectura competente y en caso de necesitar escalar lo hacen con equipos terceros de un grupo de empresas contratistas que ya tienen aprobadas y con las cuales solo tendrían que negociar alcance de proyecto. Resumidamente, el banco podría realizar la ejecución de cualquier proyecto mientras este sea viable
## Decisión
Se ha decidido implementar el patrón Retry utilizando Amazon SQS, Amazon SNS y AWS Lambda. Cuando una operación en Lambda falla, el evento será reenviado a través de SQS o SNS, permitiendo reintentos automáticos con un intervalo de tiempo determinado y controlando el número de reintentos permitidos.

## Consecuencias
- **Positivas**:
    - **Gestión de Errores Transitorios**: El patrón Retry permite gestionar errores transitorios reintentando automáticamente las operaciones, mejorando la confiabilidad del sistema.
    - **Desacoplamiento y Escalabilidad**: Al usar SQS y SNS para reintentos, se facilita el desacoplamiento entre componentes, permitiendo mayor flexibilidad y escalabilidad.
    - **Configuración Flexible de Reintentos**: Se puede configurar el número de reintentos y el intervalo entre ellos para adaptarse a las necesidades del sistema.
- **Negativas**:
    - **Complejidad Adicional**: La implementación del patrón Retry con SQS/SNS puede añadir complejidad, especialmente para manejar reintentos y evitar bucles infinitos.
    - **Sobrecarga Operativa**: El uso de reintentos puede aumentar la carga en el sistema si no se gestiona adecuadamente.
    - **Latencia Potencial**: El reintento de operaciones puede introducir latencia adicional, especialmente si se permite un alto número de reintentos.

## Alternativas Consideradas
1. **Retry en el Código**: Se consideró implementar el patrón Retry directamente en el código de Lambda, pero se descartó porque puede llevar a acoplamiento y no proporciona la flexibilidad de usar SQS/SNS.
2. **Retry con Almacenamiento Local**: Se descartó porque podría generar inconsistencias y problemas de sincronización.
3. **No Implementar Retry**: Se descartó porque la falta de reintentos puede llevar a una alta tasa de fallos y pérdida de confiabilidad del sistema.

## Justificación
La implementación del patrón Retry con SQS/SNS y AWS Lambda se justifica por la flexibilidad y escalabilidad que ofrece. Al usar servicios de colas y notificaciones, se puede gestionar automáticamente los reintentos y desacoplar componentes para mejorar la confiabilidad del sistema. Aunque añade cierta complejidad, el beneficio de tener un sistema más resiliente y capaz de manejar errores transitorios justifica esta elección.

## Notas Adicionales
- Se requiere una configuración cuidadosa del número de reintentos y el intervalo entre ellos para evitar bucles infinitos y sobrecarga.
- Se recomienda el uso de herramientas de monitoreo para rastrear el rendimiento del sistema y detectar problemas relacionados con reintentos.
- El equipo debe implementar mecanismos para evitar reintentos excesivos y manejar fallos persistentes de manera controlada.

## Referencias
- [Amazon SQS - Retry Policy](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-retry-policy.html)
- [AWS Lambda - Retry Strategy](https://docs.aws.amazon.com/lambda/latest/dg/retries-on-errors.html)