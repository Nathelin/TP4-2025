package modelo;


import java.time.LocalDate;

public class Revista extends Material{

    private int nroEdicion;
    private Periodicidad periodicidad;

    public Revista(int codigo, String titulo, LocalDate fechaPublicacion, int nroEdicion, Periodicidad periodicidad){
        super(codigo, titulo, fechaPublicacion);

        if(nroEdicion <= 0){
            throw new IllegalArgumentException("El numero de edición debe ser mayor que cero.");
        }

        // si peridodicidad no esta o algo

        this.nroEdicion = nroEdicion;
        this.periodicidad = periodicidad;
    }

    public int getNroEdicion(){
        return nroEdicion;
    }

    public Periodicidad getPeriodicidad(){
        return periodicidad;
    }
    

}



/*
 * toca definir el constructor este largo porque no dejamos el implicito en Material
 */