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
public class Skateboard extends Vehicle{
    private double myBoardLength;

    public double getMyBoardLength() {
        System.out.println("Panjangnya Board : "+myBoardLength);
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
    
    
}
