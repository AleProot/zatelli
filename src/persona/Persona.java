package persona;

/**
 *
 * @author alessandro.zatelli
 */
public class Persona {
  //attributi in ordine alfabetico
    public Double altezza;
    public String cognome;
    public String dataDiNascita;
    public String nome;
    public Float  peso;

    public Persona() {
    }

    public Persona(Double altezza, String cognome, String dataDiNascita, String nome, Float peso) {
        this.altezza = altezza;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.nome = nome;
        this.peso = peso;
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double altezza) {
        this.altezza = altezza;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

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
