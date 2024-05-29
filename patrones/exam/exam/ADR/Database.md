# Adopción de una Base de Datos 

- **Fecha**: 6 de mayo de 2024
- **Estado**: Aprobado

## Contexto 

El equipo está desarrollando un sistema grande y complejo que requiere alta escalabilidad y flexibilidad en cuanto al almacenamiento y acceso a datos. Se consideraron diferentes opciones, pero se determinó que una base de datos NoSQL sería la mejor opción para cumplir con los requisitos del proyecto, que incluyen escalabilidad horizontal, flexibilidad en el esquema de datos y alta disponibilidad. 

## Decisión 

Adoptaremos una base de datos NoSQL para almacenar los datos de los microservicios. Las bases de datos elegidas son DynamoDB y Redis, que ofrecen soporte robusto para microservicios y una amplia comunidad de usuarios. Estas bases de datos también permiten la integración con herramientas de desarrollo y despliegue que utilizamos actualmente. 

## Consecuencias 

- **Positivas**:

Escalabilidad: DynamoDB y Redis permiten escalar horizontalmente para manejar grandes volúmenes de datos y cargas de trabajo cambiantes. 

Flexibilidad: Permiten almacenar datos de diferentes estructuras y tipos, lo que facilita la adaptación a las necesidades cambiantes del sistema. 

Uso de tecnologías conocidas: DynamoDB y Redis son ampliamente utilizadas en la industria y cuentan con una sólida documentación y soporte comunitario. 

- **Negativas**:

- **Complejidad de gestión**: La configuración y administración de bases de datos NoSQL pueden requerir un mayor esfuerzo y conocimiento técnico en comparación con las bases de datos relacionales. 

- **Costes de infraestructura**: Puede aumentar el costo de infraestructura debido a la necesidad de más recursos para escalar horizontalmente y garantizar la disponibilidad de los datos. 

- **Consistencia eventual**: DynamoDB y Redis utilizan modelos de consistencia eventual, lo que puede introducir la posibilidad de lecturas y escrituras inconsistentes en ciertos casos. 

## Alternativas Consideradas 

Base de Datos Relacional: Se consideró una base de datos relacional, pero se desechó debido a la falta de escalabilidad horizontal y flexibilidad en el esquema de datos. 

Base de Datos de Grafos: También se evaluó una base de datos de grafos, pero no cumplía con los requisitos de rendimiento y escalabilidad del proyecto. 

## Justificación

La adopción de DynamoDB y Redis como bases de datos para microservicios se justifica por las siguientes razones: 

El proyecto requiere alta escalabilidad y flexibilidad en el almacenamiento y acceso a datos, lo que se logra con bases de datos NoSQL. 

El equipo tiene experiencia con DynamoDB y Redis, facilitando la implementación y gestión de las bases de datos. 

Estas bases de datos proporcionan integración con otras herramientas y tecnologías utilizadas en el proyecto. 

## Notas Adicionales

Se requerirá capacitación adicional para el equipo en el uso y gestión de DynamoDB y Redis. 