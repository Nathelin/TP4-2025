package modelo;

import java.time.LocalDate;

public class Libro extends Material{

    private String autor;
    private int nroPaginas;

    public Libro(int codigo, String titulo, LocalDate fechaPublicacion, String autor, int nroPaginas){
        super(codigo, titulo, fechaPublicacion);

        if(nroPaginas <= 0){
            throw new IllegalArgumentException("El numero de paginas debe ser mayor que cero.");
        }

        if(autor.trim().isEmpty()){
            throw new IllegalArgumentException("El autor no puede no ser nadie. SOS TONTO?");
        }

        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public String getAutor(){
        return autor;
    }

    public int getNroPagubas(){
        return nroPaginas;
    }
    
    // WAWAWAWAWAWWWAWAWAWWAWAWAWAWAWAWAWAWAWAWAWWAWAWAWAWAAWAWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWAAAAAAAAAAAAAAAAA

    /*
     * apps de escritorio: se suele hacer la validación en el modelo. 
     */

}
