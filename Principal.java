public class Principal {
    public static void main(String[] args) {

        Persona p1=new Persona("Rogelio",19,"Masculino","Hidalgo");
        Estudiante e1=new Estudiante("Valeria",19,"Femenino","Atlacomulco Edo.Mex",
                "1816897","Paradigmas de la Programación","9.1");
        Estudiante e2=new Estudiante("Said",18,"M","SanFe","5543","Matematicas","14");
        e1.mostrarInfo();
        System.out.println("------------------------------------------------------------------------------");
        p1.mostrarInfo();
        e1.verCalificación();
        e2.mostrarInfo();
    }
}
