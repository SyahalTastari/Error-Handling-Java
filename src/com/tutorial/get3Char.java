package com.tutorial;

public class get3Char {
    public static void main(String[] args)
    {
        byte[] b = new byte[5];
        try {
            System.in.read(b);
            System.out.println("Hasil : " + (char) b[0] + (char) b[1] + (char) b[2]);
        }catch (java.io.IOException e) {
            System.err.print(e);
        }
    }
}
