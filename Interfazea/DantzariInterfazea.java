/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU
 */

public interface DantzariInterfazea {

    //metodo abstraktuak dira
    //abstract gako-hitza ez da beharrezkoa
    String getIzena( );
    int getAdina( );
    String getGustukoDantza( );

    //lehenetsitako metodoa
    default void goraDantzariak( ) {
        System.out.println( "Biba euskal dantza maite dutenak!" );
    }
    
}
