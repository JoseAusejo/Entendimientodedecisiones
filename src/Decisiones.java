public class Decisiones {

    // Constantes para mayor legibilidad
    private static final int AÑO_ACTUAL = 2024;
    private static final String PLAN_PLUS = "plus";

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String plan = PLAN_PLUS;

        /*
        para comprobar si la película es retro o reciente
          */
        verificarFechaDeLanzamiento(fechaDeLanzamiento);

        // para verificar si la película está disponible en el plan
        verificarDisponibilidad(incluidoEnElPlan, plan);

        //para mostrar la nota de la película
        mostrarNotaDeLaPelicula(notaDeLaPelicula);
    }

    /*
     *Verifica si la película es retro o reciente según su fecha de lanzamiento.
      @para fechaDeLanzamiento Año en que se lanzó la película
     */
    public static void verificarFechaDeLanzamiento(int fechaDeLanzamiento) {
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Película lanzada recientemente, ¡descubre lo más nuevo!");
        } else {
            System.out.println("Película retro (lanzada en " + fechaDeLanzamiento + "), aún vale la pena ver.");
        }
    }

    /*
      Verifica si la película está disponible para el plan del usuario.
      @para incluidoEnElPlan Si la película está incluida en el plan del usuario
     @para plan Tipo de plan que tiene el usuario
     */
    public static void verificarDisponibilidad(boolean incluidoEnElPlan, String plan) {
        if (incluidoEnElPlan && plan.equals(PLAN_PLUS)) {
            System.out.println("La película está disponible en su plan. ¡Disfrútela!");
        } else {
            System.out.println("Lo sentimos, esta película no está disponible en su plan actual.");
        }
    }

    /*
     Muestra la nota que recibió la película.
      @para notaDeLaPelicula Nota de la película (en una escala de 1 a 10)
     */
    public static void mostrarNotaDeLaPelicula(double notaDeLaPelicula) {
        System.out.println("Esta película tiene una puntuación de " + notaDeLaPelicula + " sobre 10.");
    }
}
