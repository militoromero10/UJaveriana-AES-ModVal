# Uso del estilo de arquitectura Serverless

- **Fecha**: 3 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está creando desde cero su infraestructura tecnológica para permitir pagos de servicios públicos a través 
de varios canales (cajeros automáticos, oficinas, teléfonos, portal web y aplicación móvil). El banco necesita un 
sistema altamente escalable y flexible que permita agregar o eliminar convenios sin generar indisponibilidades. 
Del mismo modo, responder a cambios en la demanda de manera eficiente.

El banco ABC tiene las capacidades de ejecución de proyectos, tienen un equipo de arquitectura competente y en caso de 
necesitar escalar lo hacen con equipos terceros de un grupo de empresas contratistas que ya tienen aprobadas y con las
cuales solo tendrían que negociar alcance de proyecto. 
Se espera que el sistema resultante soporte la introducción constante de nuevas funcionalidades en el mediano o largo plazo.

Es importante para el banco es poder adicionar dinámicamente convenios sin tener que re-desplegar ningún 
componente de la solución. Estos nuevos convenios, a su vez, van a traer nuevos clientes.


## Decisión
Optaremos por una arquitectura serverless para la integración de los servicios públicos. El diseño se basará en 
funciones como servicio (FaaS) y servicios gestionados, permitiendo escalabilidad automática, 
menor sobrecarga operativa y pago por uso real.

## Consecuencias
- **Positivas**:
  - **Escalabilidad Automática**: El uso de servicios serverless permite escalar automáticamente según la carga de trabajo, sin intervención manual.
  - **Reducción de Sobrecarga Operativa**: Al eliminar la gestión de servidores, el equipo puede centrarse en el desarrollo de funcionalidades en lugar de la administración de infraestructura.
  - **Costos Reducidos**: La facturación basada en el uso real puede ser más rentable para cargas de trabajo variables o impredecibles.
  - **Integración con Servicios Gestionados**: Serverless se integra bien con otros servicios gestionados, facilitando la implementación y el mantenimiento.
- **Negativas**:
  - **Limitaciones de Duración y Recursos**: Las funciones serverless tienen restricciones en tiempo de ejecución y recursos, lo que puede afectar ciertos casos de uso.
  - **Latencia Adicional**: El modelo basado en eventos puede introducir latencia debido a la naturaleza asíncrona de serverless.
  - **Dependencia del Proveedor de la Nube**: Existe cierta dependencia del proveedor de la nube para la gestión de la infraestructura y el escalado.

## Alternativas Consideradas
1. **Microservicios Tradicionales**: Se consideró una arquitectura de microservicios con infraestructura propia, pero se descartó debido a la mayor complejidad de gestión y la necesidad de mantener servidores.
2. **Arquitectura Monolítica**: Se descartó porque no proporciona la flexibilidad para agregar o eliminar convenios sin afectar la disponibilidad del sistema.

## Justificación
Elegimos serverless sobre microservicios por las siguientes razones:
- **Escalabilidad Automática**: Serverless permite escalar automáticamente, lo que es crucial para el banco dada la naturaleza variable de la carga de trabajo.
- **Menor Sobrecarga Operativa**: Serverless elimina la necesidad de gestionar servidores, permitiendo al equipo centrarse en el desarrollo y la innovación.
- **Costos Basados en Uso Real**: El modelo de pago por uso real reduce los costos, especialmente para aplicaciones con carga de trabajo variable.
- **Integración Sencilla con Servicios Gestionados**: Serverless se integra fácilmente con otros servicios de la nube, simplificando el despliegue y la administración.
- **Mayor flexibilidad para agregar nuevos convenios**: Serverless permite la integración, sin re-despliegues, de nuevos convenios que incluso utilicen protocolos de comunicación distintos a HTTP.



## Notas Adicionales
- Se planea usar AWS Lambda para funciones serverless, con Amazon API Gateway para la gestión de solicitudes HTTP, y Amazon DynamoDB para almacenamiento NoSQL.
- Se realizarán revisiones periódicas para garantizar que el diseño serverless sigue cumpliendo con las necesidades del proyecto.

## Referencias
- [AWS Lambda Documentation](https://docs.aws.amazon.com/lambda/)
- [Introduction to Serverless Architecture](https://martinfowler.com/articles/serverless.html)
- [Preguntas al profesor](https://github.com/militoromero10/UJaveriana-AES-ModVal/tree/master/patrones/exam/exam/ADR/ref/preguntas.pdf)