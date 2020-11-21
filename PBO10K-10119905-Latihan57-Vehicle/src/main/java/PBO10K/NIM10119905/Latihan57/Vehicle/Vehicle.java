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
public class Vehicle {
    private String myBrand;
    private String myModel;

    public String getMyBrand() {
        System.out.println("Brand : "+myBrand);
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
        
    }

    public String getMyModel() {
        System.out.println("Model : "+myModel);
        return myModel;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
    
    
}
