package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lector {
    private String nombres;
    private String apellidos;
    private String dni;
    private String email;
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public Lector(String nombres, String apellidos, String dni, String email) {
        if (nombres.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (apellidos.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        if (dni.trim().isEmpty()) {
            throw new IllegalArgumentException("El DNI no puede estar vacío");
        }
        if (email.trim().isEmpty()) {
            throw new IllegalArgumentException("El email no puede estar vacío");
        }

        this.nombres = nombres.trim();
        this.apellidos = apellidos.trim();
        this.dni = dni.trim();
        this.email = email.trim();
    }

    public void agregarPrestamo(Prestamo prestamo) {
        if (prestamo == null) {
            throw new IllegalArgumentException("El préstamo no puede ser nulo");
        }
        prestamos.add(prestamo);
        
    }
    
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
}
