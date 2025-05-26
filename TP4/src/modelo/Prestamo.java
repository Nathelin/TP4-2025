package modelo;


import java.time.LocalDate;
import java.util.ArrayList;

public class Prestamo{

    private Lector lector;
    private LocalDate fechaPrestamo = LocalDate.now();
    private LocalDate fechaDevolucion = fechaPrestamo.plusDays(7);
    private LocalDate fechaEntrega;
    private ArrayList<Material> materiales = new ArrayList<>();

    public Prestamo(Lector lector){
        if(lector == null){
            throw new IllegalArgumentException("El lector no puede ser nulo");
        }

        this.lector = lector;
        this.lector.agregarPrestamo(this);
    }

    public void agregarMaterial(Material material){
        if(material == null){
            throw new IllegalArgumentException("El material no puede ser nulo");
        }
        if (!material.isDisponible()){
            throw new IllegalArgumentException("El material no está disponible");
        }
        this.materiales.add(material);
        material.marcarComoPrestado();
    }



    public void devolver() {
        this.fechaEntrega = LocalDate.now();
        for(var material : this.materiales){
            material.marcarComoDisponible();
        }

    }   
}
