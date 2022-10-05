package persona;

/**
 *
 * @author alessandro.zatelli
 */
public class Persona2 {
  //attributi in ordine alfabetico
    public Double altezza;
    public String cognome;
    public String dataDiNascita;
    public String nome;
    public Float  peso;

    
    /**
     * Costruttore della classe Persona senza parametri
     */
    
    
    public Persona2() {
    }
    /**
     * 
     * @param altezza
     * @param cognome
     * @param dataDiNascita
     * @param nome
     * @param peso 
     */
    public Persona2(Double altezza, String cognome, String dataDiNascita, String nome, Float peso) {
        this.altezza = altezza;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.nome = nome;
        this.peso = peso;
    }
    /**
     * Restituisce l'altezza della persona 
     * 
     * @return altezza
     */
    public Double getAltezza() {
        return altezza;
    }

    /**
     * Imposta l'altezza della persona
     * 
     * @param altezza 
     */
    
    public void setAltezza(Double altezza) {
        this.altezza = altezza;
    }

    /**
     * Restituisce il cognome della persona
     * 
     * @return cognome
     */
    
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome della persona
     * 
     * @param cognome 
     */
    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce la data di nascita della persona
     * 
     * @return dataDiNascita 
     */
    
    public String getDataDiNascita(){
        
        
        return dataDiNascita;
    }

    /**
     * Imposta la data di nascita della persona
     * 
     * @param dataDiNascita 
     */
    
    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    /**
     * Restituisce il nome della persona
     * 
     * @return nome 
     */
    
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome della persona
     * 
     * @param nome 
     */
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il peso della persona
     * 
     * @return peso
     */
    
    public Float getPeso() {
        return peso;
    }

    /**
     * Imposta il peso della persona
     * 
     * @param peso 
     */
    
    public void setPeso(Float peso) {
        this.peso = peso;
    }

    /**
     * Restituisce le caratteristiche della persona
     * 
     * @return Riepilogo caratteristiche
     */
    
    public String info(){
        String info;

        info = "Cognome        :" + this.cognome + "\n" 
             + "Nome           :" + this.nome + "\n"
             + "Altezza        :" + this.altezza + "\n"
             + "Peso           :" + this.peso + "\n"
             + "Data di nascita:" + this.dataDiNascita + "\n";
        
        return info;
                
                
    }
    
     
    
}
