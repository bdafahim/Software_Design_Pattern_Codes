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
public class RealImage implements Image{
    
    String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }
    

    @Override
    public void display() {
        System.out.println("displaying__ "+filename);
    }
    
    public void loadFromDisk(String filename)
    {
        System.out.println("Loading......"+filename);
    }
    
}
