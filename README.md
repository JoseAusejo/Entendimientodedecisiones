# Decisiones - Aplicación de Evaluación de Películas

Este proyecto en Java permite realizar decisiones sencillas relacionadas con películas, tales como verificar si una película es retro o reciente, si está disponible en el plan del usuario y mostrar la calificación que recibió. El programa está diseñado para ilustrar el uso de métodos y constantes en un contexto sencillo.

## Estructura del Código

El archivo `Decisiones.java` contiene una clase principal que ejecuta varias funciones básicas relacionadas con películas. A continuación, se detallan las funciones implementadas:

### 1. `verificarFechaDeLanzamiento(int fechaDeLanzamiento)`
Este método toma como parámetro el año de lanzamiento de la película y determina si es una película reciente (posterior a 2022) o si es retro (lanzada antes de 2022).

- **Parámetro**: `fechaDeLanzamiento` - Año en que se lanzó la película.
- **Salida**: Un mensaje indicando si la película es reciente o retro.

### 2. `verificarDisponibilidad(boolean incluidoEnElPlan, String plan)`
Este método evalúa si la película está incluida en el plan del usuario. Si el plan es de tipo `plus` y la película está incluida, se mostrará un mensaje confirmando su disponibilidad; de lo contrario, se informará que no está disponible.

- **Parámetros**:
  - `incluidoEnElPlan`: Un valor booleano que indica si la película está incluida en el plan.
  - `plan`: El tipo de plan del usuario.
- **Salida**: Un mensaje que indica si la película está disponible o no en el plan.

### 3. `mostrarNotaDeLaPelicula(double notaDeLaPelicula)`
Este método simplemente muestra la calificación que recibió la película, en una escala de 1 a 10.

- **Parámetro**: `notaDeLaPelicula` - La puntuación de la película.
- **Salida**: Un mensaje mostrando la puntuación de la película.

## Uso

Este programa se puede ejecutar directamente desde un entorno de desarrollo integrado (IDE) compatible con Java o desde la línea de comandos, una vez que se haya compilado.

1. **Compilar el código**:
    ```bash
    javac Decisiones.java
    ```

2. **Ejecutar el código**:
    ```bash
    java Decisiones
    ```

Al ejecutar el programa, se mostrará en consola:

- Si la película es reciente o retro.
- Si la película está disponible en el plan `plus`.
- La calificación de la película.

## Variables

- `AÑO_ACTUAL`: Año de referencia (actual), se usa para comparar si la película es retro o reciente.
- `PLAN_PLUS`: Constante que representa el plan `plus`.
- `fechaDeLanzamiento`: Año de lanzamiento de la película.
- `incluidoEnElPlan`: Booleano que indica si la película está incluida en el plan del usuario.
- `notaDeLaPelicula`: Puntuación de la película en una escala de 1 a 10.
- `plan`: Tipo de plan del usuario.

## Ejemplo de salida

Al ejecutar el programa con los valores predeterminados, el resultado en la consola será:

