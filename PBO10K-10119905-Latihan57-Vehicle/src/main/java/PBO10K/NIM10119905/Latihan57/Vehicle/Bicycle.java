/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan57.Vehicle;

/**
 *
 * @author aruma
 */
public class Bicycle extends Vehicle {
    private int myGearCount;

    public int getMyGearCount() {
        System.out.println("Jumlah Gear : "+myGearCount);
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
    
}
