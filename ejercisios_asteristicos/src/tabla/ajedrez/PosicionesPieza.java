package tabla.ajedrez;

import java.util.Arrays;

public abstract class PosicionesPieza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PiezaRey rey = new PiezaRey();
		rey.setNombre("K");
		rey.setNumpieza(2);
		rey.setUbictabla("Blancos: 0,4");
		rey.setUbictabla("Negros: 4,7");
		System.out.println(rey);
		
		
		PiezaReina reina = new PiezaReina();
		reina.setNombre("Q");
		reina.setNumpieza(2);
		reina.setUbictabla("Blancos: 0,3");
		reina.setUbictabla("Negros: 3,7");
		
		
		PiezaTorres torre = new PiezaTorres();
		torre.setNombre("T");
		torre.setNumpieza(4);
		torre.setUbictabla("Blancos: 0,0 ; 0,7");
		torre.setUbictabla("Negros: 7,0 ; 7,7");
		
		
		PiezaAlfiles alfiles = new PiezaAlfiles();
		alfiles.setNombre("A");
		alfiles.setNumpieza(4);
		alfiles.setUbictabla("Blancos: 2,0 ; 5,0");
		alfiles.setUbictabla("Negros: 7,2 ; 7,5");
		
		
		PiezaCaballos caballos = new PiezaCaballos();
		caballos.setNombre("C");
		caballos.setNumpieza(4);
		caballos.setUbictabla("Blancos: 1,0 ; 6,0");
		caballos.setUbictabla("Negros: 7,1 ; 7,6");
		
		
		PiezaPeones peones = new PiezaPeones();
		peones.setNombre("P");
		peones.setNumpieza(16);
		peones.setUbictabla("Blancos:0,1 ; 1,1 ; 2,1 ; 3,1 ; 4,1 ; 5,1 ; 6,1 ; 7,1");
		peones.setUbictabla("Negros:0,6 ; 1,6 ; 2,6 ; 3,6 ; 4,6 ; 5,6 ; 6,6 ; 7,6");
		
		
		
		PiezaRey[][] piezarey = new PiezaRey[8][8];
		piezarey[0][4] = rey;
		piezarey[4][7] = rey;
		
		PiezaReina[][] piezareina = new PiezaReina[8][8];
		piezareina[0][3] = reina;
		piezareina[3][7] = reina;
		
		
		PiezaTorres[][] piezatorres = new PiezaTorres[8][8];
		piezatorres[0][0] = torre;
		piezatorres[0][7] = torre;
		piezatorres[7][0] = torre;
		piezatorres[7][7] = torre;
		
		
		
		PiezaAlfiles[][] piezaalfiles = new PiezaAlfiles[8][8];
		piezaalfiles[2][0] = alfiles;
		piezaalfiles[5][0] = alfiles;
		piezaalfiles[7][2] = alfiles;
		piezaalfiles[7][5] = alfiles;
		
		
		PiezaCaballos[][] piezacaballos = new PiezaCaballos[8][8];
		piezacaballos[1][0] = caballos;
		piezacaballos[6][0] = caballos;
		piezacaballos[7][1] = caballos;
		piezacaballos[7][6] = caballos;
		
		
		PiezaPeones[][] piezapeones = new PiezaPeones[8][8];
		piezapeones[0][1] = peones;
		piezapeones[1][1] = peones;
		piezapeones[2][1] = peones;
		piezapeones[3][1] = peones;
		piezapeones[4][1] = peones;
		piezapeones[5][1] = peones;
		piezapeones[6][1] = peones;
		piezapeones[7][1] = peones;
		piezapeones[0][6] = peones;
		piezapeones[1][6] = peones;
		piezapeones[2][6] = peones;
		piezapeones[3][6] = peones;
		piezapeones[4][6] = peones;
		piezapeones[5][6] = peones;
		piezapeones[6][6] = peones;
		piezapeones[7][6] = peones;
		
		
		System.out.println("Juego Ajedrez");
		System.out.println(Arrays.toString(piezatorres));
		
		

		
	}
}
