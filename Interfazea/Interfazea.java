/*
 * 
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU. * 
*/

public class Interfazea {

    public static void main( String[ ] parametroak ) {
        
        Dantzaria dantzariBat = new Dantzaria( "Manex", 18, "Lizarrako Larrain Dantza" );
        
        System.out.println( "Dantzariaren izena: "+dantzariBat.getIzena( ) );
        System.out.println( "Adina: "+dantzariBat.getAdina( ) );
        System.out.println( "Gustuko dantza: "+dantzariBat.getGustukoDantza( ) );

        //goraDantzariak metodoa lehenetsitako metodoa da
        //DantzariInterfazea interfazean definituta dago
        //Beraz, dantzariBat objketuak erabil dezake
        dantzariBat.goraDantzariak( );
    }
}
