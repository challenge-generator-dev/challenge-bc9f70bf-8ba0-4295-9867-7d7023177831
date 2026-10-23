# Mejora de Seguridad y Legibilidad en la Aplicación de Pagos

La aplicación de pagos de nuestra empresa ha crecido rápidamente, pero la autenticación actual es improvisada y la configuración está dispersa. El sistema maneja un volumen de 5 000 transacciones por hora durante las horas pico y debe mantener una tasa de error inferior al 1%. Necesitamos un experto en frameworks que mejore la seguridad y la legibilidad del código.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Frameworks · Especialista en Framework con Proficiencia en Seguridad y Legibilidad de Código |
| **Nivel** | advanced-l3 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Diagnóstico de la Autenticación Actual

**Objetivo:** Identificar las debilidades en la autenticación actual y la configuración dispersa.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza el sistema de pagos para identificar las debilidades en la autenticación actual.
- Documenta las áreas de la configuración que están dispersas y sugiere cómo centralizarlas.

**Entregable:** Reporte de diagnóstico con áreas de mejora identificadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los mecanismos de autenticación existentes y su efectividad.
- Piensa en cómo la centralización de la configuración puede mejorar la legibilidad y mantenibilidad del código.

</details>

### Fase 2: Implementación de Mecanismos de Autenticación

**Objetivo:** Implementar dos mecanismos de autenticación del framework.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Elige dos mecanismos de autenticación del framework y impleméntalos en la aplicación.
- Asegúrate de que los mecanismos elegidos mejoren la seguridad y la legibilidad del código.

**Entregable:** Aplicación con dos mecanismos de autenticación implementados.

<details>
<summary>Pistas de conocimiento</summary>

- Revisa la documentación del framework para identificar los mejores mecanismos de autenticación.
- Considera cómo estos mecanismos pueden ser integrados de manera que mejoren tanto la seguridad como la legibilidad del código.

</details>

### Fase 3: Centralización de la Configuración

**Objetivo:** Centralizar la configuración de la aplicación.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Centraliza la configuración dispersa en un único lugar.
- Asegúrate de que la centralización mejora la legibilidad y mantenibilidad del código.

**Entregable:** Aplicación con configuración centralizada.

<details>
<summary>Pistas de conocimiento</summary>

- Identifica todas las áreas donde la configuración está dispersa.
- Piensa en cómo puedes centralizar la configuración de manera que sea fácil de mantener y entender.

</details>

### Fase 4: Reducción de Redundancia

**Objetivo:** Reducir la redundancia en el código.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica y elimina la redundancia en el código.
- Asegúrate de que la eliminación de la redundancia mejora la legibilidad y mantenibilidad del código.

**Entregable:** Aplicación con redundancia reducida.

<details>
<summary>Pistas de conocimiento</summary>

- Busca patrones comunes en el código que puedan ser refactorizados.
- Considera cómo la eliminación de la redundancia puede mejorar la legibilidad y mantenibilidad del código.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los mecanismos de autenticación y por qué son importantes en una aplicación de pagos?
- **paraQueSirve**: ¿Cómo la centralización de la configuración mejora la legibilidad y mantenibilidad del código?
- **comoSeUsa**: ¿Cómo implementaste los mecanismos de autenticación en la aplicación?
- **erroresComunes**: ¿Qué errores comunes encontraste en la autenticación actual y cómo los solucionaste?
- **queDecisionesImplica**: ¿Qué decisiones tomaste al elegir los mecanismos de autenticación y cómo justificaste tu elección?

## Criterios de Evaluacion

- Identificación de debilidades en la autenticación actual y configuración dispersa.
- Implementación de dos mecanismos de autenticación del framework.
- Centralización de la configuración en un único lugar.
- Reducción de la redundancia en el código.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT). Devuelve un ZIP con el proyecto. Sirve si no tenes un agente en el IDE.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn clean compile
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
