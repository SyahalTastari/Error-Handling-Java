package com.tutorial;

public class tambahDua {
    public static void main(String[] args) {
        byte[] b = new byte[5];
        System.out.print("Input Bilangan Bulat : ");
        try {
            System.in.read(b);
        } catch (java.io.IOException e) {
            System.err.println(e);
        }
        String a = new String(b).trim();
        int N = Integer.valueOf(a);
        System.out.println("Sebelum di Tambahkan : " + N  );
        System.out.println("Sesudah di Tambah Dua : " + (N + 2));
    }
}
