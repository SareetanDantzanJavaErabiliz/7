/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

public class Dantzaria implements DantzariInterfazea {
    private String izena;
    private int adina;
    private String gustukoDantza;
    
    public Dantzaria ( String izena, int adina, String gustukoDantza ) {
        this.izena = izena;
        this.adina = adina;
        this.gustukoDantza = gustukoDantza;
    }
    
    @Override
    public String getIzena( ) {
        return izena;
    }
    
    @Override
    public int getAdina( ) {
        return adina;
    }
    
    @Override
    public String getGustukoDantza( ){
        return gustukoDantza;
    }
    
}
