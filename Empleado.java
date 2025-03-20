package es.ies.curavalera.Jose;


/**
 *
 * @author yo misma
 */
public class Empleado {
    private String getDni() {
        return dni;
    }

    private void setDni(String dni) {
        this.dni = dni;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private String getCargo() {
        return cargo;
    }

    private void setCargo(String cargo) {
        this.cargo = cargo;
    }

    private int getNumHijos() {
        return numHijos;
    }

    private void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cargo='" + cargo + '\'' +
                ", numHijos=" + numHijos +
                '}';
    }

    String dni;
    String nombre;
    String direccion;
    String cargo;
    int numHijos;
    
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    public double calcula_sueldo(double base){
        double total=base;
        
        if(cargo.equals("ENCARGADO"))
            total+=300;
        else if(cargo.equals("DIRECTOR"))
            total+=1000;
        if(numHijos>=3)
            total+=numHijos*50;
        return total;
    }
}
