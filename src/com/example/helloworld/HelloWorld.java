package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        Product product = new Product("This is my first project");

        System.out.println(product.getName());
    }
}
