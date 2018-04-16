/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalizedcontainers;

import java.util.ArrayList;
/**
 * Generalized stack class
 * @author kbsmith01
 */
public class Stack<E> {
    
    /* Original stack class
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
    */
    
    private ArrayList<E> contents;
    private int top;
    
    public Stack() {
        this.contents = new ArrayList();
        this.top = 0;
    }
    
    public void push(E x) {
        this.contents.add(0, x);
    }
    
    public E pop() {
        return this.contents.remove(0);
    }
}
