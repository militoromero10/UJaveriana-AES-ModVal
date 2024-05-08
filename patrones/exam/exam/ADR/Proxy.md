# Uso del Patrón Proxy para el Proyecto del Banco ABC

- **Fecha**: 7 de mayo de 2024
- **Estado**: Aprobado

## Contexto
El Banco ABC está desarrollando un sistema para permitir pagos de servicios públicos. El sistema requiere control de acceso, gestión de carga, y la capacidad de implementar funcionalidades adicionales, como nuevos convenios, sin re-desplegar. El uso del patrón Proxy se ha considerado para abordar estas necesidades.

## Decisión
Se ha decidido implementar el patrón Proxy en el sistema del Banco ABC. El patrón Proxy permitirá controlar el acceso a los objetos subyacentes y agregar funcionalidades adicionales, como nuevos convenios y caching, sin modificar el código del objeto real.

## Consecuencias
- **Positivas**:
    - **Control de Acceso**: El Proxy puede actuar como punto de control para verificar la autenticación y autorización antes de permitir el acceso a los objetos reales.
    - **Modularidad y Flexibilidad**: El Proxy proporciona un nivel de abstracción que permite agregar funcionalidades adicionales sin afectar el objeto subyacente.
    - **Gestión de Carga**: El Proxy puede implementar mecanismos de gestión de carga, como limitación de tasa (rate limiting), para proteger los recursos subyacentes.
- **Negativas**:
    - **Complejidad Adicional**: La implementación de Proxies puede añadir complejidad al sistema y requerir más esfuerzo de mantenimiento.
    - **Latencia Potencial**: El uso de Proxies puede introducir latencia debido a la verificación de acceso y otras funcionalidades añadidas.
    - **Riesgo de Acoplamiento**: Un Proxy mal implementado puede crear un acoplamiento no deseado entre el cliente y el objeto subyacente.

## Alternativas Consideradas
1. **Acceso Directo a Objetos**: Se consideró permitir acceso directo a los objetos, pero se descartó porque no proporciona el control de acceso ni la flexibilidad para agregar funcionalidades adicionales.
2. **Interceptors**: Se evaluó el uso de interceptores, pero se descartó porque no ofrecen el mismo nivel de abstracción y control que el patrón Proxy.
3. **Facade Pattern**: Aunque similar, el patrón Facade fue descartado porque se enfoca en simplificar la interfaz, mientras que Proxy tiene un mayor énfasis en el control de acceso y otras funcionalidades.

## Justificación
El patrón Proxy fue elegido porque proporciona control de acceso, modularidad y la capacidad de agregar funcionalidades adicionales sin modificar el objeto subyacente. Esto es esencial para un sistema financiero que requiere autenticación, autorización y gestión de carga. Aunque añade cierta complejidad, el beneficio de tener un sistema más seguro y flexible justifica su uso. Adicionalmente, gracias a la posibilidad de caching puede llegar a reducir la latencia asociada a la comunicación con los convenios.

## Notas Adicionales
- Se necesitará implementar mecanismos para garantizar que el Proxy no introduzca latencia excesiva o problemas de rendimiento.
- Se recomienda el uso de herramientas de monitoreo para rastrear el rendimiento del Proxy y asegurar que no se convierta en un cuello de botella.
- El equipo deberá trabajar en el diseño del Proxy para evitar acoplamiento no deseado entre el cliente y el objeto subyacente.

## Referencias
- [Proxy Pattern - Wikipedia](https://en.wikipedia.org/wiki/Proxy_pattern)
- [Design Patterns - Proxy](https://www.oodesign.com/proxy-pattern.html)
- [Preguntas al profesor](https://github.com/militoromero10/UJaveriana-AES-ModVal/tree/master/patrones/exam/exam/ADR/ref/preguntas.pdf)