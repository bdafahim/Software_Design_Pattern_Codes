/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_pattern;

/**
 *
 * @author bdafahim
 */
public class ProxyImage implements Image{
    String filename;
    RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if(realImage==null)
        {
            realImage = new RealImage(filename);
        }
        
        realImage.display();
    }
    
}
