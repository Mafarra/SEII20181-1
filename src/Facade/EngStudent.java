/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author aashgar
 */
public class EngStudent implements Student{

    @Override
    public void view() {
        System.out.println("I'm Engineering student, "+
                "I am an engineer !?!?");
    }
}
