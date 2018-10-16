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
public class StudentMaker {
    private Student itStudent;
    private Student engStudent;
    private Student artStudent;
    private static StudentMaker aStudentMaker;
    private StudentMaker(){
        itStudent = new ItStudent();
        engStudent = new EngStudent();
        artStudent = new ArtStudent();
    }
    public static StudentMaker getStudentMaker(){
        if(aStudentMaker == null)
            aStudentMaker = new StudentMaker();
        return aStudentMaker;
    }
    public void viewIt(){
        itStudent.view();
    }
    public void viewEng(){
        engStudent.view();
    }
    public void viewArt(){
        artStudent.view();
    }
    
}
