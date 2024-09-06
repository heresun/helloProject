package com.sky.helloBoot;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder("d");
        ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("Hello World! ");
        System.out.println("更新1");
        System.out.println("更新2");
        System.out.println("更新3");
        System.out.println("更新4");
        System.out.println("更新5");
        System.out.println("更新6");
        System.out.println("更新7");
    }
}
