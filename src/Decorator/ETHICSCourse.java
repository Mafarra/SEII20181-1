/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author aashgar
 */
public class ETHICSCourse extends Course{
    
    public ETHICSCourse(Program aProgram) {
        super(aProgram);
    }
    @Override
    public void view(){
        super.view();
        System.out.println("Ethics for Profession ...");
    }
}
