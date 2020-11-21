/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan57.Vehicle;

/**
 *
 * @author
 * Nama  : Abraham Rumayara
 * KELAS : IF10K
 * NIM   : 10119905
 * Deskripsi Program : Program Vehicle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle objBicycle = new Bicycle();
        System.out.println("Bicycle");
        objBicycle.setMyBrand("Trek Bike");
        objBicycle.setMyModel("7.4 FX");
        objBicycle.setMyGearCount(23);
        objBicycle.getMyBrand();
        objBicycle.getMyModel();
        objBicycle.getMyGearCount();
        
        System.out.println();
        
        Skateboard objSkateBoard = new Skateboard();
        System.out.println("SkateBoard");
        objSkateBoard.setMyBrand("Ally Skate");
        objSkateBoard.setMyModel("Rocket");
        objSkateBoard.setMyBoardLength(54.5);
        objSkateBoard.getMyBrand();
        objSkateBoard.getMyModel();
        objSkateBoard.getMyBoardLength();
        System.out.println();
        
    }
    
}
