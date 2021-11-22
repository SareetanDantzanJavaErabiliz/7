/*
 * 
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU. * 
*/

public class ZirkuluInplementatzailea implements EragiketaGeometrikoak {

    private float radioa;
    
    ZirkuluInplementatzailea( float radioa ) {
        this.radioa=radioa;
    }
    
    public float perimetroa () { //BIRDEFINIZIOA: klasea abstract izan ez dadin. final bakarrik gehi daiteke
        return 2 * PI * radioa;
    }
    
    float perimetroa( float radioa ) { 

        //GAINKARGA: ez du abstract kentzeko balio, EZ DA BIRDEFINIZIOA. Izena ezik, best guztia ezberdina izan daiteke
        this.radioa = radioa;
        return perimetroa( );
    }    
    
    public float azalera( ) {
        return 2 * PI * ( radioa * radioa );
    }
    
    float azalera( float radioa ) {
        this.radioa = radioa;
        return azalera( );
    }
    
    public float bolumena( ) {
        return ( 4 * PI * ( radioa * radioa * radioa ) ) / 3;
    }
    
    float bolumena( float radioa ) {
        this.radioa = radioa;
        return bolumena( );
    }
    
    void bistaratuDatuak( ) {
        System.out.println( "\nZirkuluInplementatzailearen datuak ");
        System.out.println( "==================================== " );
        System.out.println( "Radioa: "+radioa+"\tPerimetroa: "+perimetroa( )+" m \tAzalera: "+azalera( )+" m2 \tBolumena: "+bolumena( )+" m3" );
    }
}
