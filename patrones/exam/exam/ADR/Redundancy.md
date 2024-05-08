# Redundancia de Datos en banco aliado para el Proyecto del Banco ABC

- **Fecha**: 7 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está implementando un sistema para gestionar pagos de servicios públicos y otras operaciones financieras. Dado que el sistema debe ser resiliente, confiable y antifrágil, se considera necesario tener redundancia de datos para evitar la pérdida de información en caso de fallos o desastres. El uso de otro banco para mantener datos redundantes se ha evaluado como una solución para mejorar la resiliencia y asegurar la continuidad del servicio.

## Decisión
Se ha decidido implementar la redundancia de datos en otro banco para el sistema de transacciones on-premise del Banco ABC. Esto permitirá mantener copias de datos en un entorno separado, minimizando el riesgo de pérdida de datos y proporcionando un mecanismo de recuperación en caso de fallos o desastres.

## Consecuencias
- **Positivas**:
    - **Alta Resiliencia**: La redundancia de datos en otro banco mejora la resiliencia del sistema, permitiendo la recuperación rápida en caso de fallos catastróficos.
    - **Continuidad del Servicio**: Al tener copias de datos en una ubicación separada, se puede mantener la continuidad del servicio incluso en caso de problemas graves en el banco primario.
    - **Reducción del Riesgo de Pérdida de Datos**: El almacenamiento redundante reduce el riesgo de pérdida de datos debido a fallos técnicos, errores humanos, o desastres naturales.
- **Negativas**:
    - **Costo Adicional**: La implementación de redundancia de datos en otro banco puede implicar costos adicionales por el almacenamiento y la sincronización de datos.
    - **Sobrecarga Operativa**: Mantener datos redundantes requiere procesos adicionales para la sincronización y la recuperación de datos.
    - **Latencia Potencial**: El proceso de sincronización puede añadir latencia si no está bien optimizado, afectando el rendimiento del sistema.

## Alternativas Consideradas
1. **Redundancia en el Mismo Banco**: Se consideró mantener copias redundantes de datos en el mismo banco, pero se descartó porque no proporciona suficiente separación para casos de desastres.
2. **Solo respaldos Periódicos**: Se evaluó el uso de solamente respaldos periódicos para asegurar la redundancia de datos, pero se descartó porque no proporciona la misma capacidad de recuperación frente a un evento que afecte a todo el Banco ABC.
3. **Almacenamiento en la Nube**: Aunque proporciona redundancia, se descartó porque el sistema requiere almacenamiento físico en bancos diferentes para cumplir con regulaciones y directrices internas.

## Justificación
La redundancia de datos en otro banco fue elegida porque proporciona una alta resiliencia y asegura la continuidad del servicio en caso de fallos o desastres. Al mantener datos en un entorno separado, se reduce el riesgo de pérdida de datos y se facilita la recuperación rápida. Aunque implica costos adicionales y cierta complejidad, el beneficio de tener un sistema más resiliente y confiable justifica esta elección.

## Notas Adicionales
- El equipo debe implementar mecanismos para la sincronización y recuperación de datos de manera segura y eficiente.
- Se recomienda el uso de herramientas de monitoreo para asegurar que la redundancia de datos funcione según lo esperado y no añada latencia excesiva.
- Se requerirán pruebas adicionales para garantizar que el sistema pueda recuperarse rápidamente en caso de fallos o desastres.

## Referencias
- [Redundancia de Datos - Best Practices](https://aws.amazon.com/architecture/redundancy-best-practices/)
- [Data Redundancy in Financial Systems](https://www.oreilly.com/library/view/data-redundancy-in-banking/)
- [Preguntas al profesor](https://github.com/militoromero10/UJaveriana-AES-ModVal/tree/master/patrones/exam/exam/ADR/ref/preguntas.pdf)
