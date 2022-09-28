/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alessandro_zatelli;

/**
 *
 * @author spill
 */
public class Pesce {
    
    private String razza;
    private String altezza;
    private String lunghezza;
    private Float veloAcqua;
    private Float velocita;
    private Float profonditaImmersione;
    private Boolean isAffamato;
    
public Pesce() {
    }

    public Pesce(String razza, String altezza,String lunghezza, Float veloAcqua,
        Float velocita,Float profonditaImmersione,Boolean isAffamato) {
        this.razza = razza;
        this.altezza = altezza;
        this.lunghezza = lunghezza;
        this.veloAcqua = veloAcqua;
        this.velocita = velocita;
        this.profonditaImmersione = profonditaImmersione;
        this.isAffamato = isAffamato;
        
        
        public String getrazza() {
        return razza;
    }

    public void setrazza(String razza) {
        this.razza = razza;
    }   }
    
        public String getaltezza() {
        return altezza;
    }

    public void setaltezza(String altezza) {
        this.altezza = altezza;
    }

    
        public String getlunghezza() {
        return lunghezza;
    }

    public void setlunghezza(String lunghezza) {
        this.lunghezza = lunghezza;
    }
   
  

    public Float getveloAcqua() {
        return veloAcqua;
    }

    public void setveloAcqua(Float veloAcqua) {
        this.veloAcqua = veloAcqua;
    }   
    

    public Float getvelocita() {
        return velocita;
    }

    public void setvelocita(Float velocita) {
        this.velocita = velocita;
    }   
    


    public Float getprofonditaImmersione() {
        return profonditaImmersione;
    }

    public void setprofonditaImmersione(Float profonditaImmersione) {
        this.profonditaImmersione = profonditaImmersione;
    }   



}

