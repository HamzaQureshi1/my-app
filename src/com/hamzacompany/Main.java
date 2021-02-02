package com.hamzacompany;

import com.hamzacompany.model.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Product product = new Product("Keyboard");
        System.out.println(product.getName());
    }

}
