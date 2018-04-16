/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalizedcontainers;

/**
 * Stores single value of single given type
 * @author kbsmith01
 */
public class Box<typeToBeDetermined> {
    private typeToBeDetermined contents;
    
    public Box(typeToBeDetermined contents) {
        this.contents = contents;
    }
    
    public typeToBeDetermined getContents() {
        return this.contents;
    }
    
    public void setContents(typeToBeDetermined contents) {
        this.contents = contents;
    }
}
