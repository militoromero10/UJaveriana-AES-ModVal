# Uso de Arquitectura Híbrida (On-premise y Serverless)

- **Fecha**: 6 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está implementando un sistema para facilitar el pago de servicios públicos a través de múltiples 
canales (cajeros automáticos, oficinas, teléfonos, portal web y aplicación móvil). 
El banco requiere una solución que permita agregar y eliminar convenios de forma dinámica y tenga alta 
disponibilidad para asegurar una experiencia confiable para sus clientes. El banco quiere una infraestructura 
on-premise, pero también desea aprovechar las ventajas de la arquitectura serverless para 
escalabilidad automática y reducción de costos.

## Decisión
Optaremos por una arquitectura híbrida que combine elementos on-premise con serverless para este proyecto. 
La parte on-premise se utilizará para servicios críticos que vayan por medios de pago que probablemente no requieran alta escalabilidad, mientras que la parte serverless se empleará para tareas que requieren escalabilidad y flexibilidad, 
permitiendo pago por uso real.
En caso de fallo total y desconexión de los elementos Serverless, los elementos on-premise permitiran a los usuarios seguir realizando transacciones para el pago de sus servicios públicos. 



## Consecuencias
- **Positivas**:
    - **Flexibilidad y Escalabilidad**: Al usar serverless, el sistema puede escalar automáticamente según la demanda, permitiendo agregar y eliminar convenios de forma dinámica.
    - **Alta Disponibilidad para Servicios Críticos**: La infraestructura on-premise puede proporcionar alta disponibilidad para componentes críticos que deben estar siempre disponibles.
    - **Reducción de Costos**: El uso de serverless para tareas que requieren escalabilidad permite reducir costos, ya que se paga solo por el uso real.
- **Negativas**:
    - **Complejidad de Integración**: Al usar un modelo híbrido, la integración entre componentes on-premise y serverless puede ser más compleja.
    - **Dependencia del Proveedor de la Nube**: El uso de serverless implica cierta dependencia del proveedor de la nube para la gestión de infraestructura y escalabilidad.
    - **Necesidad de monitoreo y mantenimiento constante**: Para hacer frente al riezgo de falla de los componentes Serverless y posterior traslado de solicitudes al sistema On-premise, se requiere una verificación periodica de las capacidades del sistema On-premise que se convierte en un costo fijo.


## Alternativas Consideradas
1. **Arquitectura Totalmente On-premise**: Se consideró usar solo infraestructura on-premise, pero se descartó debido a la falta de escalabilidad automática y la rigidez para agregar o eliminar convenios.
2. **Arquitectura Totalmente Serverless**: Se descartó debido a las limitaciones en alta disponibilidad y a los requisitos específicos de infraestructura que tiene el banco.

## Justificación
La arquitectura híbrida permite aprovechar las ventajas de ambos mundos: escalabilidad automática y pago por uso con serverless, y alta disponibilidad y control con infraestructura on-premise. Dado que el banco ya tiene infraestructura existente y cuenta con un equipo de arquitectura competente, el modelo híbrido ofrece flexibilidad y escalabilidad sin sacrificar la disponibilidad de servicios críticos.

## Notas Adicionales
- El banco tiene acuerdos con empresas contratistas para escalar recursos según sea necesario, lo que facilita la implementación de esta arquitectura híbrida.
- Se requerirá integración cuidadosa entre componentes on-premise y serverless para garantizar la consistencia y la confiabilidad del sistema.
- El equipo de arquitectura deberá trabajar en mecanismos de monitoreo y observabilidad para asegurar que se cumplan los niveles de disponibilidad requeridos.

## Referencias
- [Serverless Patterns](https://martinfowler.com/articles/serverless.html)
- [Best Practices for Hybrid Architectures](https://aws.amazon.com/architecture/hybrid/)