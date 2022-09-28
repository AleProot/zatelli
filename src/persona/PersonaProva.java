package persona;

/**
 *
 * @author alessandro.zatelli
 */
public class PersonaProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        
        Persona p2 = new Persona(1.80, "Zatelli", "13/03/2005", "Alessandro", 78f);
        
        String info = p2.info();
        
        System.out.println(info);
        
        
        
    }
    
}
