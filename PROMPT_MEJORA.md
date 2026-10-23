# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener un ZIP con el proyecto completo y arrancable.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `src/main/java/com/pragma/payments/infrastructure/config/SecurityConfig.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/pragma/payments/infrastructure/security/JwtAuthenticationFilter.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/pragma/payments/infrastructure/security/JwtTokenUtil.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/pragma/payments/infrastructure/exception/CustomAuthenticationException.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.

## Lo que le falta a este proyecto

Esto NO lo tenes que adivinar: salio de comparar el proyecto contra la arquitectura declarada del reto y de un analisis estatico del codigo. Completalo TODO.

### Referencias colgando en el codigo que si esta

Cada una rompe la compilacion:

- `src/main/java/com/pragma/payments/application/service/PaymentService.java` — `Payment.status`: Se invoca `status` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.id`: Se invoca `id` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.userId`: Se invoca `userId` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.orderId`: Se invoca `orderId` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.amount`: Se invoca `amount` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.currency`: Se invoca `currency` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.status`: Se invoca `status` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.transactionReference`: Se invoca `transactionReference` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java` — `Payment.createdAt`: Se invoca `createdAt` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `StatusUpdateRequest.orderId`: Se invoca `orderId` sobre `StatusUpdateRequest`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `StatusUpdateRequest.userId`: Se invoca `userId` sobre `StatusUpdateRequest`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `StatusUpdateRequest.amount`: Se invoca `amount` sobre `StatusUpdateRequest`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `StatusUpdateRequest.currency`: Se invoca `currency` sobre `StatusUpdateRequest`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.findById`: Se invoca `findById` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.findByStatus`: Se invoca `findByStatus` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.getAllPayments`: Se invoca `getAllPayments` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.findByUserId`: Se invoca `findByUserId` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.findByOrderId`: Se invoca `findByOrderId` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.updatePaymentStatus`: Se invoca `updatePaymentStatus` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `Payment.id`: Se invoca `id` sobre `Payment`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `StatusUpdateRequest.status`: Se invoca `status` sobre `StatusUpdateRequest`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java` — `PaymentService.completePayment`: Se invoca `completePayment` sobre `PaymentService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.

## Como saber que terminaste

```bash
mvn clean compile
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Advanced

### Brecha de conocimiento
Experto en el marco de trabajo (framework) más relevante en su lenguaje de programación principal, lo que le permite escribir código más legible y reducir la redundancia. Ha implementado al menos dos mecanismos de autenticación e identifica el uso de un JWT

### Misión / candidato
Desarrollador Backend Advanced con experiencia en arquitectura y patrones de diseño

### Reto
- Tema: Frameworks · Especialista en Framework con Proficiencia en Seguridad y Legibilidad de Código
- Seniority: advanced-l3
- Tipo: practical
- Título: Mejora de Seguridad y Legibilidad en la Aplicación de Pagos
- Tiempo estimado: 4 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Diagnóstico de la Autenticación Actual — objetivo: Identificar las debilidades en la autenticación actual y la configuración dispersa. — entregable (NO resolver): Reporte de diagnóstico con áreas de mejora identificadas.
- Fase 2: Implementación de Mecanismos de Autenticación — objetivo: Implementar dos mecanismos de autenticación del framework. — entregable (NO resolver): Aplicación con dos mecanismos de autenticación implementados.
- Fase 3: Centralización de la Configuración — objetivo: Centralizar la configuración de la aplicación. — entregable (NO resolver): Aplicación con configuración centralizada.
- Fase 4: Reducción de Redundancia — objetivo: Reducir la redundancia en el código. — entregable (NO resolver): Aplicación con redundancia reducida.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.6</version>
        <relativePath/>
    </parent>

    <groupId>com.pragma</groupId>
    <artifactId>payments</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>payments</name>
    <description>Payment processing application with security and clean architecture</description>

    <properties>
        <java.version>21</java.version>
        <spring-boot.version>3.5.6</spring-boot.version>
    </properties>

    <dependencies>
        <!-- Spring Boot Starters -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>

        <!-- JWT -->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-api</artifactId>
            <version>0.12.5</version>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-impl</artifactId>
            <version>0.12.5</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-jackson</artifactId>
            <version>0.12.5</version>
            <scope>runtime</scope>
        </dependency>

        <!-- Database -->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>

        <!-- Lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <scope>provided</scope>
        </dependency>

        <!-- Test -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

    <repositories>
        <repository>
            <id>spring-milestones</id>
            <name>Spring Milestones</name>
            <url>https://repo.spring.io/milestone</url>
        </repository>
    </repositories>
</project>

// === ARCHIVO: src/main/java/com/pragma/payments/Application.java ===
package com.pragma.payments;


import com.pragma.payments.domain.model.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.Clock;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableMethodSecurity
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public Clock clock() {
        return Clock.systemUTC();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                    .allowedOrigins("*")
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                    .allowedHeaders("*")
                    .maxAge(3600);
            }
        };
    }

    @Bean
    public String applicationInfo() {
        return "Payment Processing Application - Version 1.0.0 - Running with Spring Boot " +
               System.getProperty("java.version");
    }
}

// === ARCHIVO: src/main/resources/application.yml ===
server:
  port: 8080
  servlet:
    context-path: /api/payments
  error:
    include-message: always
    include-binding-errors: always
    include-stacktrace: on_param

spring:
  application:
    name: payments-service
  profiles:
    active: dev
  datasource:
    url: jdbc:postgresql://localhost:5432/payments_db
    username: payments_user
    password: secure_password_123
    driver-class-name: org.postgresql.Driver
    hikari:
      maximum-pool-size: 10
      minimum-idle: 2
      idle-timeout: 30000
      max-lifetime: 600000
      connection-timeout: 30000
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
        dialect: org.hibernate.dialect.PostgreSQLDialect
        jdbc:
          lob:
            non_contextual_creation: true
  security:
    oauth2:
      resourceserver:
        jwt:
          issuer-uri: http://localhost:8081/realms/pragma-realm
          jwk-set-uri: http://localhost:8081/realms/pragma-realm/protocol/openid-connect/certs

logging:
  level:
    root: INFO
    org.springframework.web: DEBUG
    org.hibernate: INFO
    com.pragma.payments: DEBUG
  pattern:
    console: "%d{yyyy-MM-dd HH:mm:ss} - %msg%n"
    file: "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"
  file:
    name: logs/payments-service.log

jwt:
  secret: your-256-bit-secret-for-hmac-sha256-algorithm-keep-it-safe
  expiration: 86400000 # 24 hours in milliseconds
  refresh-expiration: 604800000 # 7 days in milliseconds

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics,prometheus
  endpoint:
    health:
      show-details: always
  info:
    env:
      enabled: true
    git:
      mode: full

app:
  security:
    roles:
      admin: ADMIN
      user: USER
      merchant: MERCHANT
    permitted-paths:
      - "/actuator/**"
      - "/v3/api-docs/**"
      - "/swagger-ui/**"
      - "/swagger-resources/**"
  rate-limit:
    enabled: true
    limit: 100
    window: 60 # in seconds

// === ARCHIVO: src/main/java/com/pragma/payments/domain/model/Payment.java ===
package com.pragma.payments.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record Payment(
    UUID id,
    String orderId,
    BigDecimal amount,
    String currency,
    String paymentMethod,
    String status,
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    String userId,
    String transactionReference
) {
    public Payment {
        if (id == null) {
            id = UUID.randomUUID();
        }
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (currency == null || currency.isBlank()) {
            throw new IllegalArgumentException("Currency is required");
        }
        if (paymentMethod == null || paymentMethod.isBlank()) {
            throw new IllegalArgumentException("Payment method is required");
        }
        if (status == null || status.isBlank()) {
            status = "PENDING";
        }
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
        if (updatedAt == null) {
            updatedAt = LocalDateTime.now();
        }
        if (userId == null || userId.isBlank()) {
            throw new IllegalArgumentException("User ID is required");
        }
    }

    public Payment withStatus(String newStatus) {
        return new Payment(
            this.id,
            this.orderId,
            this.amount,
            this.currency,
            this.paymentMethod,
            newStatus,
            this.createdAt,
            LocalDateTime.now(),
            this.userId,
            this.transactionReference
        );
    }

    public Payment withTransactionReference(String reference) {
        return new Payment(
            this.id,
            this.orderId,
            this.amount,
            this.currency,
            this.paymentMethod,
            this.status,
            this.createdAt,
            LocalDateTime.now(),
            this.userId,
            reference
        );
    }
}

// === ARCHIVO: src/main/java/com/pragma/payments/domain/port/PaymentRepository.java ===
package com.pragma.payments.domain.port;

import com.pragma.payments.domain.model.Payment;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PaymentRepository {
    Payment save(Payment payment);

    Optional<Payment> findById(UUID id);

    List<Payment> findByUserId(String userId);

    List<Payment> findByStatus(String status);

    List<Payment> findByOrderId(String orderId);

    void deleteById(UUID id);
}

// === ARCHIVO: src/main/java/com/pragma/payments/application/service/PaymentService.java ===
package com.pragma.payments.application.service;

import com.pragma.payments.domain.model.Payment;
import com.pragma.payments.domain.port.PaymentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Transactional
    public Payment createPayment(String userId, String orderId, BigDecimal amount, String currency) {
        validatePaymentData(userId, orderId, amount);

        String transactionReference = generateTransactionReference();
        
        Payment payment = Payment.builder()
                .id(UUID.randomUUID())
                .userId(userId)
                .orderId(orderId)
                .amount(amount)
                .currency(currency)
                .status("PENDING")
                .transactionReference(transactionReference)
                .createdAt(LocalDateTime.now())
                .build();

        return paymentRepository.save(payment);
    }

    @Transactional
    public Payment processPayment(UUID paymentId) {
        Payment payment = paymentRepository.findById(paymentId)
                .orElseThrow(() -> new IllegalArgumentException("Payment not found: " + paymentId));

        if (!"PENDING".equals(payment.status())) {
            throw new IllegalStateException("Payment cannot be processed in status: " + payment.status());
        }

        String transactionReference = generateTransactionReference();
        Payment updatedPayment = payment
                .withStatus("PROCESSED")
                .withTransactionReference(transactionReference);

        return paymentRepository.save(updatedPayment);
    }

    @Transactional
    public Payment cancelPayment(UUID paymentId, String reason) {
        Payment payment = paymentRepository.findById(paymentId)
                .orElseThrow(() -> new IllegalArgumentException("Payment not found: " + paymentId));

        if ("PROCESSED".equals(payment.status()) || "COMPLETED".equals(payment.status())) {
            throw new IllegalStateException("Cannot cancel payment in status: " + payment.status());
        }

        Payment cancelledPayment = payment.withStatus("CANCELLED");
        return paymentRepository.save(cancelledPayment);
    }

    public Optional<Payment> getPaymentById(UUID paymentId) {
        return paymentRepository.findById(paymentId);
    }

    public List<Payment> getPaymentsByUser(String userId) {
        return paymentRepository.findByUserId(userId);
    }

    public List<Payment> getPaymentsByStatus(String status) {
        return paymentRepository.findByStatus(status);
    }

    public List<Payment> getPaymentsByOrder(String orderId) {
        return paymentRepository.findByOrderId(orderId);
    }

    @Transactional
    public void deletePayment(UUID paymentId) {
        Payment payment = paymentRepository.findById(paymentId)
                .orElseThrow(() -> new IllegalArgumentException("Payment not found: " + paymentId));
        
        paymentRepository.deleteById(paymentId);
    }

    private void validatePaymentData(String userId, String orderId, BigDecimal amount) {
        if (userId == null || userId.isBlank()) {
            throw new IllegalArgumentException("User ID is required");
        }
        if (orderId == null || orderId.isBlank()) {
            throw new IllegalArgumentException("Order ID is required");
        }
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }

    private String generateTransactionReference() {
        return "TXN-" + UUID.randomUUID().toString().toUpperCase();
    }
}

// === ARCHIVO: src/main/java/com/pragma/payments/infrastructure/adapter/PaymentJpaAdapter.java ===
package com.pragma.payments.infrastructure.adapter;

import com.pragma.payments.domain.model.Payment;
import com.pragma.payments.domain.port.PaymentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class PaymentJpaAdapter implements PaymentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Payment save(Payment payment) {
        if (payment.id() == null) {
            return insertPayment(payment);
        } else {
            return updatePayment(payment);
        }
    }

    private Payment insertPayment(Payment payment) {
        Query query = entityManager.createNativeQuery(
            "INSERT INTO payments (id, user_id, order_id, amount, currency, status, transaction_reference, created_at) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?) RETURNING id, user_id, order_id, amount, currency, status, transaction_reference, created_at",
            Payment.class
        );
        query.setParameter(1, payment.id().toString());
        query.setParameter(2, payment.userId());
        query.setParameter(3, payment.orderId());
        query.setParameter(4, payment.amount());
        query.setParameter(5, payment.currency());
        query.setParameter(6, payment.status());
        query.setParameter(7, payment.transactionReference());
        query.setParameter(8, payment.createdAt().toString());
        
        return payment;
    }

    private Payment updatePayment(Payment payment) {
        Query query = entityManager.createNativeQuery(
            "UPDATE payments SET user_id = ?, order_id = ?, amount = ?, currency = ?, " +
            "status = ?, transaction_reference = ? WHERE id = ? " +
            "RETURNING id, user_id, order_id, amount, currency, status, transaction_reference, created_at",
            Payment.class
        );
        query.setParameter(1, payment.userId());
        query.setParameter(2, payment.orderId());
        query.setParameter(3, payment.amount());
        query.setParameter(4, payment.currency());
        query.setParameter(5, payment.status());
        query.setParameter(6, payment.transactionReference());
        query.setParameter(7, payment.id().toString());
        
        return payment;
    }

    @Override
    public Optional<Payment> findById(UUID id) {
        Query query = entityManager.createNativeQuery(
            "SELECT id, user_id, order_id, amount, currency, status, transaction_reference, created_at " +
            "FROM payments WHERE id = ?",
            Payment.class
        );
        query.setParameter(1, id.toString());
        
        try {
            Payment result = (Payment) query.getSingleResult();
            return Optional.of(result);
        } catch (jakarta.persistence.NoResultException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Payment> findByUserId(String userId) {
        Query query = entityManager.createNativeQuery(
            "SELECT id, user_id, order_id, amount, currency, status, transaction_reference, created_at " +
            "FROM payments WHERE user_id = ? ORDER BY created_at DESC",
            Payment.class
        );
        query.setParameter(1, userId);
        
        return query.getResultList();
    }

    @Override
    public List<Payment> findByStatus(String status) {
        Query query = entityManager.createNativeQuery(
            "SELECT id, user_id, order_id, amount, currency, status, transaction_reference, created_at " +
            "FROM payments WHERE status = ? ORDER BY created_at DESC",
            Payment.class
        );
        query.setParameter(1, status);
        
        return query.getResultList();
    }

    @Override
    public List<Payment> findByOrderId(String orderId) {
        Query query = entityManager.createNativeQuery(
            "SELECT id, user_id, order_id, amount, currency, status, transaction_reference, created_at " +
            "FROM payments WHERE order_id = ? ORDER BY created_at DESC",
            Payment.class
        );
        query.setParameter(1, orderId);
        
        return query.getResultList();
    }

    @Override
    public void deleteById(UUID id) {
        Query query = entityManager.createNativeQuery("DELETE FROM payments WHERE id = ?");
        query.setParameter(1, id.toString());
        query.executeUpdate();
    }
}

// === ARCHIVO: src/main/java/com/pragma/payments/infrastructure/config/SecurityConfig.java ===
package com.pragma.payments.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/public/**").permitAll()
                .requestMatchers("/api/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            );
        
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

// === ARCHIVO: src/main/java/com/pragma/payments/infrastructure/security/JwtAuthenticationFilter.java ===
package com.pragma.payments.infrastructure.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtTokenUtil jwtTokenUtil;

    public JwtAuthenticationFilter(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        String token = authHeader.substring(7);

        if (jwtTokenUtil.validateToken(token)) {
            String username = jwtTokenUtil.getUsernameFromToken(token);
            String role = jwtTokenUtil.getRoleFromToken(token);

            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                    username, null, java.util.List.of(new org.springframework.security.core.authority.SimpleGrantedAuthority(role))
            );
            authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }

        filterChain.doFilter(request, response);
    }
}

// === ARCHIVO: src/main/java/com/pragma/payments/infrastructure/security/JwtTokenUtil.java ===
package com.pragma.payments.infrastructure.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
public class JwtTokenUtil {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }

    public String generateToken(String username, String role) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + expiration);

        return Jwts.builder()
                .subject(username)
                .claim("role", role)
                .issuedAt(now)
                .expiration(expiryDate)
                .signWith(getSigningKey())
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().verifyWith(getSigningKey()).build().parseSignedClaims(token);
            return !isTokenExpired(token);
        } catch (Exception e) {
            return false;
        }
    }

    public String getUsernameFromToken(String token) {
        return getClaimsFromToken(token).getSubject();
    }

    public String getRoleFromToken(String token) {
        return getClaimsFromToken(token).get("role", String.class);
    }

    private boolean isTokenExpired(String token) {
        Date expiration = getClaimsFromToken(token).getExpiration();
        return expiration.before(new Date());
    }

    private Claims getClaimsFromToken(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}

// === ARCHIVO: src/main/java/com/pragma/payments/infrastructure/controller/PaymentController.java ===
package com.pragma.payments.infrastructure.controller;

import com.pragma.payments.domain.model.Payment;
import com.pragma.payments.application.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public ResponseEntity<Payment> createPayment(@RequestBody PaymentRequest request) {
        Payment payment = new Payment(
                UUID.randomUUID().toString(),
                request.orderId(),
                request.userId(),
                request.amount(),
                request.currency(),
                "PENDING",
                null,
                null,
                null
        );
        Payment created = paymentService.createPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public ResponseEntity<Payment> getPaymentById(@PathVariable String id) {
        return paymentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Payment>> getAllPayments(
            @RequestParam(required = false) String status,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        List<Payment> payments;
        if (status != null && !status.isEmpty()) {
            payments = paymentService.findByStatus(status);
        } else {
            payments = paymentService.getAllPayments();
        }
        return ResponseEntity.ok(payments);
    }

    @GetMapping("/user/{userId}")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public ResponseEntity<List<Payment>> getPaymentsByUser(@PathVariable String userId) {
        List<Payment> payments = paymentService.findByUserId(userId);
        return ResponseEntity.ok(payments);
    }

    @GetMapping("/order/{orderId}")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public ResponseEntity<List<Payment>> getPaymentsByOrder(@PathVariable String orderId) {
        List<Payment> payments = paymentService.findByOrderId(orderId);
        return ResponseEntity.ok(payments);
    }

    @PutMapping("/{id}/status")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Payment> updatePaymentStatus(
            @PathVariable String id,
            @RequestBody StatusUpdateRequest request) {
        return paymentService.findById(id)
                .map(payment -> {
                    Payment updated = paymentService.updatePaymentStatus(payment.id(), request.status());
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}/complete")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Payment> completePayment(@PathVariable String id) {
        return paymentService.findById(id)
                .map(payment -> {
                    Payment completed = paymentService.completePayment(payment.id(), "TXN-" + UUID.randomUUID());
                    return ResponseEntity.ok(completed);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deletePayment(@PathVariable String id) {
        if (paymentService.findById(id).isPresent()) {
            paymentService.deletePayment(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    public record PaymentRequest(
            String orderId,
            String userId,
            String amount,
            String currency
    ) {}

    public record StatusUpdateRequest(String status) {}
}

// === ARCHIVO: src/main/java/com/pragma/payments/infrastructure/exception/GlobalExceptionHandler.java ===
package com.pragma.payments.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationExceptions(
            MethodArgumentNotValidException ex, WebRequest request) {
        Map<String, String> errors = ex.getBindingResult().getFieldErrors().stream()
                .collect(Collectors.toMap(
                        FieldError::getField,
                        error -> error.getDefaultMessage() != null 
                                ? error.getDefaultMessage() 
                                : "Valor inválido",
                        (existing, replacement) -> existing
                ));
        
        ErrorResponse errorResponse = ErrorResponse.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.BAD_REQUEST.value())
                .error("Validation Failed")
                .message("Los datos de entrada no son válidos")
                .details(errors)
                .path(request.getDescription(false).replace("uri=", ""))
                .build();
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(CustomValidationException.class)
    public ResponseEntity<ErrorResponse> handleCustomValidationException(
            CustomValidationException ex, WebRequest request) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.BAD_REQUEST.value())
                .error("Validation Error")
                .message(ex.getMessage())
                .details(ex.getErrors())
                .path(request.getDescription(false).replace("uri=", ""))
                .build();
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(CustomAuthenticationException.class)
    public ResponseEntity<ErrorResponse> handleAuthenticationException(
            CustomAuthenticationException ex, WebRequest request) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.UNAUTHORIZED.value())
                .error("Authentication Failed")
                .message(ex.getMessage())
                .path(request.getDescription(false).replace("uri=", ""))
                .build();
        
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorResponse);
    }

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<ErrorResponse> handleSpringAuthenticationException(
            AuthenticationException ex, WebRequest request) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.UNAUTHORIZED.value())
                .error("Authentication Failed")
                .message("Credenciales inválidas o token expirado")
                .path(request.getDescription(false).replace("uri=", ""))
                .build();
        
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorResponse);
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ErrorResponse> handleAccessDeniedException(
            AccessDeniedException ex, WebRequest request) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.FORBIDDEN.value())
                .error("Access Denied")
                .message("No tienes permisos para acceder a este recurso")
                .path(request.getDescription(false).replace("uri=", ""))
                .build();
        
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorResponse);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(
            ResourceNotFoundException ex, WebRequest request) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.NOT_FOUND.value())
                .error("Resource Not Found")
                .message(ex.getMessage())
                .path(request.getDescription(false).replace("uri=", ""))
                .build();
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponse> handleBusinessException(
            BusinessException ex, WebRequest request) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .timestamp(LocalDateTime.now())
                .status(ex.getStatus().value())
                .error(ex.getStatus().name())
                .message(ex.getMessage())
                .details(ex.getDetails())
                .path(request.getDescription(false).replace("uri=", ""))
                .build();
        
        return ResponseEntity.status(ex.getStatus()).body(errorResponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(
            Exception ex, WebRequest request) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .error("Internal Server Error")
                .message("Ha ocurrido un error inesperado. Por favor, contacte al administrador.")
                .path(request.getDescription(false).replace("uri=", ""))
                .build();
        
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }

    public static class ErrorResponse {
        private LocalDateTime timestamp;
        private int status;
        private String error;
        private String message;
        private Map<String, String> details;
        private String path;

        private ErrorResponse() {}

        public static Builder builder() {
            return new Builder();
        }

        public LocalDateTime getTimestamp() { return timestamp; }
        public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
        public int getStatus() { return status; }
        public void setStatus(int status) { this.status = status; }
        public String getError() { return error; }
        public void setError(String error) { this.error = error; }
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        public Map<String, String> getDetails() { return details; }
        public void setDetails(Map<String, String> details) { this.details = details; }
        public String getPath() { return path; }
        public void setPath(String path) { this.path = path; }

        public static class Builder {
            private LocalDateTime timestamp;
            private int status;
            private String error;
            private String message;
            private Map<String, String> details = new HashMap<>();
            private String path;

            public Builder timestamp(LocalDateTime timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Builder status(int status) {
                this.status = status;
                return this;
            }

            public Builder error(String error) {
                this.error = error;
                return this;
            }

            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Builder details(Map<String, String> details) {
                this.details = details;
                return this;
            }

            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ErrorResponse build() {
                ErrorResponse response = new ErrorResponse();
                response.timestamp = this.timestamp;
                response.status = this.status;
                response.error = this.error;
                response.message = this.message;
                response.details = this.details;
                response.path = this.path;
                return response;
            }
        }
    }
}

// === ARCHIVO: src/main/java/com/pragma/payments/infrastructure/exception/CustomAuthenticationException.java ===
package com.pragma.payments.infrastructure.exception;

public class CustomAuthenticationException extends RuntimeException {
    public CustomAuthenticationException(String message);
}

// === ARCHIVO: src/main/java/com/pragma/payments/infrastructure/exception/CustomValidationException.java ===
package com.pragma.payments.infrastructure.exception;

import java.util.HashMap;
import java.util.Map;

public class CustomValidationException extends RuntimeException {
    private final Map<String, String> errors;

    public CustomValidationException(String message) {
        super(message);
        this.errors = new HashMap<>();
    }

    public CustomValidationException(String message, Map<String, String> errors) {
        super(message);
        this.errors = errors != null ? new HashMap<>(errors) : new HashMap<>();
    }

    public CustomValidationException(String message, String field, String errorMessage) {
        super(message);
        this.errors = new HashMap<>();
        this.errors.put(field, errorMessage);
    }

    public Map<String, String> getErrors() {
        return new HashMap<>(errors);
    }

    public void addError(String field, String errorMessage) {
        this.errors.put(field, errorMessage);
    }
}
```
