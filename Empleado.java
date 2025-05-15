package co.edu.uniquindio.poo;

public class Empleado extends Persona{
    private int edad;

    public Empleado(String nombre, String apellido, String cedula, String telefono, int edad) {
        super(nombre, apellido, cedula, telefono);
        this.edad = edad;
        assert !nombre.isEmpty();
        assert !cedula.isEmpty();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    @Override
    public String toString() {
        return "Empleado: " + super.toString() + ", edad: " + edad;
    }


}
