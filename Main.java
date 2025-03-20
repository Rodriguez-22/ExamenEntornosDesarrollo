package es.ies.curavalera.Jose;

/**
 *
 * @author yo misma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado persona = new Empleado("1245678M","Perico de los Palotes");

        imprimirEmpleado(persona);
    }

    private static void imprimirEmpleado(Empleado persona) {
        persona.direccion="C/del Pez,6";
        persona.numHijos=3;
        System.out.println("DNI: "+ persona.dni);
        System.out.println("Nombre: "+ persona.nombre);
        System.out.println("Cargo: "+ persona.cargo);
        System.out.println("Número de hijos: "+ persona.numHijos);
        System.out.println("Sueldo: "+ persona.calcula_sueldo(1200));
    }

}
