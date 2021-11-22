/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

public class Polimorfismoa {

    public static void main( String[] parametroak ) {
        //3 izaki bizidun sortu
        IzakiBizidunak izakiBat = new IzakiBizidunak( );
        IzakiBizidunak dantzariT = new DantzariTradizionala( );
        IzakiBizidunak dantzariK = new DantzariKlasikoa( );
        
        // Izaki bakoitzaren mugimendu mota bistaratu
        // metodo bera erabiltzen dugu
        // baina kontuan hartzen da metodoa deitzen duen objektua
        // polimorfismoaren erabilpena egiten ari gara
        izakiBat.mugitu( );
        dantzariT.mugitu( );
        dantzariK.mugitu( );
    }
    
}
