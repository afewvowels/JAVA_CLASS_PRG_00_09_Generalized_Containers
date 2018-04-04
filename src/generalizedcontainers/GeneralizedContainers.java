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
public class GeneralizedContainers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack s = new Stack(100);
        
        // Can push any type of item onto the stack like...
        // ...strings
        s.push("Larry");
        s.push("Curly");
        s.push("Moe");
        
        // ...ints
        s.push("999");
        
        // ...stacks
        s.push(s);
        
        // Have to cast type to assign, otherwise
        // popping a generic type and assigning it
        // to a specific type.
        Stack stack = (Stack)s.pop();
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    
}
