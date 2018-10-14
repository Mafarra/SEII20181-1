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
public class AbstractFactoryApp {
    public static void main(String[] args) {
        Course aCourse = Course.getCourse();
        aCourse.setDegree(new BscDegree());
        aCourse.viewData("Software Engineering 2", 
                "This course provides the students with professional"
                        + " knowledge and practicess ...");
        
        aCourse.setDegree(new MscDegree());
        aCourse.viewData("Advanced Software Engineering", 
                "This course provides the students with professional"
                        + " knowledge and practicess ...");
    }
}
