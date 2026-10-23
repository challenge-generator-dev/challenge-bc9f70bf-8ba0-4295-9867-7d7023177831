# AGENTS.md

Instrucciones para el agente de IA que abra este repositorio (Claude Code, Cursor, Codex, Copilot, Gemini). Se cargan solas: no hay que pegar nada en ningun chat.

## Que es este repositorio

Es el codigo base de un reto de aprendizaje de Pragma: **Mejora de Seguridad y Legibilidad en la Aplicación de Pagos**.

| | |
|---|---|
| Tema | Frameworks · Especialista en Framework con Proficiencia en Seguridad y Legibilidad de Código |
| Nivel | advanced-l3 |
| Chapter | Backend |
| Especialidad | Java |
| Stack | Java 21 / Spring Boot 3.5 |
| Patron arquitectonico | hexagonal/clean |
| Tiempo estimado | 4 horas |

## Receta del stack

Esqueleto obligatorio:

- `pom.xml en la raiz`
- `clase con @SpringBootApplication`
- `application.yml en src/main/resources`
- `capa de dominio con entidades y puertos`
- `capa de aplicacion con casos de uso`
- `capa de infraestructura con adaptadores y @RestController`

Trampas conocidas:

- TODA `<version>` del pom va con tres segmentos: la del parent (ej. `3.5.6`) y la de cada dependencia que la lleve (ej. Resilience4j `2.2.0`). `3.4` y `2.0` no existen como artefacto y el build muere resolviendo dependencias.
- Las dependencias que el parent POM gestiona van SIN `<version>`: `spring-boot-starter-web`, `-data-jpa`, `-validation`, `-test`, etc.
- Resilience4j publica un artefacto por linea de Spring Boot. Con Spring Boot 3 va `resilience4j-spring-boot3` con version de tres segmentos (ej. `2.2.0`, no `2.0`). `resilience4j-spring-boot2` es de Spring Boot 2 y rompe el arranque.
- Si usas anotaciones de validacion (`@NotNull`, `@Size`, `@Positive`) declara `spring-boot-starter-validation`: el starter web no las trae.
- El `spring-boot-maven-plugin` tiene que estar en `<build><plugins>` o no se empaqueta ejecutable.
- Spring Boot 3 usa `jakarta.*`, nunca `javax.*`.
- Cada archivo empieza con su `package` y con un `import` por cada clase del proyecto que viva en otro paquete. Usar `PaymentService` desde `infrastructure` sin `import com.x.application.PaymentService` no compila.

Dependencias:

- org.springframework.boot:spring-boot-starter-web n/a
- org.springframework.boot:spring-boot-starter-data-jpa n/a
- org.springframework.boot:spring-boot-starter-security n/a
- org.springframework.boot:spring-boot-starter-oauth2-resource-server n/a
- io.jsonwebtoken:jjwt-api 0.12.5
- io.jsonwebtoken:jjwt-impl 0.12.5
- io.jsonwebtoken:jjwt-jackson 0.12.5
- org.springframework.boot:spring-boot-starter-validation n/a
- org.postgresql:postgresql n/a
- org.springframework.boot:spring-boot-starter-test n/a
- org.springframework.security:spring-security-test n/a
- org.projectlombok:lombok n/a

## Tu tarea

Dejar este proyecto en estado **verificable**: que el comando de verificacion corra sin errores. Escribi los archivos en disco, en este repositorio. No generes ZIPs ni archivos adjuntos.

En orden:

1. Corre `mvn clean compile` y mira que falla.
2. Completa lo que falte de la lista de abajo: manifiesto de dependencias, punto de entrada, capa de interfaz y las capas del patron declarado.
3. Arregla SOLO los errores que impiden compilar o arrancar.
4. Volve a correr `mvn clean compile` hasta que pase.
5. Pará ahí.

## Regla dura: las fases son trabajo del humano

**PROHIBIDO implementar los entregables de las fases.** El valor del reto esta en que la persona los resuelva. Tu trabajo es que tenga un proyecto que arranca; el hueco pedagogico se queda como esta.

No resuelvas nada de esto:

- **Fase 1 — Diagnóstico de la Autenticación Actual**: Reporte de diagnóstico con áreas de mejora identificadas.
- **Fase 2 — Implementación de Mecanismos de Autenticación**: Aplicación con dos mecanismos de autenticación implementados.
- **Fase 3 — Centralización de la Configuración**: Aplicación con configuración centralizada.
- **Fase 4 — Reducción de Redundancia**: Aplicación con redundancia reducida.

Distincion operativa:

- **Arreglar** (si): import faltante, tipo que no existe, dependencia sin declarar, error de sintaxis, archivo referenciado que no existe.
- **No tocar** (no): logica de negocio incompleta, validaciones ausentes, secretos hardcodeados, APIs deprecadas que funcionan, concurrencia insegura, patrones mejorables. Eso es lo que la persona tiene que encontrar.

## Superficie de practica (NO completes)

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs. No toques la logica que el reto pide completar.

- [ ] `src/main/java/com/pragma/payments/infrastructure/config/SecurityConfig.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- [ ] `src/main/java/com/pragma/payments/infrastructure/security/JwtAuthenticationFilter.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- [ ] `src/main/java/com/pragma/payments/infrastructure/security/JwtTokenUtil.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- [ ] `src/main/java/com/pragma/payments/infrastructure/exception/CustomAuthenticationException.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.

## Lo que falta y tenes que completar

### 1. Referencias colgando (22)

Salieron de un analisis estatico del codigo que SI esta en el repo. Cada una rompe la compilacion:

- [ ] `src/main/java/com/pragma/payments/application/service/PaymentService.java` — `Payment.status`
      Se invoca `status` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.id`
      Se invoca `id` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.userId`
      Se invoca `userId` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.orderId`
      Se invoca `orderId` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.amount`
      Se invoca `amount` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.currency`
      Se invoca `currency` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.status`
      Se invoca `status` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.transactionReference`
      Se invoca `transactionReference` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.createdAt`
      Se invoca `createdAt` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `StatusUpdateRequest.orderId`
      Se invoca `orderId` sobre `StatusUpdateRequest`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `StatusUpdateRequest.userId`
      Se invoca `userId` sobre `StatusUpdateRequest`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `StatusUpdateRequest.amount`
      Se invoca `amount` sobre `StatusUpdateRequest`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `StatusUpdateRequest.currency`
      Se invoca `currency` sobre `StatusUpdateRequest`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.findById`
      Se invoca `findById` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.findByStatus`
      Se invoca `findByStatus` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.getAllPayments`
      Se invoca `getAllPayments` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.findByUserId`
      Se invoca `findByUserId` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.findByOrderId`
      Se invoca `findByOrderId` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.updatePaymentStatus`
      Se invoca `updatePaymentStatus` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `Payment.id`
      Se invoca `id` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `StatusUpdateRequest.status`
      Se invoca `status` sobre `StatusUpdateRequest`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.completePayment`
      Se invoca `completePayment` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.

### Presentes (14)

- `pom.xml`
- `src/main/java/com/pragma/payments/Application.java`
- `src/main/resources/application.yml`
- `src/main/java/com/pragma/payments/domain/model/Payment.java`
- `src/main/java/com/pragma/payments/domain/port/PaymentRepository.java`
- `src/main/java/com/pragma/payments/application/service/PaymentService.java`
- `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java`
- `src/main/java/com/pragma/payments/infrastructure/config/SecurityConfig.java`
- `src/main/java/com/pragma/payments/infrastructure/security/JwtAuthenticationFilter.java`
- `src/main/java/com/pragma/payments/infrastructure/security/JwtTokenUtil.java`
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java`
- `src/main/java/com/pragma/payments/infrastructure/exception/GlobalExceptionHandler.java`
- `src/main/java/com/pragma/payments/infrastructure/exception/CustomAuthenticationException.java`
- `src/main/java/com/pragma/payments/infrastructure/exception/CustomValidationException.java`

### Capas del patron declarado

Cada una tiene que existir como directorio real con al menos un archivo. Codigo plano en la raiz no satisface el patron.

- `src/main/java/com/pragma/payments`
- `src/main/java/com/pragma/payments/domain`
- `src/main/java/com/pragma/payments/domain/model`
- `src/main/java/com/pragma/payments/domain/port`
- `src/main/java/com/pragma/payments/application`
- `src/main/java/com/pragma/payments/application/service`
- `src/main/java/com/pragma/payments/infrastructure`
- `src/main/java/com/pragma/payments/infrastructure/adapter`
- `src/main/java/com/pragma/payments/infrastructure/config`
- `src/main/java/com/pragma/payments/infrastructure/controller`
- `src/main/java/com/pragma/payments/infrastructure/exception`
- `src/main/java/com/pragma/payments/infrastructure/security`
- `src/main/resources`
- `src/test/java/com/pragma/payments`

## Verificacion

```bash
mvn clean compile
```

El comando tiene que pasar SIN implementar los archivos de la superficie de practica: solo andamiaje.

Ese comando pasando es la definicion de "terminado" para vos.

## Convenciones que tenes que respetar

- Un solo ecosistema: no declares librerias de otro lenguaje ni mezcles gestores de paquetes.
- Toda libreria que uses tiene que estar declarada en el manifiesto de dependencias.
- Todo import declarado tiene que usarse; todo tipo usado tiene que existir o venir de una dependencia declarada.
- El patron es **hexagonal/clean**: los contratos (interfaces, puertos) los define la capa interna y los implementa la externa, nunca al revés.
- Los archivos que crees llevan implementacion real, no stubs: sin `TODO`, sin cuerpos vacios, sin `// getters y setters`.

## Contexto del candidato

Sirve para calibrar el nivel del codigo, no para resolver las fases.

- Perfil: Chapter Backend, Especialidad Desarrollador, Tecnología Java, Advanced
- Brecha que el reto ataca: Experto en el marco de trabajo (framework) más relevante en su lenguaje de programación principal, lo que le permite escribir código más legible y reducir la redundancia. Ha implementado al menos dos mecanismos de autenticación e identifica el uso de un JWT
- Mision: Desarrollador Backend Advanced con experiencia en arquitectura y patrones de diseño

---

*Generado por Challenge Generator — Pragma. `README.md` tiene el enunciado completo del reto para la persona. `PROMPT_MEJORA.md` es la variante para pegar en un chat, si se prefiere ese flujo.*
