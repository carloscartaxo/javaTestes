package org.example;

import java.util.List;
import java.util.function.Consumer;
 
public class Main {
    
    public static Integer tamanhoString (String str){
        int length = str.length();
        System.out.println(length);
        return length;
    }
    
    public static void main(String[] args) {

        List<String> stringList = List.of("Carlos", "Maria", "João", "Pedro", "Ana");


        stringList.forEach(Main::tamanhoString);

    }
}