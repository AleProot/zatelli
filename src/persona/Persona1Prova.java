package persona;

/**
 *
 * @author alessandro.zatelli
 */
public class Persona1Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona1 p1 = new Persona1();
        
        Persona1 p2 = new Persona1(1.70, "Zatelli", "13/03/2005", "Alessandro", 78f);
        
        String info = p2.info();
        
        System.out.println(info);
        
        
        
    }
    
}
