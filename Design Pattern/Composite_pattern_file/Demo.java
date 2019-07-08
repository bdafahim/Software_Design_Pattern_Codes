/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite_pattern_file;

/**
 *
 * @author bdafahim
 */
public class Demo {
    public static void main(String[] args) {
        Folder Music = new Folder("Music", "1.00", "/c");
    Folder ScorPions = new Folder("Scorpions", "1.10", "/c/d");
    Folder kala = new Folder("kala", "1.20", "/c/d/e");
    File track1 = new File("I'll be there for u", 
            ".mp3", "10mb", "/c");
    
    File track2 = new File("I'll be there for u2", 
            ".mpu", "10mb", "/c/d");
    File track3 = new File("I'll be there for u3", 
            ".mp4", "10mb", "/c");
    File track4 = new File("I'll be there for u4", 
            ".mp3", "20mb", "/c");
    
    Music.add(track1);
    Music.add(ScorPions);
    Music.add(track2);
    ScorPions.add(track1);
    ScorPions.add(kala);
    Music.ls();
 }
    
    
}
