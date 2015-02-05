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
public class Main {
        
    public static void main(String[] args) {
        
        String [] dias = {"Lun", "Mier", "Vier"};
        String [] ciudades = {"      Vigo","  Santiago","Pontevedra","    Orense"};
        float [][]matriz = {{11f,15f,12f},{25f,67f,12f},{45f,23f,12f},{12f,74f,32f}};
        
        Matriz obj = new Matriz();
        
        obj.tabla(ciudades, dias, matriz);
        System.out.println("\n");
        obj.mediaDias(matriz, dias);
        System.out.println("\n");
        obj.mediaCiudades(matriz, ciudades);
        
    }
}
