# Combinación de Circuit Breaker y Retry con SQS/SNS y AWS Lambda para el Proyecto del Banco ABC

- **Fecha**: 7 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está desarrollando un sistema para pagos de servicios públicos y otras operaciones financieras. El sistema necesita ser resiliente y capaz de manejar errores transitorios, con la capacidad de reintentar operaciones fallidas sin sobrecargar el sistema. Para ello, se planea combinar los patrones Retry y Circuit Breaker para garantizar la confiabilidad y evitar fallos catastróficos. SQS y SNS se utilizarán para gestionar reintentos, mientras que el Circuit Breaker permitirá cortar el flujo si los reintentos fallan repetidamente.

## Decisión
Se ha decidido implementar una combinación de Retry y Circuit Breaker utilizando SQS/SNS y AWS Lambda. El patrón Retry permitirá reintentar operaciones fallidas, mientras que el Circuit Breaker se activará si se detectan fallos repetidos, cortando el flujo para evitar sobrecarga y propagación de errores.

## Consecuencias
- **Positivas**:
    - **Resiliencia Mejorada**: La combinación de Retry y Circuit Breaker mejora la resiliencia del sistema al permitir reintentos y cortar el flujo cuando hay fallos persistentes.
    - **Desacoplamiento y Flexibilidad**: Al usar SQS y SNS para reintentos, se facilita el desacoplamiento entre componentes, permitiendo mayor flexibilidad.
    - **Gestión Efectiva de Errores**: El Circuit Breaker evita la propagación de errores y el Retry permite reintentar operaciones sin afectar el sistema global.
- **Negativas**:
    - **Complejidad Adicional**: La combinación de Retry y Circuit Breaker puede añadir complejidad, especialmente en la configuración y el monitoreo.
    - **Latencia Potencial**: Los reintentos y la activación del Circuit Breaker pueden añadir latencia al sistema.
    - **Sobrecarga Operativa**: Reintentos excesivos o un Circuit Breaker mal configurado pueden generar sobrecarga en el sistema.

## Alternativas Consideradas
1. **Retry sin Circuit Breaker**: Se consideró usar solo Retry, pero se descartó porque no proporciona protección contra fallos persistentes o sobrecarga.
3. **Fallback Mechanisms**: Aunque proporciona una estrategia de respaldo, se descartó porque no maneja eficazmente los fallos transitorios ni evita la propagación de errores.

## Justificación
La combinación de Retry y Circuit Breaker proporciona resiliencia y flexibilidad para el sistema del Banco ABC. El Retry permite reintentar operaciones fallidas, mientras que el Circuit Breaker evita la sobrecarga y la propagación de errores cuando los fallos son persistentes. Esta combinación es esencial para un sistema financiero que requiere alta disponibilidad y resiliencia ante fallos transitorios.

## Notas Adicionales
- El equipo debe configurar cuidadosamente el Circuit Breaker para evitar activaciones prematuras y garantizar un flujo controlado de operaciones.
- Se recomienda monitorear el sistema para detectar signos de sobrecarga o fallos persistentes, ajustando la configuración según sea necesario.
- Se requerirán pruebas adicionales para asegurar que la combinación de Retry y Circuit Breaker funcione según lo esperado y mantenga la resiliencia del sistema.

## Referencias
- [Circuit Breaker Pattern - Martin Fowler](https://martinfowler.com/bliki/CircuitBreaker.html)
- [Retry Pattern - AWS Documentation](https://docs.aws.amazon.com/lambda/latest/dg/retries-on-errors.html)
