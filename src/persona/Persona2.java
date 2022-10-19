

package persona;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author alessandro.zatelli
 */
public class Persona2 {
  //attributi in ordine alfabetico
    public Double altezza;
    public String cognome;
    public String nome;
    public Float  peso;

    private String dataDiNascita;
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
    public Persona2(Double altezza, String cognome, String nome, Float peso, String dataDiNascita) {
        this.altezza = altezza;
        this.cognome = cognome;
        this.nome = nome;
        this.peso = peso;
        
        this.setDataDiNascita(dataDiNascita);
    }
    /**
     * Restituisce l'altezza della persona 
     * 
     * @return altezza
     */
    public Double getAltezza() {
        return this.altezza;
    }

    /**
     * Imposta l'altezza della persona
     * 
     * @param altezza 
     */
    
    public void setAltezza(Double altezza) {
        
        System.out.println("persona.Persona2.setAltezza()");

        
        this.altezza = altezza;
    }

    /**
     * Restituisce il cognome della persona
     * 
     * @return cognome
     */
    
    public String getCognome() {
        return this.cognome;
    }

    /**
     * Imposta il cognome della persona
     * 
     * @param cognome 
     */
    
    public void setCognome(String cognome) {
        
        System.out.println("persona.Persona2.setCognome()");

        
        this.cognome = cognome;
    }

    /**
     * Restituisce il nome della persona
     * 
     * @return nome 
     */
    
    public String getNome() {
        return this.nome;
    }

    /**
     * Imposta il nome della persona
     * 
     * @param nome 
     */
    
    public void setNome(String nome) {
        
        
        System.out.println("persona.Persona2.setNome()");
        
        
        this.nome = nome;
    }

    /**
     * Restituisce il peso della persona
     * 
     * @return peso
     */
    
    public Float getPeso() {
        return this.peso;
    }

    /**
     * Imposta il peso della persona
     * 
     * @param peso 
     */
    
    public void setPeso(Float peso) {
        
        
        System.out.println("persona.Persona2.setPeso()");

        
        this.peso = peso;
    }

    
            /**
     * Restituisce la data di nascita della persona
     * 
     * @return dataDiNascita 
     */
    
    public String getDataDiNascita(){
     

        return this.dataDiNascita;
    }

    /**
     * Imposta la data di nascita della persona
     * 
     * @param dataDiNascita 
     */
    
    final public void setDataDiNascita(String dataDiNascita){
        String annoDiNascitaString, meseDiNascitaString, giornoDiNascitaString;
        Integer annoDiNascita, meseDiNascita, giornoDiNascita;
        Boolean valida = false;
        
        giornoDiNascitaString = dataDiNascita.substring(0, 2);
        meseDiNascitaString = dataDiNascita.substring(3, 5);
        annoDiNascitaString = dataDiNascita.substring(6, 10);
        
        giornoDiNascita = Integer.parseInt(giornoDiNascitaString);
        meseDiNascita = Integer.parseInt(meseDiNascitaString);
        annoDiNascita = Integer.parseInt(annoDiNascitaString);
        
        if (annoDiNascita >= 1000 && annoDiNascita <= 9999) {
            switch (meseDiNascita) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (giornoDiNascita >= 1 && giornoDiNascita <= 31) {
                        valida = true;
                        
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (giornoDiNascita >= 1 && giornoDiNascita <= 30) {
                        valida = true;
                        
                    }
                    break;
                case 2: 
                    if (annoDiNascita % 400 == 0 || (annoDiNascita % 4 == 0 &&
annoDiNascita % 100 != 0)){
                        if(giornoDiNascita >= 1 && giornoDiNascita <= 29)
                            valida = true;
                        } else
                            if(giornoDiNascita >= 1 && giornoDiNascita <= 28)
                                valida = true;
                    }
            }
        
        if (valida) {
            this.dataDiNascita = dataDiNascita;
        
        
        }
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