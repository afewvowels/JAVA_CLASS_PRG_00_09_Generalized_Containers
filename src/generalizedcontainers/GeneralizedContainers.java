/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalizedcontainers;

import java.util.ArrayList;

/**
 *
 * @author kbsmith01
 */
public class GeneralizedContainers {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack s = new Stack();
        
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
        
        // Generic container examples with Box<template>
        System.out.println("\nBox exercises.\n");
        
        Box<String> stringBox = new Box("");
        Box<Integer> intBox = new Box(1);
        // Put box in box, but need type
        Box<Box<String>> boxInBox= new Box("");
        
        Box boxes[] = new Box[5];
        
        boxes[0] = stringBox;
        boxes[1] = intBox;
        
        ArrayList<Box<String>> stooges = new ArrayList();
        
        stooges.add(new Box("Larry"));
        stooges.add(new Box("Curley"));
        stooges.add(new Box("Moe"));
        
        stooges.set(2, new Box("Shemp"));
        
        for(int i = 0 ; i < stooges.size() ; i++) {
            System.out.println(stooges.get(i).getContents());
        }
        
        System.out.println();
        
        stooges.add(1, new Box("Moe"));
        
        for(int i = 0 ; i < stooges.size() ; i++) {
            System.out.println(stooges.get(i).getContents());
        }
        
        System.out.println();
        
        System.out.println(stooges.remove(0).getContents());
        
        System.out.println();
        
        for(int i = 0 ; i < stooges.size() ; i++) {
            System.out.println(stooges.get(i).getContents());
        }
    }
    
}
