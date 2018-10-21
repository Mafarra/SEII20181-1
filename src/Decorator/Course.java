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
public class Course implements Program{
    protected Program aProgram;
    public Course(Program aProgram){
        this.aProgram = aProgram;
    }
    @Override
    public void view() {
        this.aProgram.view();
    }
    
}
