/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author aashgar
 */
public class factoryApp {
    public static void main(String[] args) {
        Student it1 = factoryDp.getStudent("IT");
        it1.view();
        Student it2 = factoryDp.getStudent("IT");
        it2.view();
        Student eng = factoryDp.getStudent("eng");
        eng.view();
        Student art = factoryDp.getStudent("Art");
        art.view();
    }
}
