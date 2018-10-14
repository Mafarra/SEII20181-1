/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletonn;

/**
 *
 * @author aashgar
 */
public class singletonApp {
    public static void main(String[] args) {
        Singlton s1=
                 Singlton.getInstance();
        s1.setData(111);
        Singlton s2 = Singlton.getInstance();
        s2.setData(555);
        System.out.println("S1 data is: "+
                s1.getData());
        System.out.println("S2 data is: "+
                s2.getData());
    }
    
}
