/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author David
 */
public class Matriz {

    public void tabla(String[] ciudades, String[] dias, float[][] matriz) {

        for (int i = 0; i < dias.length; i++) {
            if (i == 0) {
                System.out.print("Ciudades/dias");
            }
            System.out.print("\t" + dias[i]);
        }

        for (int f = 0; f < ciudades.length; f++) {
            System.out.print("\n" + ciudades[f]);
            for (int c = 0; c < dias.length; c++) {
                System.out.print("\t" + matriz[f][c]);
            }
        }
    }

    public void mediaDias(float[][] matriz, String[] dias) {

        float[] ac = new float[matriz.length];
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int x = 0; x < matriz.length; x++) {
                ac[i] += matriz[x][i];
            }
            System.out.println("La media de " + dias[i] + " es de " + (ac[i] / ac.length));
        }

    }

    public void mediaCiudades(float[][] matriz, String[] ciudades) {
        float[] ac = new float[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[i].length; x++) {
                ac[i] += matriz[i][x];
            }
            System.out.println("La media de " + ciudades[i] + " es de " + (ac[i] / matriz[i].length));
        }
        
    }

}
