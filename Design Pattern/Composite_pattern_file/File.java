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
public class File implements AbstractFile{
    
    String Name,extension,size,location;

    public File(String Name, String extension, String size, String location) {
        this.Name = Name;
        this.extension = extension;
        this.size = size;
        this.location = location;
    }
    

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder +Name+" "+extension+" "+size+" "+location);
    }
    
}
