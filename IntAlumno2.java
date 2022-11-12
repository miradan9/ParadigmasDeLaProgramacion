public interface IntAlumno2{
    void mostratGrado();
    int obtenerAñosdeCarrera();
    public abstract void entrarCurso();
    default void mostrarHorario(){
        System.out.println("Horario corrido");
    }
}
