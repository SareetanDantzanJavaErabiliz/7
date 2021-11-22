/*
 * 
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU. * 
*/

public class SA5_1AD {
    public static void main( String[ ] parametroak ) {
        ZirkuluInplementatzailea zi = new ZirkuluInplementatzailea( 4.0f );
        
        System.out.println( "\n\nPerimetroa: "+zi.perimetroa( ) ); //Interfazeko metodoari deia
        zi.bistaratuDatuak( ); //Metodo propioari deia
        
        System.out.println( "\n\nPerimetroa: "+zi.perimetroa( 3.0f ) ); //Metodo gainkargatu propioari deia
        zi.bistaratuDatuak( ); //Metodo propioari deia: emaitza, aurrekoaren ezberdina       
    }
}
