package javaCode;

import java.util.Arrays;

public class topic1 {
    static void main(String[] args) {
   String sentence = "Java is Coding Language" ;
    String [] words = sentence.split("") ;
    String reverse = "" ;
    for(int i =words.length-1 ; i >=0 ; i--){
            reverse += words[i];
        }
        System.out.println(reverse);
    }
}
