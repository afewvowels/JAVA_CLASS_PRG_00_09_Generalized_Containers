/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalizedcontainers;

/**
 *
 * @author kbsmith01
 */
public class Stack {
    
    private String[] contents;
    private int top;

    public Stack() {
        this.contents = new String[100];
        top = 0;
    }
    
    public void push(String x) {
        this.contents[top++] = x;
    }
    
    public String pop() {
        return this.contents[--top];
    }
}
