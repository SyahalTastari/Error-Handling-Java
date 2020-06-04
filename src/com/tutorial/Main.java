package com.tutorial;

public class Main {
    public static void main(String[] args){
        System.out.println("Sebelum pembagian");
        try{
            System.out.println(10/0);
        }catch (Throwable t){
            System.err.print("Terjadi Kesalahan");
            System.err.println(t.getMessage());
        }
        System.err.println("Sesudah di bagi");
    }
}
