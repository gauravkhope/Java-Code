package javaCode;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class topic1 {

    static void main(String[] args) {
        // question 1
   String sentence = "Java is Coding Language" ;
    String [] words = sentence.split("") ;
    String reverse = "" ;
    for(int i =words.length-1 ; i >=0 ; i--){
            reverse += words[i];
        }
       // System.out.println(reverse);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your WORD : ");
        String word = sc.next();
        String reverse1 = "" ;
        for(int i = word.length()-1 ; i >= 0 ; i--){
            reverse1 += word.charAt(i) ;
        }
        if (word.equals(reverse1)){
            System.out.println("word is pelindrome");
        }
        else{
            System.out.println("word is not pelindrome");
        }
    }

    // question 2



}
