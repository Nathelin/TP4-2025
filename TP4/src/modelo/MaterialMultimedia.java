package modelo;


import java.time.LocalDate;

public class MaterialMultimedia extends Material{

    private String formato;
    private double tamanioMegaBytes;

    public MaterialMultimedia(int codigo, String titulo, LocalDate fechaPublicacion, String formato, double tamanioMegaBytes){
        super(codigo, titulo, fechaPublicacion);

        if(tamanioMegaBytes <= 0){
            throw new IllegalArgumentException("El numero de edición debe ser mayor que cero.");
        }

        if(formato.trim().isEmpty()){
            throw new IllegalArgumentException("El formato no puede estar vacio carancho");
        }

        this.formato = formato;
        this.tamanioMegaBytes = tamanioMegaBytes;
    }

    public String getFormato(){
        return formato;
    }

    public double getTamanioMegaBytes(){
        return tamanioMegaBytes;
    }
    

}
