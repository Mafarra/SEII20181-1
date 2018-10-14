/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletonn;
public class Singlton {    
    // var
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    private static Singlton s = null;
    
    private Singlton() {    }
    
    public static Singlton getInstance(){
        if(s == null)
            s = new Singlton();
     return s;
    }
   
    
    
 
}
