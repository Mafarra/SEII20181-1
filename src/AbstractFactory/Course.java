/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author aashgar
 */
public class Course {
    private Title aTitle;
    private Content aContent;
    private Degree aDegree;
    private static Course aCourse;
    private Course(){}
    public static Course getCourse(){
        if(aCourse == null)
            aCourse = new Course();
        return aCourse;
    }
    public void setDegree(Degree aDegree){
        this.aDegree = aDegree;
    }
    public void viewData(String aTitle, String aContent){
        this.aTitle = this.aDegree.getTitle();
        this.aContent = this.aDegree.getContent();
        System.out.println("Processing Course .....");
        this.aTitle.view(aTitle);
        this.aContent.view(aContent);
        System.out.println("==================");
        
        
    }
    
}
