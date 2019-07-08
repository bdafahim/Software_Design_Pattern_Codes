/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite_pattern_file;

import java.util.ArrayList;

/**
 *
 * @author bdafahim
 */
public class Folder implements AbstractFile{
    private String name,cration_time,location;
    private ArrayList includedFiles = new ArrayList();

    public Folder(String name, String cration_time, String location) {
        this.name = name;
        this.cration_time = cration_time;
        this.location = location;
    }
    
    public void add(Object obj) {
        includedFiles.add(obj);
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("   ");
        for (Object includedFile : includedFiles) {
            // Leverage the "lowest common denominator"
            AbstractFile obj = (AbstractFile) includedFile;
            obj.ls();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}
