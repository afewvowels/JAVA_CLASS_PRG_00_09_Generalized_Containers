/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalizedcontainers;

/**
 * Generalized stack class
 * @author kbsmith01
 */
public class Stack {
    
    private Object[] contents;
    private int top;

    public Stack(int size) {
        this.contents = new Object[size];
        top = 0;
    }
    
    public void push(Object x) {
        this.contents[top++] = x;
    }
    
    public Object pop() {
        return this.contents[--top];
    }
}
