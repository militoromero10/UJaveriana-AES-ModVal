# Adopción del Protocolo HTTP para la Comunicación 

- **Fecha**: 6 de mayo de 2024
- **Estado**: Aprobado

## Contexto 

El equipo está desarrollando un sistema grande y complejo que requiere una comunicación eficiente entre sus componentes distribuidos. Se consideraron diferentes opciones de protocolos de comunicación, pero se determinó que el Protocolo de Transferencia de Hipertexto (HTTP) sería la mejor opción para cumplir con los requisitos del proyecto, que incluyen simplicidad, interoperabilidad y soporte para la integración continua y la implementación continua (CI/CD). 

## Decisión 

Adoptaremos el Protocolo HTTP para la comunicación entre los diversos componentes del sistema. HTTP ofrece una amplia adopción, es altamente interoperable y es compatible con tecnologías y herramientas de desarrollo y despliegue ampliamente utilizadas en el proyecto. 

## Consecuencias 

- **Positivas**:

- **Interoperabilidad**: HTTP es ampliamente compatible con una variedad de plataformas y tecnologías. 

- **Simplicidad**: El uso de HTTP simplifica la implementación y el mantenimiento de la comunicación entre los componentes del sistema. 

- **Soporte para CI/CD**: HTTP facilita la integración continua y la implementación continua debido a su amplia adopción y herramientas disponibles. 

- **Negativas**:

- **Latencia**: La comunicación a través de HTTP puede introducir una latencia adicional en comparación con otros protocolos más eficientes, especialmente en entornos distribuidos. 

- **Sobrecarga de datos**: HTTP puede generar una sobrecarga de datos debido a su formato de mensaje completo y su estructura de solicitud-respuesta. 

## Alternativas Consideradas 

Protocolo de Comunicación Propietario: Se consideró el desarrollo de un protocolo de comunicación personalizado, pero se descartó debido a la complejidad y la falta de soporte generalizado. 

Protocolo de Mensajes Asíncronos: También se evaluaron protocolos de mensajería asíncronos, como AMQP, pero no cumplían completamente con los requisitos de simplicidad y compatibilidad con las herramientas existentes en el proyecto. 

## Justificación

La adopción del Protocolo HTTP se justifica por las siguientes razones: 

La simplicidad y la interoperabilidad de HTTP facilitan la implementación y el mantenimiento de la comunicación entre los componentes del sistema. 

HTTP es ampliamente compatible con las herramientas y tecnologías utilizadas en el proyecto, lo que facilita la integración y la implementación continua. 

La amplia adopción de HTTP y su robusta comunidad proporcionan soporte y recursos disponibles para el equipo durante el desarrollo y la implementación del sistema. 

## Notas Adicionales

Se requerirá capacitación adicional para el equipo en el uso y gestión del Protocolo HTTP, especialmente en áreas como la optimización de la comunicación y la gestión de la latencia.