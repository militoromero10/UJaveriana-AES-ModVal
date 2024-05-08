# Aplicación de Principios de Antifragilidad para el Proyecto del Banco ABC

- **Fecha**: 7 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está desarrollando un sistema para gestionar pagos de servicios públicos y otras operaciones financieras. 
El sistema necesita ser resiliente y capaz de adaptarse a cambios inesperados, como aumentos súbitos de carga, fallos en componentes, o requisitos cambiantes.
Para abordar estos desafíos, se considera aplicar principios de antifragilidad en el diseño del sistema, permitiendo 
que el sistema crezca y se adapte a condiciones adversas.

Hay dos vistas sobre la disponibilidad de los servicios, la interna y la externa. En el caso de la externa podemos asumir que el SLA con los convenios es del 99.9%. Internamente la directriz del banco es que sus servicios internos estén preparados para tener una disponibilidad del 99.99%. No es parte del alcance, pero normalmente debería haber capacidades de monitoreo y observabilidad que permiten comprender cual parte del sistema está fallando o se encuentre indisponibles. Se debe aportar una solución que considere poder llegar a ese 99.99%.

El proyecto de pago de servicios de convenios diferencia a este banco de la competencia. Permite al Banco tener fidelidad de clientes y aumentar su portafolio de servicios.

## Decisión
Se ha decidido diseñar el sistema del Banco ABC con principios de antifragilidad. Esto implicará enfoques que permitan al sistema adaptarse y mejorar ante el estrés y las perturbaciones, como el uso de arquitectura orientada a eventos, escalabilidad horizontal, y redundancia de componentes críticos.

## Consecuencias
- **Positivas**:
    - **Resiliencia Mejorada**: Al diseñar para antifragilidad, el sistema se vuelve más resistente a fallos y perturbaciones, y puede mejorar con el tiempo.
    - **Escalabilidad y Flexibilidad**: Un sistema antifrágil está diseñado para escalar y adaptarse a cambios inesperados, permitiendo mayor flexibilidad.
    - **Innovación y Evolución Continua**: La antifragilidad fomenta la innovación, ya que el sistema puede evolucionar a medida que enfrenta nuevas condiciones.
- **Negativas**:
    - **Complejidad Adicional**: La implementación de principios de antifragilidad puede añadir complejidad al sistema.
    - **Mayor Sobrecarga Operativa**: Requiere un enfoque proactivo para monitorear y responder a cambios y perturbaciones.
    - **Potencial Redundancia**: El uso de redundancia y estrategias de escalabilidad puede aumentar los costos y el consumo de recursos.

## Alternativas Consideradas
1. **Resiliencia Tradicional**: Se consideró el enfoque tradicional de resiliencia, pero se descartó porque no proporciona el mismo nivel de adaptación y crecimiento que la antifragilidad.
2. **Arquitectura Monolítica**: Se descartó debido a la falta de flexibilidad y la dificultad para adaptarse a cambios inesperados.
3. **Arquitectura en Capas con Redundancia**: Aunque proporciona cierta resiliencia, se descartó porque no promueve la adaptabilidad y evolución que ofrece la antifragilidad.

## Justificación
Se eligió diseñar el sistema con principios de antifragilidad porque permite al Banco ABC tener un sistema, además de resiliente, capaz de adaptarse y mejorar al enfrentar condiciones desfavorables. La antifragilidad proporciona flexibilidad, escalabilidad y capacidad de mejora continua ante el estrés y las perturbaciones. Aunque añade cierta complejidad, los beneficios de un sistema antifrágil justifican esta elección.

## Notas Adicionales
- El equipo debe implementar herramientas de monitoreo para detectar fallos y responder a perturbaciones de manera proactiva.
- Se recomienda la redundancia de componentes críticos y el uso de estrategias de escalabilidad para mejorar la antifragilidad del sistema.
- El enfoque de antifragilidad requiere un proceso continuo de mejora y adaptación, por lo que el equipo debe estar preparado para evolucionar el sistema según sea necesario.

## Referencias
- [Antifragile: Things That Gain from Disorder - Nassim Nicholas Taleb](https://en.wikipedia.org/wiki/Antifragile)
- [Designing for Antifragility](https://martinfowler.com/articles/antifragility.html)
- [Preguntas al profesor](https://github.com/militoromero10/UJaveriana-AES-ModVal/tree/master/patrones/exam/exam/ADR/ref/preguntas.pdf)