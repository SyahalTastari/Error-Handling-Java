package com.tutorial;

public class inisial {
    public static void main(String[] args)
    {
        try {
            System.out.print("Masukan nama : ");
            int n =  System.in.read();
            System.out.println("Inisial depan : " + (char) n);
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
