package modelo;

import java.time.LocalDate;

public abstract class Material {
    private int codigo;
    private String titulo;
    private LocalDate fechaPublicacion;
    private boolean disponible = true;

    public Material(int codigo, String titulo, LocalDate fechaPublicacion) {
        if(titulo.trim().isEmpty()){
            throw new IllegalArgumentException("El autor no puede no ser nadie. SOS TONTO?");
        }

        if(fechaPublicacion.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("sos o te haces");
        }

        this.codigo = codigo;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public LocalDate getfechaPublicacion(){
        return fechaPublicacion;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public void marcarComoPrestado(){
        this.disponible = false;
    }

    public void marcarComoDisponible(){
        this.disponible = true;
    }
    

}
