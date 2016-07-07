package edu.acc.java;


import java.util.Random;

    //...
public class RandomLetter {
public char ran() {
    Random r = new Random();

    String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return(alphabet.charAt(r.nextInt(alphabet.length())));
    } 
}