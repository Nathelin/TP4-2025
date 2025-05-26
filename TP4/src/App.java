import modelo.*;


public class App {
    public static void main(String[] args) throws Exception {

        var principito = new Libro(1, "El Principito", java.time.LocalDate.of(2021, 5, 11), "Alguien", 233);
        var lector = new Lector("Juan", "Perez", "12345678", "EMAIL");
        var prestamo = new modelo.Prestamo(lector);
        //prestamo.agregarMaterial(principito);
        // otro mas


/* 
        for(var p : lector.getPrestamos()){
            System.out.println(p.getMateriales());
            
        }
        
    }
*/

    // FALTA CREAR OBJETOS E INVOCARLOS ACÁ. ESTA ES LA ÚNICA PARTE INCOMPLETA

    
}}
