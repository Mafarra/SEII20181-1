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
public class BscDegree implements Degree{

    @Override
    public Title getTitle() {
        return new BscTitle();
    }

    @Override
    public Content getContent() {
        return new BscContent();
    }
    
}
